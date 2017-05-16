package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.LogStatusRes;
import com.jd.appstore.gateway.domain.util.GatewayPath;
import com.jd.appstore.gateway.job.MarketingLogJob;
import com.jd.common.struts.action.BaseAction;
import org.apache.log4j.Logger;
import org.apache.struts2.json.JSONException;

import java.io.*;

/**
 * Created by YUNFENG on 14-3-11.
 */
public class ExceptionLogAction extends BaseAction {
    private File uplodafile;
    private GatewayPath paths;
    private String uplodafileFileName;
    private LogStatusRes logStatusRes;
    private MarketingLogJob marketingLogJob;

    Logger logger = Logger.getLogger(this.getClass());

    public String addExceptionLogs() {
        return SUCCESS;
    }

    public String exceptionLogUpload() throws IOException, JSONException {
        logStatusRes = new LogStatusRes();
        logger.info("上次异常信息文件");
        try {
            InputStream in = new FileInputStream(uplodafile);
            File salersLogDir = new File(paths.getExceptionPath());
            long nowTime = System.currentTimeMillis();
            if (!salersLogDir.exists() || !salersLogDir.isDirectory()) {
                salersLogDir.mkdir();
                logger.info("log目录不存在，创建目录：" + paths.getExceptionPath());
            }
            File uploadFile = new File(paths.getExceptionPath(), this.getUplodafileFileName() + "_" + nowTime);
            OutputStream out = new FileOutputStream(uploadFile);
            byte[] buffer = new byte[1024 * 1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            in.close();
            out.close();
            logStatusRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
            String filePath = paths.getLogsPath() + "/" + this.getUplodafileFileName() + "_" + nowTime;
            logger.info("文件上传成功,路径：" + filePath);
        } catch (Exception ex) {
            logger.error("上传异常文件错误:" + ex.getMessage());
            logStatusRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
        }
        return "status";
    }


    public File getUplodafile() {
        return uplodafile;
    }

    public void setUplodafile(File uplodafile) {
        this.uplodafile = uplodafile;
    }

    public GatewayPath getPaths() {
        return paths;
    }

    public void setPaths(GatewayPath paths) {
        this.paths = paths;
    }

    public String getUplodafileFileName() {
        return uplodafileFileName;
    }

    public void setUplodafileFileName(String uplodafileFileName) {
        this.uplodafileFileName = uplodafileFileName;
    }

    public LogStatusRes getLogStatusRes() {
        return logStatusRes;
    }

    public void setLogStatusRes(LogStatusRes logStatusRes) {
        this.logStatusRes = logStatusRes;
    }

    public MarketingLogJob getMarketingLogJob() {
        return marketingLogJob;
    }

    public void setMarketingLogJob(MarketingLogJob marketingLogJob) {
        this.marketingLogJob = marketingLogJob;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
