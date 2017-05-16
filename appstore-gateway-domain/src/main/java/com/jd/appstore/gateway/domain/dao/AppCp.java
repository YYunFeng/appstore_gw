package com.jd.appstore.gateway.domain.dao;


/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-21
 * Time: 下午10:30
 * To change this template use File | Settings | File Templates.
 */
public class AppCp {
    private Integer detailsId;
    private String cpName;
    private String email;

    public Integer getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(Integer detailsId) {
        this.detailsId = detailsId;
    }

    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
