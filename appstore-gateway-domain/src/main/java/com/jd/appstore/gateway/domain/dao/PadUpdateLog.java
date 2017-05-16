package com.jd.appstore.gateway.domain.dao;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-7-5
 * Time: 下午4:51
 * To change this template use File | Settings | File Templates.
 */
public class PadUpdateLog {
    private Integer id;
    private String imeiNumber;
    private Date updateTime; // 同步应用时间
    private Date uploadLogTime; // 上传日志时间
    private Date updateVersionTime; // 更新客户端版本时间


    public Date getUploadLogTime() {
        return uploadLogTime;
    }

    public void setUploadLogTime(Date uploadLogTime) {
        this.uploadLogTime = uploadLogTime;
    }

    public Date getUpdateVersionTime() {
        return updateVersionTime;
    }

    public void setUpdateVersionTime(Date updateVersionTime) {
        this.updateVersionTime = updateVersionTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImeiNumber() {
        return imeiNumber;
    }

    public void setImeiNumber(String imeiNumber) {
        this.imeiNumber = imeiNumber;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
