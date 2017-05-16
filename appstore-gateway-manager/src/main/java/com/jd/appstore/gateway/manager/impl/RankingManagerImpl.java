package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.RankingDao;
import com.jd.appstore.gateway.domain.dao.AppSearch;
import com.jd.appstore.gateway.domain.dao.Ranking;
import com.jd.appstore.gateway.domain.dao.parameter.RankingParameter;
import com.jd.appstore.gateway.domain.obj.AppResObj;
import com.jd.appstore.gateway.manager.RankingManager;
import com.jd.common.util.PaginatedList;
import com.jd.common.util.base.PaginatedArrayList;

import java.util.List;

/**
 * User: gaoyang
 * Date: 12-8-12
 * Time: 下午5:06
 * To change this template use File | Settings | File Templates.
 */
public class RankingManagerImpl implements RankingManager {

    private RankingDao rankingDao;

    public PaginatedList<Ranking> findRanking(Integer rangkingStyle, Integer rankingType, int pageIndex, int pageSize) {
        if (0 == pageIndex) {
            pageIndex = 1;
        }
        PaginatedList<Ranking> rankingPaginatedList = new PaginatedArrayList<Ranking>(pageIndex, pageSize);
        RankingParameter rankingParameter = new RankingParameter();
        rankingParameter.setRankingStyle(rangkingStyle);
        rankingParameter.setRankingType(rankingType);
        int total = 100;  // 排行榜取全100条数据
        rankingPaginatedList.setTotalItem(total);
        rankingParameter.setLimit(pageSize);
        rankingParameter.setOffset((pageIndex - 1) * pageSize);
        List<Ranking> list = rankingDao.findRanking(rankingParameter);
        rankingPaginatedList.addAll(list);
        return rankingPaginatedList;
    }

    public void setRankingDao(RankingDao rankingDao) {
        this.rankingDao = rankingDao;
    }

    public List<AppResObj> getAppRes(String appids) {
        return rankingDao.getAppRes(appids);
    }


}
