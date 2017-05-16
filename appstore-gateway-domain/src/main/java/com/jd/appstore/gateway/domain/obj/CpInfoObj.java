package com.jd.appstore.gateway.domain.obj;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-8
 * Time: 下午6:26
 * To change this template use File | Settings | File Templates.
 */
public class CpInfoObj {

    private Integer detailsId;
    private String cpName;
    private Boolean defaultDetails;
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

    public Boolean getDefaultDetails() {
        return defaultDetails;
    }

    public void setDefaultDetails(Boolean defaultDetails) {
        this.defaultDetails = defaultDetails;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
