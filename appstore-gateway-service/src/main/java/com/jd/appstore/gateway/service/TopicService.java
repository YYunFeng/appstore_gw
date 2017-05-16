package com.jd.appstore.gateway.service;

import com.jd.appstore.gateway.domain.response.TopicAppListRes;
import com.jd.appstore.gateway.domain.response.TopicListRes;

import java.util.List;

/**
 * User: gaoyang
 * Date: 12-8-12
 * Time: 下午3:37
 * To change this template use File | Settings | File Templates.
 */
public interface TopicService {
    /**
     * 专题列表
     *
     * @param topicType
     * @param padChannelId
     * @param pageSize
     * @param pageNum
     * @return
     */
    TopicListRes findTopicList(Integer topicType, Integer padChannelId, Integer pageSize, Integer pageNum);

    /**
     * 专题下的应用列表
     *
     * @param topicId
     * @param padChannelId
     * @return
     */
    TopicAppListRes findTopicAppList(Integer topicId, Integer padChannelId);

    /**
     * 同步应用接口---新加接口
     *
     * @param padChannelId
     * @return
     */
    TopicListRes findTopicNewList(Integer padChannelId);


}
