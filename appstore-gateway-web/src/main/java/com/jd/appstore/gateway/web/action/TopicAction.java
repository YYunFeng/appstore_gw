package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.TopicAppListRes;
import com.jd.appstore.gateway.domain.response.TopicListRes;
import com.jd.appstore.gateway.service.TopicService;
import com.jd.common.struts.action.BaseAction;
import org.apache.log4j.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-24
 * Time: 下午6:31
 * To change this template use File | Settings | File Templates.
 */
public class TopicAction extends BaseAction {

    private Integer topicType;
    private Integer pageNum;
    private Integer pageCount;
    private Integer topicId;
    private Integer padChannelId;

    private TopicListRes topicListRes;
    private TopicAppListRes topicAppListRes;

    private TopicService topicService;

    private Logger logger = Logger.getLogger(this.getClass());

    /**
     * 专题下的应用列表
     * @return
     */
    public String AppList() {
        topicAppListRes = topicService.findTopicAppList(topicId,padChannelId);
        return "appList";
    }

    /**
     * 专题列表
     * @return
     */
    public String List() {
        topicListRes = topicService.findTopicList(topicType,padChannelId, pageCount, pageNum);
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

    public TopicListRes getTopicListRes() {
        return topicListRes;
    }

    public void setTopicListRes(TopicListRes topicListRes) {
        this.topicListRes = topicListRes;
    }

    public void setTopicService(TopicService topicService) {
        this.topicService = topicService;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public TopicAppListRes getTopicAppListRes() {
        return topicAppListRes;
    }

    public void setTopicAppListRes(TopicAppListRes topicAppListRes) {
        this.topicAppListRes = topicAppListRes;
    }

    public Integer getPadChannelId() {
        return padChannelId;
    }

    public void setPadChannelId(Integer padChannelId) {
        this.padChannelId = padChannelId;
    }
}
