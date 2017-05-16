package com.jd.appstore.gateway.domain.dao.parameter;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-8-28
 * Time: 下午10:58
 * To change this template use File | Settings | File Templates.
 */
public class FeedbackParameter {
    private Integer id;
    private String ftype;
    private String content;
    private String fuser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFuser() {
        return fuser;
    }

    public void setFuser(String fuser) {
        this.fuser = fuser;
    }
}
