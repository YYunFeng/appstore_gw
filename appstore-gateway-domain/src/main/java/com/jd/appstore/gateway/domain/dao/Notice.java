package com.jd.appstore.gateway.domain.dao;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-8-28
 * Time: 下午4:21
 * To change this template use File | Settings | File Templates.
 */
public class Notice {
    
    private Integer id;
    private String subject;
    private String content;
    private Date pubTime;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPubTime() {
        return pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }
}
