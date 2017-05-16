package com.jd.appstore.gateway.service;

import com.jd.appstore.gateway.domain.response.RankingAppsRes;

/**
 * User: gaoyang
 * Date: 12-8-12
 * Time: 下午5:08
 * To change this template use File | Settings | File Templates.
 */
public interface RankingService {
    RankingAppsRes findRankingApp(Integer rangkingStyle, Integer rankingType, Integer pageNum, Integer pageSize);
}
