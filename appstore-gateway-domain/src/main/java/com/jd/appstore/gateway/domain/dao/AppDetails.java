package com.jd.appstore.gateway.domain.dao;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-7
 * Time: 下午2:44
 * To change this template use File | Settings | File Templates.
 */
public class AppDetails {

    private String cpName;
    private Integer appId;
    private String appName;
    private Integer defaultDetailId;
    private String appVersion;
    private String logoUrl;
    private Integer categoryId1;
    private Integer categoryId2;
    private Integer pkgSize;
    private Integer price;
    private Date pubTime;
    private String appIntroduce;
    private String categoryName;
    private String osVersionName;
    private Integer isAppLogo;
    private Integer zhuoWangMark;

    public Integer getZhuoWangMark() {
        return zhuoWangMark;
    }

    public void setZhuoWangMark(Integer zhuoWangMark) {
        this.zhuoWangMark = zhuoWangMark;
    }

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

    public void setIsAppLogo(Integer appLogo) {
        isAppLogo = appLogo;
    }

    public Integer getCategoryId1() {
        return categoryId1;
    }

    public void setCategoryId1(Integer categoryId1) {
        this.categoryId1 = categoryId1;
    }

    public Integer getCategoryId2() {
        return categoryId2;
    }

    public void setCategoryId2(Integer categoryId2) {
        this.categoryId2 = categoryId2;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getOsVersionName() {
        return osVersionName;
    }

    public void setOsVersionName(String osVersionName) {
        this.osVersionName = osVersionName;
    }

    public Date getPubTime() {
        return pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Integer getDefaultDetailId() {
        return defaultDetailId;
    }

    public void setDefaultDetailId(Integer defaultDetailId) {
        this.defaultDetailId = defaultDetailId;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
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

    public String getAppIntroduce() {
        return appIntroduce;
    }

    public void setAppIntroduce(String appIntroduce) {
        this.appIntroduce = appIntroduce;
    }
}
