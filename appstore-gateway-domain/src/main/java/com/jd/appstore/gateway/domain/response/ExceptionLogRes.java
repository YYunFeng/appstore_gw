package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.ResultObj;

/**
 * User: YUNFENG
 * Date: 13-11-20
 * Time: 上午11:23
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionLogRes {
    private String mess;
    private Integer code;
    private ResultObj resultObj;

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }
}
