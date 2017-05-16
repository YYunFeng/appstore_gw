package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.obj.SalerRankingObj;
import com.jd.appstore.gateway.domain.response.SalerRankingRes;
import com.jd.appstore.gateway.manager.SalerRankingManager;
import com.jd.appstore.gateway.service.SalerRankingService;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-7-8
 * Time: 下午12:26
 * To change this template use File | Settings | File Templates.
 */
public class SalerRankingServiceImpl implements SalerRankingService {
    private SalerRankingManager salerRankingManager;

    public SalerRankingRes salerRanking(String saler) {
        SalerRankingRes salerRankingRes = new SalerRankingRes();
        try {
            if (saler != null) {
                SalerRankingObj salerRankingObj = new SalerRankingObj();
                // 所有促销员总排名
                List<SalerRankingObj> totalRanking = salerRankingManager.getSalerTotalRanking();
                // 所有促销员当月排名
                List<SalerRankingObj> currentRanking = salerRankingManager.getSalerCurrentMonthRanking();
                // 该促销员的总排名
                if (totalRanking != null && totalRanking.size() != 0) {
                    for (int i = 0; i < totalRanking.size(); i++) {
                        if (saler.equals(totalRanking.get(i).getSaler())) {
                            salerRankingObj.setTotalRanking(i + 1);
                            salerRankingObj.setTotalInstallAppsTimes(totalRanking.get(i).getTotalInstallAppsTimes());
                            break;
                        }
                    }
                    // 促销员的当月排名
                    if (currentRanking != null && currentRanking.size() != 0) {
                        for (int j = 0; j < currentRanking.size(); j++) {
                            if (saler.equals(currentRanking.get(j).getSaler())) {
                                salerRankingObj.setCurrentMonthRanking(j + 1);
                                salerRankingObj.setCurrentInstallAppsTimes(currentRanking.get(j).getCurrentInstallAppsTimes());
                                break;
                            } else {
                                salerRankingObj.setCurrentInstallAppsTimes(0);
                                salerRankingObj.setCurrentMonthRanking(0);
                            }
                        }

                    } else {
                        salerRankingObj.setCurrentInstallAppsTimes(0);
                        salerRankingObj.setCurrentMonthRanking(0);
                    }
                    salerRankingRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
                    salerRankingRes.setSalerRankingObj(salerRankingObj);
                } else {
                    salerRankingRes.setMess("当前无排名");
                }
            } else {
                salerRankingRes.setMess("saler为空");
                salerRankingRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            }
        } catch (Exception e) {
            salerRankingRes.setMess("系统异常");
            salerRankingRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return salerRankingRes;
    }

    public void setSalerRankingManager(SalerRankingManager salerRankingManager) {
        this.salerRankingManager = salerRankingManager;
    }
}
