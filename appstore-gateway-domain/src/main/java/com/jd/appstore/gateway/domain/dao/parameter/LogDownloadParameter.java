package com.jd.appstore.gateway.domain.dao.parameter;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-9-5
 * Time: 下午5:51
 * To change this template use File | Settings | File Templates.
 */
public class LogDownloadParameter {

    private Integer id;
    private String pin;
    private Integer appId;
    private String orderId;
    private Integer downloadSucceed;
    private Integer clientType;
    private String uuid;
    private String ip;
    private String terminalModel;

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getDownloadSucceed() {
        return downloadSucceed;
    }

    public void setDownloadSucceed(Integer downloadSucceed) {
        this.downloadSucceed = downloadSucceed;
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTerminalModel() {
        return terminalModel;
    }

    public void setTerminalModel(String terminalModel) {
        this.terminalModel = terminalModel;
    }
}
