package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.TopicDao;
import com.jd.appstore.gateway.domain.dao.Topic;
import com.jd.appstore.gateway.domain.dao.TopicApps;
import com.jd.appstore.gateway.domain.dao.parameter.TopicParameter;
import com.jd.appstore.gateway.domain.obj.AppResObj;
import com.jd.appstore.gateway.manager.TopicManager;
import com.jd.common.manager.BaseManager;
import com.jd.common.util.PaginatedList;
import com.jd.common.util.base.PaginatedArrayList;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-12
 * Time: 下午12:15
 * To change this template use File | Settings | File Templates.
 */
public class TopicManagerImpl extends BaseManager implements TopicManager {

    TopicDao topicDao;

    public String findTopicNameById(int topicId) {
        return topicDao.findTopicNameById(topicId);
    }

    public PaginatedList<Topic> findTopicByPage(Integer topicType, Integer padChannelId, Integer pageSize, Integer pageNum) {

        TopicParameter topicParameter = new TopicParameter();
        topicParameter.setTopicType(topicType);
        topicParameter.setPadChannelId(padChannelId);
        Integer totalTopic = topicDao.findTopicCount(topicParameter);
        PaginatedList<Topic> topicPaginatedList = new PaginatedArrayList<Topic>(pageNum, pageSize);

        topicPaginatedList.setTotalItem(totalTopic);
        topicParameter.setOffset(topicPaginatedList.getStartRow() - 1);
        topicParameter.setLimit(topicPaginatedList.getPageSize());
        List<Topic> topicList = topicDao.findTopicByPage(topicParameter);
        topicPaginatedList.addAll(topicList);

        return topicPaginatedList;
    }

    public List<Topic> findTopicNew(Integer padChannelId) {
        TopicParameter topicParameter = new TopicParameter();
        topicParameter.setTopicType(1);
        topicParameter.setPadChannelId(padChannelId);
        List<Topic> topicList = topicDao.findTopicNew(topicParameter);
        return topicList;
    }

    public List<TopicApps> findTopicApps(int topicId, int padChannelId) {
        TopicParameter topicParameter = new TopicParameter();
        topicParameter.setTopicId(topicId);
        topicParameter.setPadChannelId(padChannelId);
        return topicDao.findTopicApps(topicParameter);
    }

    public List<TopicApps> findTopicNewApps(int topicId, int padChannelId) {
        TopicParameter topicParameter = new TopicParameter();
        topicParameter.setTopicId(topicId);
        topicParameter.setPadChannelId(padChannelId);
        return topicDao.findTopicNewApps(topicParameter);
    }

    public List<String> getAppPics(int appId, int accountId) {
        TopicParameter topicParameter = new TopicParameter();
        topicParameter.setAppId(appId);
        topicParameter.setAccountId(accountId);
        return topicDao.getAppPics(topicParameter);
    }

    public Map findTopicAppCount() {
        return topicDao.findTopicAppCount();
    }

    public List<AppResObj> getAppRes(String topicId) {
        return topicDao.getAppRes(topicId);
    }

    public void setTopicDao(TopicDao topicDao) {
        this.topicDao = topicDao;
    }
}
