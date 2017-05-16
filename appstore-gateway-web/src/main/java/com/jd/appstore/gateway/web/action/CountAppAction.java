package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.CountAppRes;
import com.jd.appstore.gateway.service.CountAppService;
import com.jd.common.struts.action.BaseAction;

/**
 * Created by YUNFENG on 14-2-11.
 */
public class CountAppAction extends BaseAction {
    private CountAppService countAppService;
    private CountAppRes countAppRes;
    private String phoneImei;
    private String appid;

    public String CountApp() {
        countAppRes = countAppService.createCountApp(phoneImei, appid);
        return "createCountApp";
    }


    public CountAppRes getCountAppRes() {
        return countAppRes;
    }

    public void setCountAppRes(CountAppRes countAppRes) {
        this.countAppRes = countAppRes;
    }

    public void setCountAppService(CountAppService countAppService) {
        this.countAppService = countAppService;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getPhoneImei() {
        return phoneImei;
    }

    public void setPhoneImei(String phoneImei) {
        this.phoneImei = phoneImei;
    }
}

