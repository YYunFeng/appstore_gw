package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.SalerRankingRes;
import com.jd.appstore.gateway.service.SalerRankingService;
import com.jd.common.struts.action.BaseAction;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-7-8
 * Time: 下午12:55
 * To change this template use File | Settings | File Templates.
 */
public class SalerRankingAction extends BaseAction {
    private SalerRankingService salerRankingService;
    private SalerRankingRes salerRankingRes;
    private String saler;

    public String salerRanking() {
        salerRankingRes = salerRankingService.salerRanking(saler);
        return "salerRanking";
    }

    public void setSalerRankingService(SalerRankingService salerRankingService) {
        this.salerRankingService = salerRankingService;
    }

    public String getSaler() {
        return saler;
    }

    public void setSaler(String saler) {
        this.saler = saler;
    }

    public SalerRankingRes getSalerRankingRes() {
        return salerRankingRes;
    }

    public void setSalerRankingRes(SalerRankingRes salerRankingRes) {
        this.salerRankingRes = salerRankingRes;
    }
}
