package com.jd.appstore.gateway.web.action;

import com.google.gson.Gson;
import com.jd.appstore.gateway.domain.dao.ActivetionLog;
import com.jd.appstore.gateway.domain.dao.MarketErrorLog;
import com.jd.appstore.gateway.domain.obj.ActivationJSON;
import com.jd.appstore.gateway.domain.obj.ActivationObj;
import com.jd.appstore.gateway.domain.response.ActivationRes;
import com.jd.appstore.gateway.domain.util.GatewayPath;
import com.jd.appstore.gateway.job.ActivetionJob;
import com.jd.appstore.gateway.service.ActivationService;
import com.jd.common.struts.action.BaseAction;
import com.jd.common.web.result.Result;
import org.apache.struts2.json.JSONException;
import org.apache.struts2.json.JSONUtil;

import java.io.*;
import java.util.Calendar;


/**
 * Created by YYF on 2014/9/29.
 */
public class ActivationAction extends BaseAction {

    private ActivationService activationService;
    private ActivationRes activationRes;
    private String mess;
    private String appid;
    private File uploadFile;

    private Integer id;

    private ActivetionJob activetionJob;

    private GatewayPath paths;

    public String createActivation() {
        try {
            //获取HTTP请求的输入流
            //已HTTP请求输入流建立一个BufferedReader对象
            BufferedReader br = request.getReader();
            String buffer = null;
            StringBuffer buff = new StringBuffer();
            while ((buffer = br.readLine()) != null) {
                buff.append(buffer + "\n");
            }
            br.close();
            Gson gson = new Gson();
            ActivationObj activationObj = gson.fromJson(buff.toString(), ActivationObj.class);
            activationRes = activationService.createActivation(activationObj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "activation";
    }


    public String activetion() {
        Result result = activationService.appName(appid);
        toVm(result);
        return SUCCESS;
    }

    /**
     * 解析激活数据
     *
     * @return
     */
    public void uploadFile() throws IOException, JSONException {
        ActivationJSON activationJSON = new ActivationJSON();
        try {
            if (appid != null) {
                InputStream in = new FileInputStream(uploadFile);
                Calendar cal = Calendar.getInstance();
                String path = paths.getActiveFile() + "/" + cal.get(Calendar.YEAR) + "/" + cal.get(Calendar.MONTH);
                File salersLogDir = new File(path);
                long nowTime = System.currentTimeMillis();
                if (!salersLogDir.exists() || !salersLogDir.isDirectory()) {
                    salersLogDir.mkdirs();
                }
                File uploadFile = new File(path, nowTime + "");
                OutputStream out = new FileOutputStream(uploadFile);
                byte[] buffer = new byte[1024 * 1024];
                int length;
                while ((length = in.read(buffer)) > 0) {
                    out.write(buffer, 0, length);
                }
                in.close();
                out.close();
                String filePath = path + "/" + nowTime;
                File file = new File(filePath);
                if (file.exists() && file.length() > 0) {
                    ActivetionLog activetionLog = new ActivetionLog();
                    activetionLog.setAppid(appid);
                    Integer id = activationService.createActiveLog(activetionLog);
                    if (id != null) {
                        activetionJob.setAppId(appid);
                        activetionJob.setId(id);
                        activetionJob.setFileName(filePath);
                        Thread thread = new Thread(activetionJob);
                        thread.start();
                        activationJSON.setStatus(1);
                        activationJSON.setId(id);
                        activationJSON.setMess("激活数据开始导入！");
                    } else {
                        activationJSON.setStatus(0);
                        activationJSON.setMess("系统异常请重试！");
                    }
                }
            } else {
                activationJSON.setStatus(0);
                activationJSON.setMess("应用appid不能为空");
            }
        } catch (Exception ex) {
            activationJSON.setStatus(0);
            activationJSON.setMess("系统异常请重试！");
            ex.printStackTrace();
        }
        String json = JSONUtil.serialize(activationJSON);
        response.setCharacterEncoding("utf-8");
        response.getWriter().write(json);
    }

    public void getActionLog() throws JSONException, IOException {
        ActivetionLog activetionLog = activationService.getActiveLog(id);
        String json = JSONUtil.serialize(activetionLog);
        response.setCharacterEncoding("utf-8");
        response.getWriter().write(json);
    }

    public void setActivationService(ActivationService activationService) {
        this.activationService = activationService;
    }

    public ActivationRes getActivationRes() {
        return activationRes;
    }

    public void setActivationRes(ActivationRes activationRes) {
        this.activationRes = activationRes;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public void setActivetionJob(ActivetionJob activetionJob) {
        this.activetionJob = activetionJob;
    }

    public void setPaths(GatewayPath paths) {
        this.paths = paths;
    }

    public File getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(File uploadFile) {
        this.uploadFile = uploadFile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
