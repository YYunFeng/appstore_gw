package com.jd.appstore.gateway.domain.dao;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-21
 * Time: 下午6:20
 * To change this template use File | Settings | File Templates.
 */
public class HomeInfo {
    private Integer homeAreaType;
    private Integer linkType;
    private Integer linkedAppId;
    private String url;
    private String intro;
    private Integer homeAreaId;
    private Integer isAppLogo;

    public boolean isAppLogo() {
        if (isAppLogo != null) {
            if (isAppLogo.intValue() == 1) {
                return true;
            }
        }
        return false;
    }

    public void setAppLogo(Integer appLogo) {
        isAppLogo = appLogo;
    }

    public Integer getHomeAreaId() {
        return homeAreaId;
    }

    public void setHomeAreaId(Integer homeAreaId) {
        this.homeAreaId = homeAreaId;
    }

    public Integer getHomeAreaType() {
        return homeAreaType;
    }

    public void setHomeAreaType(Integer homeAreaType) {
        this.homeAreaType = homeAreaType;
    }

    public Integer getLinkType() {
        return linkType;
    }

    public void setLinkType(Integer linkType) {
        this.linkType = linkType;
    }

    public Integer getLinkedAppId() {
        return linkedAppId;
    }

    public void setLinkedAppId(Integer linkedAppId) {
        this.linkedAppId = linkedAppId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
