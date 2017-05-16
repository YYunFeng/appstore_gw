package com.jd.appstore.gateway.service;

import com.jd.appstore.gateway.domain.response.FeedbackRes;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-8-28
 * Time: 下午11:06
 * To change this template use File | Settings | File Templates.
 */
public interface FeedbackService {
    FeedbackRes createdFeedback(String ftype, String content, String fuser);
}
