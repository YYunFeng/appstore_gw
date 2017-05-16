package com.jd.appstore.gateway.dao;

import com.jd.appstore.gateway.domain.dao.Ranking;
import com.jd.appstore.gateway.domain.dao.parameter.RankingParameter;
import com.jd.appstore.gateway.domain.obj.AppResObj;

import java.util.List;

/**
 * User: gaoyang
 * Date: 12-8-12
 * Time: 下午5:01
 * To change this template use File | Settings | File Templates.
 */
public interface RankingDao {
    List<Ranking> findRanking(RankingParameter rankingParameter);

    List<AppResObj> getAppRes(String appids);
}
