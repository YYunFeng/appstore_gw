package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.ActivityObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-6-9
 * Time: 下午4:24
 * To change this template use File | Settings | File Templates.
 */
public class ActivityRes {
    private List<ActivityObj> activityObjList;
    private ResultObj resultObj;

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

    public List<ActivityObj> getActivityObjList() {
        return activityObjList;
    }

    public void setActivityObjList(List<ActivityObj> activityObjList) {
        this.activityObjList = activityObjList;
    }
}
