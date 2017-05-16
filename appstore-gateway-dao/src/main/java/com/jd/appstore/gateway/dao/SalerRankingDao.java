package com.jd.appstore.gateway.dao;

import com.jd.appstore.gateway.domain.obj.SalerRankingObj;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-7-8
 * Time: 下午12:11
 * To change this template use File | Settings | File Templates.
 */
public interface SalerRankingDao {
    /**
     * 获取促销员总的排名
     *
     * @return
     */
    List<SalerRankingObj> getSalerTotalRanking();

    /**
     * 获取当月促销员的排名
     *
     * @return
     */
    List<SalerRankingObj> getSalerCurrentMonthRanking();
}
