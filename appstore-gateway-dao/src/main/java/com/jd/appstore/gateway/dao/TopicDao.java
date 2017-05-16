package com.jd.appstore.gateway.dao;

import com.jd.appstore.gateway.domain.dao.Topic;
import com.jd.appstore.gateway.domain.dao.TopicApps;
import com.jd.appstore.gateway.domain.dao.parameter.TopicParameter;
import com.jd.appstore.gateway.domain.obj.AppResObj;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-12
 * Time: 下午12:08
 * To change this template use File | Settings | File Templates.
 */
public interface TopicDao {
    String findTopicNameById(int topicId);

    Integer findTopicCount(TopicParameter topicParameter);

    List<Topic> findTopicByPage(TopicParameter topicParameter);

    List<Topic> findTopicNew(TopicParameter topicParameter);

    List<TopicApps> findTopicNewApps(TopicParameter topicParameter);

    List<TopicApps> findTopicApps(TopicParameter topicParameter);

    List<String> getAppPics(TopicParameter topicParameter);

    Map findTopicAppCount();

    List<AppResObj> getAppRes(String topicId);
}
