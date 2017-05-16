package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.FeedbackDao;
import com.jd.appstore.gateway.domain.dao.parameter.FeedbackParameter;
import com.jd.common.dao.BaseDao;
import org.apache.log4j.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-8-28
 * Time: 下午11:00
 * To change this template use File | Settings | File Templates.
 */
public class FeedbackDaoImpl extends BaseDao implements FeedbackDao {
    Logger logger = Logger.getLogger(this.getClass());

    public boolean createdFeedback(FeedbackParameter feedbackParameter) {
        try {
            insert("Feedback.createdFeedback", feedbackParameter);
        } catch (Exception e) {
            return false;
        }
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
