package com.jd.appstore.gateway.domain.dao;

/**
 * Created by YYF on 2014/9/29.
 */
public class Activation {
    private String phoneImei;
    private String activationTime;
    private String appid;

    public String getPhoneImei() {
        return phoneImei;
    }

    public void setPhoneImei(String phoneImei) {
        this.phoneImei = phoneImei;
    }

    public String getActivationTime() {
        return activationTime;
    }

    public void setActivationTime(String activationTime) {
        this.activationTime = activationTime;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }
}
