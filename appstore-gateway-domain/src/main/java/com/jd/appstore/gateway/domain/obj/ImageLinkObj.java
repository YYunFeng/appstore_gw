package com.jd.appstore.gateway.domain.obj;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-20
 * Time: 下午2:07
 * To change this template use File | Settings | File Templates.
 */
public class ImageLinkObj {

    private Integer appId;
    /**
     * 链接类型，取值参见数据库-推广内容表定义。
     */
    private Integer lt;
    /**
     * 链接目标id
     */
    private Integer lid;
    /**
     * 链接完整URL
     */
    private String lurl;

    /**
     * 主图完整URL
     */
    private String logo;
    /**
     * 价格，以分为单位，客户端负责显示格式转换。
     */
    private Integer price;
    /**
     * 评级
     */
    private Integer star;
    /**
     * 应用类型，具体含义见数据库定义。
     */
    private Integer at;
    /**
     * 应用/专辑 简介
     */
    private String intro;


    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getLt() {
        return lt;
    }

    public void setLt(Integer lt) {
        this.lt = lt;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getLurl() {
        return lurl;
    }

    public void setLurl(String lurl) {
        this.lurl = lurl;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Integer getAt() {
        return at;
    }

    public void setAt(Integer at) {
        this.at = at;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }
}
