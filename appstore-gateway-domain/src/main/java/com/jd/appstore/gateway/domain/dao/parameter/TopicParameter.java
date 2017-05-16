package com.jd.appstore.gateway.domain.dao.parameter;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-12
 * Time: 下午1:53
 * To change this template use File | Settings | File Templates.
 */
public class TopicParameter {
    /**
     * 专题类型，含义见数据库专题表中的定义
     */
    private Integer topicType;
    /**
     * 渠道ID
     */
    private Integer padChannelId;

    private Integer topicId;

    private Integer appId;
    private Integer accountId;

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
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

    private Integer offset;
    private Integer limit;

    public Integer getTopicType() {
        return topicType;
    }

    public void setTopicType(Integer topicType) {
        this.topicType = topicType;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
