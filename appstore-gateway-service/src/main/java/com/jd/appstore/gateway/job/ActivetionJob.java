package com.jd.appstore.gateway.job;

import com.jd.appstore.gateway.domain.dao.Activation;
import com.jd.appstore.gateway.domain.dao.ActivetionLog;
import com.jd.appstore.gateway.service.ActivationService;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.dao.DataIntegrityViolationException;

import java.io.*;

/**
 * YYF on 2015-05-31.
 */
public class ActivetionJob implements Runnable {


    Logger logger = Logger.getLogger(this.getClass());

    private String fileName;
    private String appId;
    private Integer id;

    private ActivationService activationService;

    public void run() {
        logger.info("解析激活数据开始开始");
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
            int counts = 0;
            int succussCounts = 0;
            ActivetionLog activetionLog = new ActivetionLog();
            try {
                while ((line = br.readLine()) != null) {
                    String[] strings = line.split(",");
                    if (strings != null && strings.length > 0) {
                        counts = counts + 1;
                        Activation activation = new Activation();
                        if (StringUtils.isNotBlank(strings[0]) && StringUtils.isNotBlank(strings[1])) {
                            activation.setPhoneImei(strings[0].trim());
                            activation.setAppid(appId);
                            activation.setActivationTime(strings[1] + " 00:00:00");
                            try {
                                activationService.createActive(activation);
                                succussCounts = succussCounts + 1;
                            } catch (DataIntegrityViolationException ex) {
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                logger.error("解析日志失败:" + e.toString());
            }
            activetionLog.setLength(counts);
            activetionLog.setCounts(succussCounts);
            activetionLog.setFilePath(fileName);
            activetionLog.setId(id);
            activationService.updateActiveLog(activetionLog);
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setActivationService(ActivationService activationService) {
        this.activationService = activationService;
    }
}
