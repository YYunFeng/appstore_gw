package com.jd.appstore.gateway.domain.obj;

import javax.xml.stream.events.StartDocument;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-20
 * Time: 下午2:09
 * To change this template use File | Settings | File Templates.
 */
public class CommentSummaryObj {
    /**
     *应用编号
     */
    private Integer appId;
    /**
     *好评度，百分比
     */
    private String goodRate;
    /**
     *星级
     */
    private Integer star;
    /**
     *评论次数
     */
    private Integer commentCount;
    /**
     *1星评论次数
     */
    private Integer score1Count;
    /**
     *2星评论次数
     */
    private Integer score2Count;
    /**
     *3星评论次数
     */
    private Integer score3Count;
    /**
     *4星评论次数
     */
    private Integer score4Count;
    /**
     *5星评论次数
     */
    private Integer score5Count;


    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getGoodRate() {
        return goodRate;
    }

    public void setGoodRate(String goodRate) {
        this.goodRate = goodRate;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getScore1Count() {
        return score1Count;
    }

    public void setScore1Count(Integer score1Count) {
        this.score1Count = score1Count;
    }

    public Integer getScore2Count() {
        return score2Count;
    }

    public void setScore2Count(Integer score2Count) {
        this.score2Count = score2Count;
    }

    public Integer getScore3Count() {
        return score3Count;
    }

    public void setScore3Count(Integer score3Count) {
        this.score3Count = score3Count;
    }

    public Integer getScore4Count() {
        return score4Count;
    }

    public void setScore4Count(Integer score4Count) {
        this.score4Count = score4Count;
    }

    public Integer getScore5Count() {
        return score5Count;
    }

    public void setScore5Count(Integer score5Count) {
        this.score5Count = score5Count;
    }
}
