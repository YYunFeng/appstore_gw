package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.TopicAppListRes;
import com.jd.appstore.gateway.domain.response.TopicListRes;
import com.jd.appstore.gateway.service.TopicService;

/**
 * 同步专题新加接口
 */
public class SyncAppsAction {
    private Integer topicType;
    private Integer pageNum;
    private Integer pageCount;
    private Integer topicId;
    private Integer padChannelId;

    private TopicListRes topicListRes;
    private TopicAppListRes topicAppListRes;

    private TopicService topicService;


    /**
     * 同步专题下的应用
     *
     * @return
     */
    public String syncApps() {
        topicListRes = topicService.findTopicNewList(padChannelId);
        return "list";
    }


    public Integer getTopicType() {
        return topicType;
    }

    public void setTopicType(Integer topicType) {
        this.topicType = topicType;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getPadChannelId() {
        return padChannelId;
    }

    public void setPadChannelId(Integer padChannelId) {
        this.padChannelId = padChannelId;
    }

    public TopicListRes getTopicListRes() {
        return topicListRes;
    }

    public void setTopicListRes(TopicListRes topicListRes) {
        this.topicListRes = topicListRes;
    }

    public TopicAppListRes getTopicAppListRes() {
        return topicAppListRes;
    }

    public void setTopicAppListRes(TopicAppListRes topicAppListRes) {
        this.topicAppListRes = topicAppListRes;
    }

    public void setTopicService(TopicService topicService) {
        this.topicService = topicService;
    }
}
