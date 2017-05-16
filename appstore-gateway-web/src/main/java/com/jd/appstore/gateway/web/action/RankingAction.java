package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.RankingAppsRes;
import com.jd.appstore.gateway.service.RankingService;
import com.jd.common.struts.action.BaseAction;

/**
 * User: gaoyang
 * Date: 12-7-24
 * Time: 下午10:25
 * To change this template use File | Settings | File Templates.
 */
public class RankingAction extends BaseAction {
    private Integer rs;
    private Integer rt;
    private Integer pageNum;
    private Integer pageSize;

    private RankingAppsRes rankingAppsRes;
    private RankingService rankingService;

    /**
     * 排行榜
     *
     * @return
     */
    public String Apps() {
        rankingAppsRes = rankingService.findRankingApp(0, rt, pageNum, pageSize);
        return "apps";
    }


    public void setRankingService(RankingService rankingService) {
        this.rankingService = rankingService;
    }

    public Integer getRs() {
        return rs;
    }

    public void setRs(Integer rs) {
        this.rs = rs;
    }

    public Integer getRt() {
        return rt;
    }

    public void setRt(Integer rt) {
        this.rt = rt;
    }

    public RankingAppsRes getRankingAppsRes() {
        return rankingAppsRes;
    }

    public void setRankingAppsRes(RankingAppsRes rankingAppsRes) {
        this.rankingAppsRes = rankingAppsRes;
    }


    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
