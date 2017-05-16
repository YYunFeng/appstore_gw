package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.ActivityDao;
import com.jd.appstore.gateway.domain.dao.parameter.ActivityParameter;
import com.jd.appstore.gateway.domain.obj.ActivityObj;
import com.jd.appstore.gateway.domain.response.ActivityRes;
import com.jd.appstore.gateway.manager.ActivityManager;
import com.jd.common.manager.BaseManager;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-6-9
 * Time: 下午4:40
 * To change this template use File | Settings | File Templates.
 */
public class ActivityManagerImpl extends BaseManager implements ActivityManager {
    private ActivityDao activityDao;

    public List<ActivityObj> getActivityDetails(ActivityParameter activityParameter) {
        return activityDao.getActivityDetails(activityParameter);
    }

    public void setActivityDao(ActivityDao activityDao) {
        this.activityDao = activityDao;
    }
}
