package com.jd.appstore.gateway.domain.dao.parameter;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 13-1-29
 * Time: 下午6:14
 * To change this template use File | Settings | File Templates.
 */
public class AppSaleLogParameter {
    private Integer id;
    private Integer cid;
    private Integer appType;  // 0:离线应用，1：在线应用
    private String padImei;
    private String loginUser;
    private String salerName;
    private String salerNo;
    private String shopName;
    private String phoneImei;
    //    IMSI号码
    private String phoneImsi;
    private String phoneOsVer;
    private String phoneVenderName;
    private String phoneModelName;
    private Integer installModel;
    private Integer appId;
    private Integer cpid;
    private String appVersionName;
    private String installTime;
    private Date created;
    private Date modified;


    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getPadImei() {
        return padImei;
    }

    public void setPadImei(String padImei) {
        this.padImei = padImei;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getSalerName() {
        return salerName;
    }

    public void setSalerName(String salerName) {
        this.salerName = salerName;
    }

    public String getSalerNo() {
        return salerNo;
    }

    public void setSalerNo(String salerNo) {
        this.salerNo = salerNo;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getPhoneImei() {
        return phoneImei;
    }

    public void setPhoneImei(String phoneImei) {
        this.phoneImei = phoneImei;
    }

    public String getPhoneOsVer() {
        return phoneOsVer;
    }

    public void setPhoneOsVer(String phoneOsVer) {
        this.phoneOsVer = phoneOsVer;
    }

    public String getPhoneVenderName() {
        return phoneVenderName;
    }

    public void setPhoneVenderName(String phoneVenderName) {
        this.phoneVenderName = phoneVenderName;
    }

    public String getPhoneModelName() {
        return phoneModelName;
    }

    public void setPhoneModelName(String phoneModelName) {
        this.phoneModelName = phoneModelName;
    }

    public Integer getInstallModel() {
        return installModel;
    }

    public void setInstallModel(Integer installModel) {
        this.installModel = installModel;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getCpid() {
        return cpid;
    }

    public void setCpid(Integer cpid) {
        this.cpid = cpid;
    }

    public String getAppVersionName() {
        return appVersionName;
    }

    public void setAppVersionName(String appVersionName) {
        this.appVersionName = appVersionName;
    }

    public String getInstallTime() {
        return installTime;
    }

    public void setInstallTime(String installTime) {
        this.installTime = installTime;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getPhoneImsi() {
        return phoneImsi;
    }

    public void setPhoneImsi(String phoneImsi) {
        this.phoneImsi = phoneImsi;
    }

    @Override
    public String toString() {
        return "AppSaleLogParameter{" +
                "id=" + id +
                ", cid=" + cid +
                ", appType=" + appType +
                ", padImei='" + padImei + '\'' +
                ", loginUser='" + loginUser + '\'' +
                ", salerName='" + salerName + '\'' +
                ", salerNo='" + salerNo + '\'' +
                ", shopName='" + shopName + '\'' +
                ", phoneImei='" + phoneImei + '\'' +
                ", phoneImsi='" + phoneImsi + '\'' +
                ", phoneOsVer='" + phoneOsVer + '\'' +
                ", phoneVenderName='" + phoneVenderName + '\'' +
                ", phoneModelName='" + phoneModelName + '\'' +
                ", installModel=" + installModel +
                ", appId=" + appId +
                ", cpid=" + cpid +
                ", appVersionName='" + appVersionName + '\'' +
                ", installTime=" + installTime +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}
