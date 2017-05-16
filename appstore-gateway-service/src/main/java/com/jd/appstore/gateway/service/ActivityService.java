package com.jd.appstore.gateway.service;

import com.jd.appstore.gateway.domain.response.ActivityRes;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-6-9
 * Time: 下午4:41
 * To change this template use File | Settings | File Templates.
 */
public interface ActivityService {
    /**
     * 获得活动详情

     *
     * @param padChannelId
     * @return
     */
    ActivityRes getActivityDetails(Integer padChannelId);
}
