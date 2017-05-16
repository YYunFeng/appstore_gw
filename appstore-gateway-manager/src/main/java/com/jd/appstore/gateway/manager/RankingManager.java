package com.jd.appstore.gateway.manager;

import com.jd.appstore.gateway.domain.dao.Ranking;
import com.jd.appstore.gateway.domain.dao.parameter.RankingParameter;
import com.jd.appstore.gateway.domain.obj.AppResObj;
import com.jd.common.util.PaginatedList;

import java.util.List;

/**
 * User: gaoyang
 * Date: 12-8-12
 * Time: 下午5:05
 * To change this template use File | Settings | File Templates.
 */
public interface RankingManager {
    PaginatedList<Ranking> findRanking(Integer rangkingStyle, Integer rankingType, int pageIndex, int pageSize);

    List<AppResObj> getAppRes(String appids);
}
