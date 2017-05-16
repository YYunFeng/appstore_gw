package com.jd.appstore.gateway.domain.dao;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-12
 * Time: 上午11:03
 * To change this template use File | Settings | File Templates.
 */
public class Recommend {
    private Integer clientType;
    private Integer moduleId;
    private Integer areaId;
    private Integer seq;
    private String url;
    private Integer linkType;
    private Integer linkedAppId;
    private String linkedUrl;
    private Integer homeAreaType;
    private Integer homeAreaPos;
    private Integer homeAreaId;
    private String intro;
    private Integer isAppLogo;

    public boolean isAppLogo() {
        if (isAppLogo != null) {
            if (isAppLogo.intValue() == 1) {
                return true;
            }
        }
        return false;
    }

    public void setIsAppLogo(Integer isAppLogo) {
        this.isAppLogo = isAppLogo;
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getLinkedUrl() {
        return linkedUrl;
    }

    public void setLinkedUrl(String linkedUrl) {
        this.linkedUrl = linkedUrl;
    }

    public Integer getHomeAreaType() {
        return homeAreaType;
    }

    public void setHomeAreaType(Integer homeAreaType) {
        this.homeAreaType = homeAreaType;
    }

    public Integer getHomeAreaPos() {
        return homeAreaPos;
    }

    public void setHomeAreaPos(Integer homeAreaPos) {
        this.homeAreaPos = homeAreaPos;
    }

    public Integer getHomeAreaId() {
        return homeAreaId;
    }

    public void setHomeAreaId(Integer homeAreaId) {
        this.homeAreaId = homeAreaId;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
