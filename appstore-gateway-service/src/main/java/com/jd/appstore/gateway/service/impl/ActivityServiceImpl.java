package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.dao.parameter.ActivityParameter;
import com.jd.appstore.gateway.domain.enumtype.PicResolutionEnum;
import com.jd.appstore.gateway.domain.obj.ActivityObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.ActivityRes;
import com.jd.appstore.gateway.domain.util.GatewayUrl;
import com.jd.appstore.gateway.manager.ActivityManager;
import com.jd.appstore.gateway.service.ActivityService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-6-9
 * Time: 下午4:42
 * To change this template use File | Settings | File Templates.
 */
public class ActivityServiceImpl implements ActivityService {
    private ActivityManager activityManager;
    private GatewayUrl gatewayUrl;

    public ActivityRes getActivityDetails(Integer padChannelId) {
        ActivityRes activityRes = new ActivityRes();
        List<ActivityObj> activityObjList = new ArrayList<ActivityObj>();
        try {
            ActivityParameter activityParameter = new ActivityParameter();
            activityParameter.setPadChannelId(padChannelId);
            activityObjList = activityManager.getActivityDetails(activityParameter);
            if (activityRes != null && activityObjList.size() != 0) {
                for (ActivityObj activityObj : activityObjList) {
                    if (activityObj.getSmallPic() != null && !activityObj.getSmallPic().equals("")) {
                        activityObj.setSmallPic(gatewayUrl.getImgUrl() + PicResolutionEnum.ACTIVITY.getPrefix() + activityObj.getSmallPic());
                    }
                    if (activityObj.getLargePic() != null && !activityObj.getLargePic().equals("")) {
                        activityObj.setLargePic(gatewayUrl.getImgUrl() + PicResolutionEnum.ACTIVITY.getPrefix() + activityObj.getLargePic());
                    }
                    if (activityObj.getFileUrl() != null && !activityObj.getFileUrl().equals("")) {
                        activityObj.setFileUrl(gatewayUrl.getImgUrl() + PicResolutionEnum.ACTIVITY.getPrefix() + activityObj.getFileUrl());
                    }
                }
            }
            activityRes.setActivityObjList(activityObjList);
            activityRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
        } catch (Exception e) {
            activityRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return activityRes;
    }

    public void setActivityManager(ActivityManager activityManager) {
        this.activityManager = activityManager;
    }

    public GatewayUrl getGatewayUrl() {
        return gatewayUrl;
    }

    public void setGatewayUrl(GatewayUrl gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }
}
