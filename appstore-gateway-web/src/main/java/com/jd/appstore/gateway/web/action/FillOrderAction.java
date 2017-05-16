package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.FillOrderRes;
import com.jd.appstore.gateway.service.FillOrderService;
import com.jd.common.struts.action.BaseAction;

/**
 * User: YUNFENG
 * Date: 13-11-20
 * Time: 下午3:10
 * To change this template use File | Settings | File Templates.
 */
public class FillOrderAction extends BaseAction {
    private FillOrderService fillOrderService;
    private FillOrderRes fillOrderRes;
    private Integer appId;
    private String padImei;
    private String staffMobile;
    private String staffId;
    private String channelId;
    private String areaProvinceId;

    public String fillOrder() {
        try {
            fillOrderRes = fillOrderService.fillOrder(appId, padImei,staffMobile, staffId, channelId, areaProvinceId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "fillOrder";
    }

    public void setFillOrderService(FillOrderService fillOrderService) {
        this.fillOrderService = fillOrderService;
    }

    public FillOrderRes getFillOrderRes() {
        return fillOrderRes;
    }

    public void setFillOrderRes(FillOrderRes fillOrderRes) {
        this.fillOrderRes = fillOrderRes;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getPadImei() {
        return padImei;
    }

    public void setPadImei(String padImei) {
        this.padImei = padImei;
    }

    public String getStaffMobile() {
        return staffMobile;
    }

    public void setStaffMobile(String staffMobile) {
        this.staffMobile = staffMobile;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getAreaProvinceId() {
        return areaProvinceId;
    }

    public void setAreaProvinceId(String areaProvinceId) {
        this.areaProvinceId = areaProvinceId;
    }
}
