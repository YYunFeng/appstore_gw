package com.jd.appstore.gateway.domain.dao;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-9-5
 * Time: 下午7:49
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    
    private String version;
    private Integer clientType;
    private String packageUrl;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public String getPackageUrl() {
        return packageUrl;
    }

    public void setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
    }
}
