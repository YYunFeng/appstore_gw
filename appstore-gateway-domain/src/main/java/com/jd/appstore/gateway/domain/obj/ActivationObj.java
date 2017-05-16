package com.jd.appstore.gateway.domain.obj;

import com.jd.appstore.gateway.domain.dao.PhoneImeis;

import java.util.List;

/**
 * Created by YYF on 2014/9/29.
 */
public class ActivationObj {

    private String appid;
    private List<PhoneImeis> phoneImeiObjs;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public List<PhoneImeis> getPhoneImeiObjs() {
        return phoneImeiObjs;
    }

    public void setPhoneImeiObjs(List<PhoneImeis> phoneImeiObjs) {
        this.phoneImeiObjs = phoneImeiObjs;
    }
}
