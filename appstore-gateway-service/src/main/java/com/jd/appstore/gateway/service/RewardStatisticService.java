package com.jd.appstore.gateway.service;

import com.jd.appstore.gateway.domain.response.RewardStatisticRes;
import com.jd.appstore.gateway.domain.response.SalerQueryRes;

/**
 * Created by YUNFENG on 14-2-10.
 */
public interface RewardStatisticService {
    /**
     * 促销员查询
     *
     * @param saler
     * @param startTime
     * @param endTime
     * @return
     */
    RewardStatisticRes getRewardStatistic(String saler, String startTime, String endTime);

    /**
     * 促销员查询---新接口
     *
     * @param saler
     * @param startTime
     * @param endTime
     * @return
     */
    SalerQueryRes salerQuery(String saler, String startTime, String endTime);


    SalerQueryRes salerQueryNew(String saler, String startTime, String endTime);


}
