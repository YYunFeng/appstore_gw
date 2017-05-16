package com.jd.appstore.gateway.domain.obj;

/**
 * Created by YUNFENG on 13-12-16.
 */
public class CollectUpdateObj {
    private String appid;
    private Integer delete;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }
}
