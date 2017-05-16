package com.jd.appstore.gateway.manager;

import com.jd.appstore.gateway.domain.dao.Topic;
import com.jd.appstore.gateway.domain.dao.TopicApps;
import com.jd.appstore.gateway.domain.obj.AppResObj;
import com.jd.common.util.PaginatedList;

import java.util.List;
import java.util.Map;


/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-12
 * Time: 下午12:14
 * To change this template use File | Settings | File Templates.
 */
public interface TopicManager {
    String findTopicNameById(int topicId);

    PaginatedList<Topic> findTopicByPage(Integer topicType, Integer padChannelId, Integer pageSize, Integer pageNum);

    List<Topic> findTopicNew(Integer padChannelId);

    List<TopicApps> findTopicApps(int topicId, int padChannelId);

    List<TopicApps> findTopicNewApps(int topicId, int padChannelId);

    List<String> getAppPics(int appId, int accountId);

    Map findTopicAppCount();


    List<AppResObj> getAppRes(String topicId);
}
