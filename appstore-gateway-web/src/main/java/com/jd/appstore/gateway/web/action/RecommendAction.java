package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.dao.Recommend;
import com.jd.appstore.gateway.domain.response.RecommendContentsRes;
import com.jd.appstore.gateway.service.RecommendService;
import com.jd.common.struts.action.BaseAction;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-24
 * Time: 下午9:44
 * To change this template use File | Settings | File Templates.
 */
public class RecommendAction extends BaseAction {

    private Integer clientType;
    private Integer mid;
    private Integer aid;

    private RecommendContentsRes recommendContentsRes;

    private RecommendService recommendService;

    /**
     * 获取推荐
     * @return
     */
    public String Contents() {
        recommendContentsRes = recommendService.findRecommendContents(clientType,mid,aid);
        return "contents";
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public RecommendContentsRes getRecommendContentsRes() {
        return recommendContentsRes;
    }

    public void setRecommendContentsRes(RecommendContentsRes recommendContentsRes) {
        this.recommendContentsRes = recommendContentsRes;
    }

    public void setRecommendService(RecommendService recommendService) {
        this.recommendService = recommendService;
    }
}
