package com.jd.appstore.gateway.domain.dao;

import java.util.Date;

/**
 * 补订单
 * User: YUNFENG
 * Date: 13-11-19
 * Time: 下午5:07
 * To change this template use File | Settings | File Templates.
 */
public class FillOrder {
    private Integer id;
    // 下载类型  0：只建立连接  1：下载一定百分比  2：全部下载
    private Integer type;
    // 下载的百分比
    private Integer percentage;
    private Date created;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
