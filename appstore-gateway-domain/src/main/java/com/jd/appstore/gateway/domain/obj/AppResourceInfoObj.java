package com.jd.appstore.gateway.domain.obj;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-8
 * Time: 下午6:22
 * To change this template use File | Settings | File Templates.
 */
public class AppResourceInfoObj {
    /**
     * 资源类型
     */
    private Integer resType;
    /**
     * 截图序号
     */
    private Integer capSeq;
    /**
     * 资源URL
     */
    private String url;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
