package com.jd.appstore.gateway.domain.dao;

import java.util.Date;

/**
 * Created by YUNFENG on 14-2-11.
 */
public class CountApp {
    private String phoneImei;
    private String appid;
    private Date created;

    public String getPhoneImei() {
        return phoneImei;
    }

    public void setPhoneImei(String phoneImei) {
        this.phoneImei = phoneImei;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
