package com.jd.appstore.gateway.domain.dao;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-8-24
 * Time: 下午6:04
 * To change this template use File | Settings | File Templates.
 */
public class RelatedRecommendApp {

    private Integer appId;
    private String cpName;
    private String appName;
    private String logoUrl;
    private Integer isAppLogo;

    public boolean isAppLogo() {
        if (isAppLogo != null) {
            //是主图
            if (isAppLogo.intValue() == 1)
                return true;
            //是截图
            if (isAppLogo.intValue() == 0)
                return false;
        }
        return false;
    }

    public Integer getIsAppLogo() {
        return isAppLogo;
    }

    public void setIsAppLogo(Integer appLogo) {
        isAppLogo = appLogo;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }
}
