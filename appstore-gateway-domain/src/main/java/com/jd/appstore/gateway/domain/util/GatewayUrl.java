package com.jd.appstore.gateway.domain.util;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-19  g
 * Time: 上午8:33
 * To change this template use File | Settings | File Templates.
 */
public class GatewayUrl {

    public String logoUrl;
    public String imgUrl;
    public String apkUrl;
    public String suningApkUrl;

    public String getSuningApkUrl() {
        return suningApkUrl;
    }

    public void setSuningApkUrl(String suningApkUrl) {
        this.suningApkUrl = suningApkUrl;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getApkUrl() {
        return apkUrl;
    }

    public void setApkUrl(String apkUrl) {
        this.apkUrl = apkUrl;
    }
}
