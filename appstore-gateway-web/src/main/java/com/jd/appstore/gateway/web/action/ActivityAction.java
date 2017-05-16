package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.ActivityRes;
import com.jd.appstore.gateway.service.ActivityService;
import com.jd.common.struts.action.BaseAction;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-6-9
 * Time: 下午4:23
 * To change this template use File | Settings | File Templates.
 */
public class ActivityAction extends BaseAction {
    private ActivityService activityService;
    private Integer padChannelId;
    private ActivityRes activityRes;


    public String Detail() {
        try {
            activityRes = activityService.getActivityDetails(padChannelId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "activityDetail";
    }




    public Integer getPadChannelId() {
        return padChannelId;
    }

    public void setPadChannelId(Integer padChannelId) {
        this.padChannelId = padChannelId;
    }

    public void setActivityService(ActivityService activityService) {
        this.activityService = activityService;
    }

    public ActivityRes getActivityRes() {
        return activityRes;
    }

    public void setActivityRes(ActivityRes activityRes) {
        this.activityRes = activityRes;
    }
}
