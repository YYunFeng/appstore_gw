package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.RewardStatisticDao;
import com.jd.appstore.gateway.domain.dao.parameter.RewardStatisticParameter;
import com.jd.appstore.gateway.domain.obj.RewardStatisticObj;
import com.jd.common.dao.BaseDao;

import java.util.List;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class RewardStatisticDaoImpl extends BaseDao implements RewardStatisticDao {
    public Integer getVaildMachine(RewardStatisticParameter rewardStatisticParameter) {
        return (Integer) queryForObject("RewardStatistic.getVaildMachine", rewardStatisticParameter);
    }

    public Integer getHuaShengVaildMachine(RewardStatisticParameter rewardStatisticParameter) {
        return (Integer) queryForObject("RewardStatistic.getHuaShengVaildMachine", rewardStatisticParameter);
    }

    public Integer getMineVaildMachine(RewardStatisticParameter rewardStatisticParameter) {
        return (Integer) queryForObject("RewardStatistic.getMineVaildMachine", rewardStatisticParameter);
    }

    public Integer getAppsCounst() {
        return (Integer) queryForObject("RewardStatistic.getAppsCounst");
    }

    public RewardStatisticObj getIncome(RewardStatisticParameter rewardStatisticParameter) {
        return (RewardStatisticObj) queryForObject("RewardStatistic.getIncome", rewardStatisticParameter);
    }

    public Integer salerType(String salerNo) {
        return (Integer) queryForObject("RewardStatistic.getSalerType", salerNo);
    }

    public List<RewardStatisticObj> incomeNewSaler(RewardStatisticParameter rewardStatisticParameter) {
        return queryForList("RewardStatistic.incomeNewSaler", rewardStatisticParameter);
    }

    public RewardStatisticObj incomeNewSalerDetails(RewardStatisticParameter rewardStatisticParameter) {
        return (RewardStatisticObj) queryForObject("RewardStatistic.incomeNewSalerDetails", rewardStatisticParameter);
    }
}
