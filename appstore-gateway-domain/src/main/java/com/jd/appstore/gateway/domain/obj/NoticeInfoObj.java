package com.jd.appstore.gateway.domain.obj;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-20
 * Time: 下午2:08
 * To change this template use File | Settings | File Templates.
 */
public class NoticeInfoObj {
    /**
     *资讯ID
     */
    private Integer id;
    /**
     *资讯标题
     */
    private String subject;
    /**
     *发布时间
     */
    private Date pubTime;
    /**
     * 资讯内容，需要URL转义
     */
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getPubTime() {
        return pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

