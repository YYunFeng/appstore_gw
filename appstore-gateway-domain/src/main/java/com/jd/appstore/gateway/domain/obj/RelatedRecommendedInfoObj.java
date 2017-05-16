package com.jd.appstore.gateway.domain.obj;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-8
 * Time: 下午6:48
 * To change this template use File | Settings | File Templates.
 */
public class RelatedRecommendedInfoObj {
    
    private Integer appId;
    private String appName;
    private String cpName;
    private Integer star;
    private Long price;
    private String logo;

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
