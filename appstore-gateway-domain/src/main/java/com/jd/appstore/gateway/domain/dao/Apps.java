package com.jd.appstore.gateway.domain.dao;

/**
 * User: YUNFENG
 * Date: 13-11-20
 * Time: 下午4:10
 * To change this template use File | Settings | File Templates.
 */
public class Apps {
    private String packageName;
    private Integer zhuowangMark;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Integer getZhuowangMark() {
        return zhuowangMark;
    }

    public void setZhuowangMark(Integer zhuowangMark) {
        this.zhuowangMark = zhuowangMark;
    }
}
