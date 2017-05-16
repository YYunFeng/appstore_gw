package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.PadUpdateLogRes;
import com.jd.appstore.gateway.service.PadUpdateLogService;
import com.jd.common.struts.action.BaseAction;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-7-8
 * Time: 上午10:27
 * To change this template use File | Settings | File Templates.
 */
public class padUpdateLogAction extends BaseAction {
    private PadUpdateLogService padUpdateLogService;
    private PadUpdateLogRes padUpdateLogRes;
    private String imeiNumber;
    private Long updateTime;
    private Integer type;


    public String padUpdateLog() {
        padUpdateLogRes = padUpdateLogService.recordPadUpdateLog(imeiNumber, updateTime,type);
        return "padUpdateLog";
    }

    public void setPadUpdateLogService(PadUpdateLogService padUpdateLogService) {
        this.padUpdateLogService = padUpdateLogService;
    }

    public PadUpdateLogRes getPadUpdateLogRes() {
        return padUpdateLogRes;
    }

    public void setPadUpdateLogRes(PadUpdateLogRes padUpdateLogRes) {
        this.padUpdateLogRes = padUpdateLogRes;
    }

    public String getImeiNumber() {
        return imeiNumber;
    }

    public void setImeiNumber(String imeiNumber) {
        this.imeiNumber = imeiNumber;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
