package com.jd.appstore.gateway.domain.util;

/**
 * 该实体主要用于添加促销员日志
 * <p/>
 * <p/>
 * Created by YYF on 14-4-29.
 */
public class SalerLog {
    private String salerName;
    private String shopName;
    private String padImei;
    private Integer cid;

    public String getSalerName() {
        return salerName;
    }

    public void setSalerName(String salerName) {
        this.salerName = salerName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getPadImei() {
        return padImei;
    }

    public void setPadImei(String padImei) {
        this.padImei = padImei;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}
