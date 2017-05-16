package com.jd.appstore.gateway.dao;

import com.jd.appstore.gateway.domain.dao.parameter.FeedbackParameter;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-28
 * Time: 下午10:57
 * To change this template use File | Settings | File Templates.
 */
public interface FeedbackDao {
    boolean createdFeedback(FeedbackParameter feedbackParameter);
}
