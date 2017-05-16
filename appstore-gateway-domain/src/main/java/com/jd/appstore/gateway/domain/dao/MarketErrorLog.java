package com.jd.appstore.gateway.domain.dao;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-7-16
 * Time: 上午11:03
 * To change this template use File | Settings | File Templates.
 */
public class MarketErrorLog {
    private Integer id;
    /**
     * 错误原因
     */
    private String errorMess;
    /**
     * 日志信息
     */
    private String logMess;
    /**
     * 创建时间
     */
    private Date created;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getErrorMess() {
        return errorMess;
    }

    public void setErrorMess(String errorMess) {
        this.errorMess = errorMess;
    }

    public String getLogMess() {
        return logMess;
    }

    public void setLogMess(String logMess) {
        this.logMess = logMess;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
