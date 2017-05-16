package com.jd.appstore.gateway.domain.dao;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-12
 * Time: 下午4:52
 * To change this template use File | Settings | File Templates.
 */
public class Ranking {

    private Integer appId;
    private String AppName;
    private String logoUrl;
    private String categoryName;
    private String appIntroduce;
    private String cpName;
    private Integer zhuoWangMark;
    private String packageName;
    private String downPath;
    private Integer isAppLogo;
    private String appVersion;

    /**
     * 安装包大小
     */
    private Integer pkgSize;

    private String apkCode;
    private String md5;

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getApkCode() {
        return apkCode;
    }

    public void setApkCode(String apkCode) {
        this.apkCode = apkCode;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

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


    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName;
    }

    public String getAppIntroduce() {
        return appIntroduce;
    }

    public void setAppIntroduce(String appIntroduce) {
        this.appIntroduce = appIntroduce;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return AppName;
    }

    public void setAppName(String appName) {
        AppName = appName;
    }

    public String getDownPath() {
        return downPath;
    }

    public void setDownPath(String downPath) {
        this.downPath = downPath;
    }

    public Integer getPkgSize() {
        return pkgSize;
    }

    public void setPkgSize(Integer pkgSize) {
        this.pkgSize = pkgSize;
    }


    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
}
