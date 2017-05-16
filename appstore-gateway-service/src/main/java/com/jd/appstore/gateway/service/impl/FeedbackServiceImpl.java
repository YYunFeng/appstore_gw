package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.FeedbackRes;
import com.jd.appstore.gateway.manager.FeedbackManager;
import com.jd.appstore.gateway.service.FeedbackService;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-28
 * Time: 下午11:07
 * To change this template use File | Settings | File Templates.
 */
public class FeedbackServiceImpl implements FeedbackService {
    private FeedbackManager feedbackManager;

    public FeedbackRes createdFeedback(String ftype, String content, String fuser) {
        FeedbackRes feedbackRes = new FeedbackRes();
        try {
            if (feedbackManager.createdFeedback(ftype, content, fuser)) {
                feedbackRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
            } else {
                feedbackRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            }
        } catch (Exception e) {
            feedbackRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return feedbackRes;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setFeedbackManager(FeedbackManager feedbackManager) {
        this.feedbackManager = feedbackManager;
    }
}
