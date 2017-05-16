package com.jd.appstore.gateway.job;

import com.jd.appstore.gateway.domain.dao.MarketErrorLog;
import com.jd.appstore.gateway.domain.dao.parameter.AppSaleLogParameter;
import com.jd.appstore.gateway.service.MarketingLogServerice;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 13-1-30
 * Time: 上午11:16
 * To change this template use File | Settings | File Templates.
 */
public class MarketingLogJob implements Runnable {
    private MarketingLogServerice marketingLogServerice;
    Logger logger = Logger.getLogger(this.getClass());
    private String fileName;

    public void run() {
        logger.info("营销日志入库线程启动");
        File logFile = new File(fileName);
        // 日志文件入库
        if (logFile.exists() && logFile.isFile()) {
            BufferedReader br = null;
            try {
                br = new BufferedReader(new InputStreamReader(new FileInputStream(logFile), "UTF-8"));
            } catch (FileNotFoundException e) {
                logger.error("解析日志失败,日志文件不存在:" + e.getMessage());
            } catch (UnsupportedEncodingException ex) {
                logger.error("UnsupportedEncodingException：" + ex.getMessage());
            }
            String line = "";
            MarketErrorLog marketErrorLog = null;
            try {
                while ((line = br.readLine()) != null) {
                    AppSaleLogParameter appSaleLogParameter = new AppSaleLogParameter();
                    String[] logs = line.split(",");
                    int length = logs.length;
                    // 首先判断日志的长度，如果不为17则为错误
                    if (length != 17) {
                        marketErrorLog = new MarketErrorLog();
                        marketErrorLog.setErrorMess("字段数量错误：字段长度为:" + length);
                        marketErrorLog.setLogMess(line);
                        marketingLogServerice.createMalketingErrorLog(marketErrorLog);
                        logger.error("解析日志失败,字段数量错误:" + line);
                        continue;
                    }
                    if (length == 17) {  // 总共17个字段，取前16个字段，最后一个为APK验证码，不入库。
                        Boolean flag = true;
                        StringBuffer stringBuffer = new StringBuffer();
                        for (int i = 0; i < 16; i++) {
                            if (null == logs[i] || logs[i].equals("null") || logs[i].equals("")) {
                                // 不验证appveriosn ,手机厂商，手机型号
                                if (i == 8 || i == 9 || i == 14) {
                                } else {
                                    flag = false;
                                    stringBuffer.append("第" + i + "字段为空,");
                                }
                            }
                            // 由于i是从0开始计算，所以当循环16次的时候，i等于15
                            if (!flag && i == 15) { // 循环结束
                                marketErrorLog = new MarketErrorLog();
                                marketErrorLog.setErrorMess(stringBuffer.toString());
                                marketErrorLog.setLogMess(line);
                                marketingLogServerice.createMalketingErrorLog(marketErrorLog);
                            }
                        }
                        if (flag) {
                            appSaleLogParameter.setPadImei(logs[0]);
                            appSaleLogParameter.setLoginUser(logs[1]);
                            appSaleLogParameter.setSalerName(logs[2]);
                            appSaleLogParameter.setSalerNo(logs[3]);
                            appSaleLogParameter.setShopName(logs[4]);
                            appSaleLogParameter.setCid(Integer.valueOf(logs[5]));
                            appSaleLogParameter.setPhoneImei(logs[6]);
                            appSaleLogParameter.setPhoneOsVer(logs[7]);
                            if (StringUtils.isNotBlank(logs[8])) {
                                appSaleLogParameter.setPhoneVenderName(logs[8]);
                            } else {
                                appSaleLogParameter.setPhoneVenderName("unknow");
                            }
                            if (StringUtils.isNotBlank(logs[9])) {
                                appSaleLogParameter.setPhoneModelName(logs[9]);
                            } else {
                                appSaleLogParameter.setPhoneModelName("unknow");
                            }
                            appSaleLogParameter.setAppType(Integer.valueOf(logs[10]));
                            appSaleLogParameter.setInstallModel(Integer.valueOf(logs[11]));
                            appSaleLogParameter.setAppId(Integer.valueOf(logs[12]));
                            appSaleLogParameter.setCpid(Integer.valueOf(logs[13]));
                            if (StringUtils.isNotBlank(logs[14])) {
                                appSaleLogParameter.setAppVersionName(logs[14]);
                            } else {
                                appSaleLogParameter.setAppVersionName("unknow");
                            }
                            appSaleLogParameter.setInstallTime(logs[15]);
                            logger.info("营销日志解析成功：" + line);
                            marketingLogServerice.createMarketingLog(appSaleLogParameter);
                        }
                    }
                }
            } catch (Exception e) {
                logger.error("解析日志失败:" + e.toString());
            }
        } else {
            logger.error("营销日志不存在,路径：" + fileName);
        }
        logger.info("营销日志入库线程结束.");
    }


    public void setMarketingLogServerice(MarketingLogServerice marketingLogServerice) {
        this.marketingLogServerice = marketingLogServerice;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


}
