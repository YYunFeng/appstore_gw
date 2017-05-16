package com.jd.appstore.gateway.domain.dao.parameter;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-9-5
 * Time: 下午7:54
 * To change this template use File | Settings | File Templates.
 */
public class ClientParameter {
    private Integer clientType;
    private String version;

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
