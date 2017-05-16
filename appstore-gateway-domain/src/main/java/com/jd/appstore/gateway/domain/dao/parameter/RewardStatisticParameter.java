package com.jd.appstore.gateway.domain.dao.parameter;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class RewardStatisticParameter {
    private String saler;
    private String startTime;
    private String endTime;


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
}

