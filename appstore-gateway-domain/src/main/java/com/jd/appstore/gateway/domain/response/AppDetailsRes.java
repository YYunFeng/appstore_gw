package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-7
 * Time: 上午9:43
 * To change this template use File | Settings | File Templates.
 */
public class AppDetailsRes {

    private ResultObj resultObj;
    private AppBaseInfoObj appBaseInfoObj;
    private List<CpInfoObj> cpInfoObjs;
    private List<AppResourceInfoObj> appResourceInfoObjs;
    private CommentSummaryInfoObj commentSummaryInfoObj;
    private List<RelatedRecommendedInfoObj> relatedRecommendedInfoObjs;

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

    public AppBaseInfoObj getAppBaseInfoObj() {
        return appBaseInfoObj;
    }

    public void setAppBaseInfoObj(AppBaseInfoObj appBaseInfoObj) {
        this.appBaseInfoObj = appBaseInfoObj;
    }

    public List<CpInfoObj> getCpInfoObjs() {
        return cpInfoObjs;
    }

    public void setCpInfoObjs(List<CpInfoObj> cpInfoObjs) {
        this.cpInfoObjs = cpInfoObjs;
    }

    public List<AppResourceInfoObj> getAppResourceInfoObjs() {
        return appResourceInfoObjs;
    }

    public void setAppResourceInfoObjs(List<AppResourceInfoObj> appResourceInfoObjs) {
        this.appResourceInfoObjs = appResourceInfoObjs;
    }

    public CommentSummaryInfoObj getCommentSummaryInfoObj() {
        return commentSummaryInfoObj;
    }

    public void setCommentSummaryInfoObj(CommentSummaryInfoObj commentSummaryInfoObj) {
        this.commentSummaryInfoObj = commentSummaryInfoObj;
    }

    public List<RelatedRecommendedInfoObj> getRelatedRecommendedInfoObjs() {
        return relatedRecommendedInfoObjs;
    }

    public void setRelatedRecommendedInfoObjs(List<RelatedRecommendedInfoObj> relatedRecommendedInfoObjs) {
        this.relatedRecommendedInfoObjs = relatedRecommendedInfoObjs;
    }
}
