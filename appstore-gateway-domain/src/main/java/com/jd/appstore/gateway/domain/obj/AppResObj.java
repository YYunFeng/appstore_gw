package com.jd.appstore.gateway.domain.obj;

import java.util.List;

/**
 * Created by YYF on 14-5-19.
 */
public class AppResObj {
    private Integer appid;
    private String resUrl;
    private List<String> stringList;

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public String getResUrl() {
        return resUrl;
    }

    public void setResUrl(String resUrl) {
        this.resUrl = resUrl;
    }
}
