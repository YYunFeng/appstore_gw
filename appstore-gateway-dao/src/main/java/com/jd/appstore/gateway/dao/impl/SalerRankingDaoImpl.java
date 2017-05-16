package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.SalerRankingDao;
import com.jd.appstore.gateway.domain.obj.SalerRankingObj;
import com.jd.common.dao.BaseDao;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-7-8
 * Time: 下午12:12
 * To change this template use File | Settings | File Templates.
 */
public class SalerRankingDaoImpl extends BaseDao implements SalerRankingDao {
    /**
     * 获取促销员总的排名
     *
     * @return
     */
    public List<SalerRankingObj> getSalerTotalRanking() {
        return queryForList("SalerRanking.getSalerTotalRanking");
    }

    public List<SalerRankingObj> getSalerCurrentMonthRanking() {
        return queryForList("SalerRanking.getSalerCurrentMonthRanking");
    }
}
