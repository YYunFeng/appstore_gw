package com.jd.appstore.gateway.domain.dao.parameter;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-6-9
 * Time: 下午4:26
 * To change this template use File | Settings | File Templates.
 */
public class ActivityParameter {
    private Integer padChannelId;
    private Integer activityId;

    public Integer getPadChannelId() {
        return padChannelId;
    }

    public void setPadChannelId(Integer padChannelId) {
        this.padChannelId = padChannelId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }
}
