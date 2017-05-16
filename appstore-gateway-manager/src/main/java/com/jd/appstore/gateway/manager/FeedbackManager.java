package com.jd.appstore.gateway.manager;


/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-8-28
 * Time: 下午11:03
 * To change this template use File | Settings | File Templates.
 */
public interface FeedbackManager {
    boolean  createdFeedback(String ftype,String content,String fuser);
}
