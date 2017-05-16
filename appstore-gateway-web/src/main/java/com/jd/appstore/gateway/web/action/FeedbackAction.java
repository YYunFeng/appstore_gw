package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.FeedbackRes;
import com.jd.appstore.gateway.service.FeedbackService;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-8-28
 * Time: 下午11:10
 * To change this template use File | Settings | File Templates.
 */
public class FeedbackAction {
    private String ftype;
    private String content;
    private String fuser;

    private FeedbackService feedbackService;
    private FeedbackRes feedbackRes;

    /**
     * 添加意见反馈
     * @return
     */
    public String Add() {
        feedbackRes = feedbackService.createdFeedback(ftype,content,fuser);
        return "add";
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFuser() {
        return fuser;
    }

    public void setFuser(String fuser) {
        this.fuser = fuser;
    }

    public void setFeedbackService(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    public FeedbackRes getFeedbackRes() {
        return feedbackRes;
    }

    public void setFeedbackRes(FeedbackRes feedbackRes) {
        this.feedbackRes = feedbackRes;
    }
}
