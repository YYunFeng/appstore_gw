package com.jd.appstore.gateway.domain.dao;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-13
 * Time: 下午9:49
 * To change this template use File | Settings | File Templates.
 */
public class AppResource {
    private Integer resType;
    private Integer capSeq;
    private String resUrl;
    private Integer zhuoWangMark;

    public Integer getZhuoWangMark() {
        return zhuoWangMark;
    }

    public void setZhuoWangMark(Integer zhuoWangMark) {
        this.zhuoWangMark = zhuoWangMark;
    }

    public Integer getResType() {
        return resType;
    }

    public void setResType(Integer resType) {
        this.resType = resType;
    }

    public Integer getCapSeq() {
        return capSeq;
    }

    public void setCapSeq(Integer capSeq) {
        this.capSeq = capSeq;
    }

    public String getResUrl() {
        return resUrl;
    }

    public void setResUrl(String resUrl) {
        this.resUrl = resUrl;
    }
}
