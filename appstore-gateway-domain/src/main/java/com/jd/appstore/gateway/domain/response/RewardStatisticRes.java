package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.obj.RewardStatisticObj;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class RewardStatisticRes {
    private RewardStatisticObj rewardStatisticObj;
    private ResultObj resultObj;

    public RewardStatisticObj getRewardStatisticObj() {
        return rewardStatisticObj;
    }

    public void setRewardStatisticObj(RewardStatisticObj rewardStatisticObj) {
        this.rewardStatisticObj = rewardStatisticObj;
    }

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }
}
