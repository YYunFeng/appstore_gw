package com.jd.appstore.gateway.domain.dao;

import java.util.Date;

/**
 * 补订单日志
 * User: YUNFENG
 * Date: 13-11-20
 * Time: 下午2:33
 * To change this template use File | Settings | File Templates.
 */
public class FillOrderLog {
    private Integer id;
    private String padImei;
    private String saler;
    private String downloadUrl;
    private Integer fillOrderType;
    private Integer fillOrderPercentage;
    private Integer status;
    private String mess;
    private Date created;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPadImei() {
        return padImei;
    }

    public void setPadImei(String padImei) {
        this.padImei = padImei;
    }

    public String getSaler() {
        return saler;
    }

    public void setSaler(String saler) {
        this.saler = saler;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Integer getFillOrderType() {
        return fillOrderType;
    }

    public void setFillOrderType(Integer fillOrderType) {
        this.fillOrderType = fillOrderType;
    }

    public Integer getFillOrderPercentage() {
        return fillOrderPercentage;
    }

    public void setFillOrderPercentage(Integer fillOrderPercentage) {
        this.fillOrderPercentage = fillOrderPercentage;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }
}


