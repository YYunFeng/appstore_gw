package com.jd.appstore.gateway.web.action;

import com.google.gson.Gson;
import com.jd.appstore.gateway.domain.obj.ReportCount;
import com.jd.appstore.gateway.domain.response.LogStatusRes;
import com.jd.appstore.gateway.service.CountAppService;
import com.jd.common.struts.action.BaseAction;
import org.apache.commons.lang.StringUtils;

/**
 * Created by YYF on 14-5-27.
 */
public class ReportCountAction extends BaseAction {
    private LogStatusRes logStatusRes;

    private CountAppService countAppService;
    private String message;

    public String reportCount() {
        if (StringUtils.isNotBlank(message)) {
            Gson gson = new Gson();
            ReportCount reportCount = gson.fromJson(message, ReportCount.class);
            logStatusRes = countAppService.reportCount(reportCount);
        }
        return "status";
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LogStatusRes getLogStatusRes() {
        return logStatusRes;
    }

    public void setLogStatusRes(LogStatusRes logStatusRes) {
        this.logStatusRes = logStatusRes;
    }


    public void setCountAppService(CountAppService countAppService) {
        this.countAppService = countAppService;
    }
}
