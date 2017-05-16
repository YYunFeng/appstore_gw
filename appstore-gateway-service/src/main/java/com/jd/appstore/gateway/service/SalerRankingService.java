package com.jd.appstore.gateway.service;

import com.jd.appstore.gateway.domain.response.SalerRankingRes;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-7-8
 * Time: 下午12:23
 * To change this template use File | Settings | File Templates.
 */
public interface SalerRankingService {
    /**
     * 获取促销员的排名
     *
     * @param saler
     * @return
     */
    SalerRankingRes salerRanking(String saler);
}
