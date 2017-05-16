package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.ExceptionLogRes;
import com.jd.appstore.gateway.service.ExceptionLogService;
import com.jd.common.struts.action.BaseAction;

import javax.servlet.ServletInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * User: YUNFENG
 * Date: 13-11-20
 * Time: 上午11:34
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionAction extends BaseAction {
    private ExceptionLogService exceptionLogService;
    private ExceptionLogRes exceptionLogRes;
    private String padImei;
    private String saler;
    private String exceptionMess;
    private Integer exceptionType;

    public String reportExceptionLog() {
        try {
            if (exceptionMess == null) {
                BufferedReader br = new BufferedReader(new InputStreamReader((ServletInputStream) request.getInputStream()));
                String line = null;
                StringBuilder sb = new StringBuilder();
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                }
                exceptionMess = sb.toString();
            }
            exceptionLogRes = exceptionLogService.createdExceptionLog(padImei, saler, exceptionType, exceptionMess);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "reportExceptionLog";
    }

    public void setExceptionLogService(ExceptionLogService exceptionLogService) {
        this.exceptionLogService = exceptionLogService;
    }

    public String getPadImei() {
        return padImei;
    }

    public void setPadImei(String padImei) {
        this.padImei = padImei;
    }

    public String getSaler() {
        return saler;
    }

    public void setSaler(String saler) {
        this.saler = saler;
    }

    public String getExceptionMess() {
        return exceptionMess;
    }

    public void setExceptionMess(String exceptionMess) {
        this.exceptionMess = exceptionMess;
    }

    public ExceptionLogRes getExceptionLogRes() {
        return exceptionLogRes;
    }

    public void setExceptionLogRes(ExceptionLogRes exceptionLogRes) {
        this.exceptionLogRes = exceptionLogRes;
    }

    public Integer getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(Integer exceptionType) {
        this.exceptionType = exceptionType;
    }
}
