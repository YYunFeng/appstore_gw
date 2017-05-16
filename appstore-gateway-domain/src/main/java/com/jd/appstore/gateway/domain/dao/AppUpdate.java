package com.jd.appstore.gateway.domain.dao;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-19
 * Time: 上午11:08
 * To change this template use File | Settings | File Templates.
 */
public class AppUpdate {
    private Integer appId;
    private Integer detailsId;
    private String appName;
    private String appVersion;
    private Integer appVersionCode;
    private String appPackage;
    private String logoUrl;
    private Integer pkgSize;
    private Date pubTime;
    private Integer price;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAppPackage() {
        return appPackage;
    }

    public void setAppPackage(String appPackage) {
        this.appPackage = appPackage;
    }

    public Date getPubTime() {
        return pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

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

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public Integer getAppVersionCode() {
        return appVersionCode;
    }

    public void setAppVersionCode(Integer appVersionCode) {
        this.appVersionCode = appVersionCode;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Integer getPkgSize() {
        return pkgSize;
    }

    public void setPkgSize(Integer pkgSize) {
        this.pkgSize = pkgSize;
    }

}
