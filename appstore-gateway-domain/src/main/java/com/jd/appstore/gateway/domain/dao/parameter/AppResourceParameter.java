package com.jd.appstore.gateway.domain.dao.parameter;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-19
 * Time: 上午10:48
 * To change this template use File | Settings | File Templates.
 */
public class AppResourceParameter {
    private Integer appId;
    private Integer detailsId;

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(Integer detailsId) {
        this.detailsId = detailsId;
    }
}
