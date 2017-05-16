package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.FeedbackDao;
import com.jd.appstore.gateway.domain.dao.parameter.FeedbackParameter;
import com.jd.appstore.gateway.manager.FeedbackManager;
import com.jd.common.util.SequenceUtil;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-8-28
 * Time: 下午11:04
 * To change this template use File | Settings | File Templates.
 */
public class FeedbackManagerImpl implements FeedbackManager {

    private FeedbackDao feedbackDao;
    private SequenceUtil sequenceUtil;

    public boolean createdFeedback(String ftype, String content, String fuser) {
        FeedbackParameter feedbackParameter = new FeedbackParameter();
        Long id = sequenceUtil.get("FEEDBACK_SEQUENCE");
        feedbackParameter.setId(id.intValue());
        feedbackParameter.setFtype(ftype);
        feedbackParameter.setContent(content);
        feedbackParameter.setFuser(fuser);
        return feedbackDao.createdFeedback(feedbackParameter);  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setFeedbackDao(FeedbackDao feedbackDao) {
        this.feedbackDao = feedbackDao;
    }

    public void setSequenceUtil(SequenceUtil sequenceUtil) {
        this.sequenceUtil = sequenceUtil;
    }
}
