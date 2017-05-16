package com.jd.appstore.gateway.domain.obj;

/**
 * YYF on 2015-06-01.
 */
public class ActivationJSON {
    private Integer status;
    private String mess;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }
}
