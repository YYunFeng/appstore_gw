package com.jd.appstore.gateway.domain.dao;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-8-29
 * Time: 下午5:10
 * To change this template use File | Settings | File Templates.
 */
public class DownloadStat {
    private Integer appId;
    private Integer downloadTimes;

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getDownloadTimes() {
        return downloadTimes;
    }

    public void setDownloadTimes(Integer downloadTimes) {
        this.downloadTimes = downloadTimes;
    }
}
