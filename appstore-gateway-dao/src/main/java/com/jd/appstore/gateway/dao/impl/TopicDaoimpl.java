package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.TopicDao;
import com.jd.appstore.gateway.domain.dao.Topic;
import com.jd.appstore.gateway.domain.dao.TopicApps;
import com.jd.appstore.gateway.domain.dao.parameter.TopicParameter;
import com.jd.appstore.gateway.domain.obj.AppResObj;
import com.jd.common.dao.BaseDao;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-12
 * Time: 下午12:10
 * To change this template use File | Settings | File Templates.
 */
public class TopicDaoimpl extends BaseDao implements TopicDao {
    public String findTopicNameById(int topicId) {
        return (String) queryForObject("Topic.findTopicNameById", topicId);
    }

    public Integer findTopicCount(TopicParameter topicParameter) {
        return (Integer) queryForObject("Topic.findTopicCount", topicParameter);
    }

    public List<Topic> findTopicByPage(TopicParameter topicParameter) {
        return queryForList("Topic.findTopicByPage", topicParameter);
    }


    public List<Topic> findTopicNew(TopicParameter topicParameter) {
        return queryForList("Topic.findTopicNew", topicParameter);
    }

    public List<TopicApps> findTopicApps(TopicParameter topicParameter) {
        return queryForList("Topic.findTopicApps", topicParameter);

    }

    public List<TopicApps> findTopicNewApps(TopicParameter topicParameter) {
        return queryForList("Topic.findTopicNewApps", topicParameter);
    }

    public List<String> getAppPics(TopicParameter topicParameter) {
        return queryForList("Topic.getAppPics", topicParameter);
    }

    public Map findTopicAppCount() {
        return queryForMap("Topic.findTopicAppCount", null, "topicId", "appCount");
    }

    public List<AppResObj> getAppRes(String topicId) {
        return queryForList("Topic.getAppRes", topicId);
    }
}
