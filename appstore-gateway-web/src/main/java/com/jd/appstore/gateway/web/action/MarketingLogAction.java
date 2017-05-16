package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.dao.MarketErrorLog;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.LogStatusRes;
import com.jd.appstore.gateway.domain.util.GatewayPath;
import com.jd.appstore.gateway.job.MarketingLogJob;
import com.jd.common.struts.action.BaseAction;
import org.apache.log4j.Logger;
import org.apache.struts2.json.JSONException;

import java.io.*;
import java.util.Calendar;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 13-1-29
 * Time: 下午4:34
 * To change this template use File | Settings | File Templates.
 */
public class MarketingLogAction extends BaseAction {

    private File uplodafile;
    private GatewayPath paths;
    private String uplodafileFileName;
    private LogStatusRes logStatusRes;
    private MarketingLogJob marketingLogJob;

    Logger logger = Logger.getLogger(this.getClass());

    public String addLogs() {
        return SUCCESS;
    }

    public String createMaketingLog() throws IOException, JSONException {
        logStatusRes = new LogStatusRes();
        logger.info("createMaketingLog start");
        try {
            InputStream in = new FileInputStream(uplodafile);
            Calendar cal = Calendar.getInstance();
            String path = paths.getLogsPath() + "/" + cal.get(Calendar.YEAR) + "/" + cal.get(Calendar.MONTH);
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
                marketingLogJob.setFileName(filePath);
                logStatusRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
                Thread thread = new Thread(marketingLogJob);
                thread.start();
            } else {
                logStatusRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
                MarketErrorLog marketErrorLog = new MarketErrorLog();
                marketErrorLog.setErrorMess("文件保存失败");
            }
        } catch (Exception ex) {
            logger.error("上传异常文件错误:" + ex.getMessage());
            logStatusRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            MarketErrorLog marketErrorLog = new MarketErrorLog();
            marketErrorLog.setErrorMess("上传异常文件错误");
            marketErrorLog.setErrorMess(ex.getMessage());
        }
        return "status";
    }


    public String getUplodafileFileName() {
        return uplodafileFileName;
    }

    public void setUplodafileFileName(String uplodafileFileName) {
        this.uplodafileFileName = uplodafileFileName;
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

    public LogStatusRes getLogStatusRes() {
        return logStatusRes;
    }

    public void setLogStatusRes(LogStatusRes logStatusRes) {
        this.logStatusRes = logStatusRes;
    }

    public void setMarketingLogJob(MarketingLogJob marketingLogJob) {
        this.marketingLogJob = marketingLogJob;
    }
}
