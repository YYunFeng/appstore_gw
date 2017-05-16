package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.SalerQueryRes;
import com.jd.appstore.gateway.service.RewardStatisticService;
import com.jd.common.struts.action.BaseAction;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class SalerQueryAction extends BaseAction {
    private String saler;
    private String startTime;
    private String endTime;

    private RewardStatisticService rewardStatisticService;
    private SalerQueryRes salerQueryRes;

    public String Details() {
        salerQueryRes = rewardStatisticService.salerQuery(saler, startTime, endTime);
        return "salerQueryDetails";
    }

    public String DetailsNew(){
        salerQueryRes = rewardStatisticService.salerQueryNew(saler, startTime, endTime);
        return "salerQueryDetails";
    }

    public void setRewardStatisticService(RewardStatisticService rewardStatisticService) {
        this.rewardStatisticService = rewardStatisticService;
    }


    public String getSaler() {
        return saler;
    }

    public void setSaler(String saler) {
        this.saler = saler;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public SalerQueryRes getSalerQueryRes() {
        return salerQueryRes;
    }

    public void setSalerQueryRes(SalerQueryRes salerQueryRes) {
        this.salerQueryRes = salerQueryRes;
    }
}
