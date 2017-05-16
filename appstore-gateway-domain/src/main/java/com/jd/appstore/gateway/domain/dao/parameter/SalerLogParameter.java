package com.jd.appstore.gateway.domain.dao.parameter;

/**
 * YYF on 2015/4/7.
 */
public class SalerLogParameter {

    private String deviceNo;
    private String salerNo;
    private String phoneVenderName;
    private String phoneImei;
    private String phoneModelName;
    private Integer appid;
    private String installTime;
    private String phoneOsVer;

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getSalerNo() {
        return salerNo;
    }

    public void setSalerNo(String salerNo) {
        this.salerNo = salerNo;
    }

    public String getPhoneVenderName() {
        return phoneVenderName;
    }

    public void setPhoneVenderName(String phoneVenderName) {
        this.phoneVenderName = phoneVenderName;
    }

    public String getPhoneImei() {
        return phoneImei;
    }

    public void setPhoneImei(String phoneImei) {
        this.phoneImei = phoneImei;
    }

    public String getPhoneModelName() {
        return phoneModelName;
    }

    public void setPhoneModelName(String phoneModelName) {
        this.phoneModelName = phoneModelName;
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public String getInstallTime() {
        return installTime;
    }

    public void setInstallTime(String installTime) {
        this.installTime = installTime;
    }

    public String getPhoneOsVer() {
        return phoneOsVer;
    }

    public void setPhoneOsVer(String phoneOsVer) {
        this.phoneOsVer = phoneOsVer;
    }

    public SalerLogParameter(String phoneImei, Integer appid) {
        this.phoneImei = phoneImei;
        this.appid = appid;
    }


    public boolean equals(Object obj) {  // 覆写equals，完成对象比较
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SalerLogParameter)) {
            return false;
        }
        SalerLogParameter p = (SalerLogParameter) obj;    // 向下转型
        if (this.phoneImei.equals(p.phoneImei) && this.appid.equals(p.appid)) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.phoneImei.hashCode() * this.appid; // 定义一个公式
    }


    public SalerLogParameter() {
    }

    @Override
    public String toString() {
        return "SalerLogParameter{" +
                "deviceNo='" + deviceNo + '\'' +
                ", salerNo='" + salerNo + '\'' +
                ", phoneVenderName='" + phoneVenderName + '\'' +
                ", phoneImei='" + phoneImei + '\'' +
                ", phoneModelName='" + phoneModelName + '\'' +
                ", appid='" + appid + '\'' +
                ", installTime='" + installTime + '\'' +
                ", phoneOsVer='" + phoneOsVer + '\'' +
                '}';
    }
}
