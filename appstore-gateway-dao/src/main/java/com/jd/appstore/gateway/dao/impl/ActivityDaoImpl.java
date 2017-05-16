package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.ActivityDao;
import com.jd.appstore.gateway.domain.dao.parameter.ActivityParameter;
import com.jd.appstore.gateway.domain.obj.ActivityObj;
import com.jd.appstore.gateway.domain.response.ActivityRes;
import com.jd.common.dao.BaseDao;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-6-9
 * Time: 下午4:38
 * To change this template use File | Settings | File Templates.
 */
public class ActivityDaoImpl extends BaseDao implements ActivityDao {

    public List<ActivityObj> getActivityDetails(ActivityParameter activityParameter) {
        return  queryForList("Activity.getActivityDetails", activityParameter);
    }
}
