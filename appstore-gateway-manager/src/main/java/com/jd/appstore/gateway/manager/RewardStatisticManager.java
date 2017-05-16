package com.jd.appstore.gateway.manager;

import com.jd.appstore.gateway.domain.dao.parameter.RewardStatisticParameter;
import com.jd.appstore.gateway.domain.obj.RewardStatisticObj;

import java.util.List;

/**
 * Created by YUNFENG on 14-2-10.
 */
public interface RewardStatisticManager {
    /**
     * 有效装机量
     *
     * @param rewardStatisticParameter
     * @return
     */
    Integer getVaildMachine(RewardStatisticParameter rewardStatisticParameter);

    /**
     * 华盛有效装机量
     *
     * @param rewardStatisticParameter
     * @return
     */
    Integer getHuaShengVaildMachine(RewardStatisticParameter rewardStatisticParameter);

    /**
     * 自有有效装机量
     *
     * @param rewardStatisticParameter
     * @return
     */
    Integer getMineVaildMachine(RewardStatisticParameter rewardStatisticParameter);

    /**
     * 专题下应用总数
     *
     * @return
     */
    Integer getAppsCounst();


    RewardStatisticObj getIncome(RewardStatisticParameter rewardStatisticParameter);


    Integer salerType(String salerNo);

    /**
     * 店长或者督导
     *
     * @param rewardStatisticParameter
     * @return
     */
    List<RewardStatisticObj> incomeNewSaler(RewardStatisticParameter rewardStatisticParameter);


    /**
     * 店员
     *
     * @param rewardStatisticParameter
     * @return
     */
    RewardStatisticObj incomeNewSalerDetails(RewardStatisticParameter rewardStatisticParameter);
}
