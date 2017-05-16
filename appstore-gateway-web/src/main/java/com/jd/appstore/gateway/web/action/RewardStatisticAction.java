package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.RewardStatisticRes;
import com.jd.appstore.gateway.service.RewardStatisticService;
import com.jd.common.struts.action.BaseAction;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class RewardStatisticAction extends BaseAction {
    private String saler;
    private String startTime;
    private String endTime;

    private RewardStatisticService rewardStatisticService;
    private RewardStatisticRes rewardStatisticRes;

    public String Details() {
        rewardStatisticRes = rewardStatisticService.getRewardStatistic(saler, startTime, endTime);
        return "rewardStatisticDetails";
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

    public RewardStatisticRes getRewardStatisticRes() {
        return rewardStatisticRes;
    }

    public void setRewardStatisticRes(RewardStatisticRes rewardStatisticRes) {
        this.rewardStatisticRes = rewardStatisticRes;
    }
}
