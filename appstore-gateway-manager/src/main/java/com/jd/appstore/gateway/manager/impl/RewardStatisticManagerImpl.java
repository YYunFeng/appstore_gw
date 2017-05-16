package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.RewardStatisticDao;
import com.jd.appstore.gateway.domain.dao.parameter.RewardStatisticParameter;
import com.jd.appstore.gateway.domain.obj.RewardStatisticObj;
import com.jd.appstore.gateway.manager.RewardStatisticManager;
import com.jd.common.manager.BaseManager;

import java.util.List;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class RewardStatisticManagerImpl extends BaseManager implements RewardStatisticManager {
    private RewardStatisticDao rewardStatisticDao;

    public Integer getVaildMachine(RewardStatisticParameter rewardStatisticParameter) {
        return rewardStatisticDao.getVaildMachine(rewardStatisticParameter);
    }

    public Integer getHuaShengVaildMachine(RewardStatisticParameter rewardStatisticParameter) {
        return rewardStatisticDao.getHuaShengVaildMachine(rewardStatisticParameter);
    }

    public Integer getMineVaildMachine(RewardStatisticParameter rewardStatisticParameter) {
        return rewardStatisticDao.getMineVaildMachine(rewardStatisticParameter);
    }

    public Integer getAppsCounst() {
        return rewardStatisticDao.getAppsCounst();
    }

    public RewardStatisticObj getIncome(RewardStatisticParameter rewardStatisticParameter) {
        return rewardStatisticDao.getIncome(rewardStatisticParameter);
    }

    public Integer salerType(String salerNo) {
        return rewardStatisticDao.salerType(salerNo);
    }

    public List<RewardStatisticObj> incomeNewSaler(RewardStatisticParameter rewardStatisticParameter) {
        return rewardStatisticDao.incomeNewSaler(rewardStatisticParameter);
    }

    public RewardStatisticObj incomeNewSalerDetails(RewardStatisticParameter rewardStatisticParameter) {
        return rewardStatisticDao.incomeNewSalerDetails(rewardStatisticParameter);
    }

    public void setRewardStatisticDao(RewardStatisticDao rewardStatisticDao) {
        this.rewardStatisticDao = rewardStatisticDao;
    }
}
