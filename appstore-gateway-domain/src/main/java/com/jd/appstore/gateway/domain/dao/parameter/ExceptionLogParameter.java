package com.jd.appstore.gateway.domain.dao.parameter;

/**
 * User: YUNFENG
 * Date: 13-11-20
 * Time: 上午11:09
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionLogParameter {
    private Integer id;
    private String padImei;
    private String saler;
    private Integer exceptionType;
    private String exceptionMess;


    public Integer getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(Integer exceptionType) {
        this.exceptionType = exceptionType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPadImei() {
        return padImei;
    }

    public void setPadImei(String padImei) {
        this.padImei = padImei;
    }

    public String getSaler() {
        return saler;
    }

    public void setSaler(String saler) {
        this.saler = saler;
    }

    public String getExceptionMess() {
        return exceptionMess;
    }

    public void setExceptionMess(String exceptionMess) {
        this.exceptionMess = exceptionMess;
    }
}
