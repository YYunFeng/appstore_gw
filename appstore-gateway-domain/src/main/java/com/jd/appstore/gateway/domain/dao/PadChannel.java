package com.jd.appstore.gateway.domain.dao;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 13-1-29
 * Time: 下午3:39
 * To change this template use File | Settings | File Templates.
 */
public class PadChannel {
    private Integer id;
    // 渠道名称
    private String cname;
    // 渠道说明
    private String intro;
    //网关地址前缀
    private String gw;
    // 渠道的创建时间
    private Date created;

    public String getGw() {
        return gw;
    }

    public void setGw(String gw) {
        this.gw = gw;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

}
