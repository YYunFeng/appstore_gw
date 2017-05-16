package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.SalerRankingDao;
import com.jd.appstore.gateway.domain.obj.SalerRankingObj;
import com.jd.appstore.gateway.manager.SalerRankingManager;
import com.jd.common.manager.BaseManager;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-7-8
 * Time: 下午12:14
 * To change this template use File | Settings | File Templates.
 */
public class SalerRankingManagerImpl extends BaseManager implements SalerRankingManager {
    private SalerRankingDao salerRankingDao;


    public void setSalerRankingDao(SalerRankingDao salerRankingDao) {
        this.salerRankingDao = salerRankingDao;
    }

    public List<SalerRankingObj> getSalerTotalRanking() {
        return salerRankingDao.getSalerTotalRanking();
    }

    public List<SalerRankingObj> getSalerCurrentMonthRanking() {
        return salerRankingDao.getSalerCurrentMonthRanking();
    }
}
