package com.jd.appstore.gateway.job;

import com.jd.appstore.gateway.domain.dao.parameter.SalerLogParameter;
import com.jd.appstore.gateway.service.MarketingLogServerice;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * YYF on 2015/4/7.
 */
public class SalerLogJob implements Runnable {
    private MarketingLogServerice marketingLogServerice;
    Logger logger = Logger.getLogger(this.getClass());
    private String fileName;

    public void run() {
        logger.info("促销员安装日志开始解析");
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
            try {
                SalerLogParameter salerLogParameter = null;
                Set<SalerLogParameter> set = new HashSet<SalerLogParameter>();
                while ((line = br.readLine()) != null) {
                    salerLogParameter = null;
                    String[] logs = line.split(",");
                    int length = logs.length;
                    if (length > 0 && length == 9) {
                        if (Integer.valueOf(logs[8]).intValue() == 0) {
                            salerLogParameter = new SalerLogParameter(logs[4].trim(), Integer.valueOf(logs[5]));
                            salerLogParameter.setDeviceNo(logs[0]);
                            salerLogParameter.setSalerNo(logs[1]);
                            salerLogParameter.setPhoneVenderName(logs[2]);
                            salerLogParameter.setPhoneModelName(logs[3]);
                            salerLogParameter.setInstallTime(logs[6]);
                            salerLogParameter.setPhoneOsVer(logs[7]);
                            set.add(salerLogParameter);
                        } else {
                            logger.info("在线日志：" + salerLogParameter.toString());
                            logger.error("在线日志，不记录");
                        }
                    } else {
                        logger.error("日志异常，无法入库,日志信息：" + line);
                    }
                }
                if (set != null && set.size() > 0) {
                    for (Iterator<SalerLogParameter> it = set.iterator(); it.hasNext(); ) {
                        marketingLogServerice.createSalerLog(it.next());
                    }
                }
            } catch (Exception e) {
                logger.error("解析日志失败:" + e.toString());
            }
        } else {
            logger.error("日志不存在,路径：" + fileName);
        }
        logger.info("促销员安装日志线程结束.");
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
