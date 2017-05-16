package com.jd.appstore.gateway.domain.dao;

/**
 * Created with IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-10-31
 * Time: 下午7:43
 * To change this template use File | Settings | File Templates.
 */
public class AppDownloadUrl {

    private String url;
    private Integer appVersionCode;
    private String packageName;
    private Integer zhuowangMark;

    public Integer getZhuowangMark() {
        return zhuowangMark;
    }

    public void setZhuowangMark(Integer zhuowangMark) {
        this.zhuowangMark = zhuowangMark;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getAppVersionCode() {
        return appVersionCode;
    }

    public void setAppVersionCode(Integer appVersionCode) {
        this.appVersionCode = appVersionCode;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
}
