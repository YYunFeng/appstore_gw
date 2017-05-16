package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.RankingDao;
import com.jd.appstore.gateway.domain.dao.Ranking;
import com.jd.appstore.gateway.domain.dao.parameter.RankingParameter;
import com.jd.appstore.gateway.domain.obj.AppResObj;
import com.jd.common.dao.BaseDao;

import java.util.List;

/**
 * User: gaoyang
 * Date: 12-8-12
 * Time: 下午5:04
 * To change this template use File | Settings | File Templates.
 */
public class RankingDaoImpl extends BaseDao implements RankingDao {
    public List<Ranking> findRanking(RankingParameter rankingParameter) {
        return queryForList("Ranking.findRanking", rankingParameter);
    }

    public List<AppResObj> getAppRes(String appids) {
        return queryForList("Ranking.getAppRes", appids);
    }
}
