package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.LogStatusRes;
import com.jd.appstore.gateway.domain.util.GatewayPath;
import com.jd.appstore.gateway.job.SalerLogJob;
import com.jd.common.struts.action.BaseAction;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.Calendar;

/**
 * YYF on 2015/4/7.
 */
public class SalerLogAction extends BaseAction {

    private File uplodafile;
    private String uplodafileFileName;
    private GatewayPath paths;
    private LogStatusRes logStatusRes;
    private SalerLogJob salerLogJob;

    Logger logger = Logger.getLogger(this.getClass());

    public String salerLog() {
        logStatusRes = new LogStatusRes();
        try {
            InputStream in = new FileInputStream(uplodafile);
            Calendar cal = Calendar.getInstance();
            String path = paths.getNewLogsPath() + "/" + cal.get(Calendar.YEAR) + "/" + (cal.get(Calendar.MONTH) + 1);
            File salersLogDir = new File(path);
            long nowTime = System.currentTimeMillis();
            if (!salersLogDir.exists() || !salersLogDir.isDirectory()) {
                salersLogDir.mkdirs();
                logger.info("log目录不存在，创建目录：" + path);
            }
            File uploadFile = new File(path, this.getUplodafileFileName() + "_" + nowTime);
            OutputStream out = new FileOutputStream(uploadFile);
            byte[] buffer = new byte[1024 * 1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            in.close();
            out.close();
            String filePath = path + "/" + this.getUplodafileFileName() + "_" + nowTime;
            File file = new File(filePath);
            if (file.exists() && file.length() > 0) {
                logger.info("文件上传成功,路径：" + filePath);
                salerLogJob.setFileName(filePath);
                logStatusRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
                Thread thread = new Thread(salerLogJob);
                thread.start();
            } else {
                logStatusRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
                logger.error("保存日志失败");
            }
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

    public String getUplodafileFileName() {
        return uplodafileFileName;
    }

    public void setUplodafileFileName(String uplodafileFileName) {
        this.uplodafileFileName = uplodafileFileName;
    }

    public GatewayPath getPaths() {
        return paths;
    }

    public void setPaths(GatewayPath paths) {
        this.paths = paths;
    }

    public LogStatusRes getLogStatusRes() {
        return logStatusRes;
    }

    public void setLogStatusRes(LogStatusRes logStatusRes) {
        this.logStatusRes = logStatusRes;
    }

    public SalerLogJob getSalerLogJob() {
        return salerLogJob;
    }

    public void setSalerLogJob(SalerLogJob salerLogJob) {
        this.salerLogJob = salerLogJob;
    }
}
