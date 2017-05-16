package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.obj.SalerRankingObj;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-7-8
 * Time: 下午12:24
 * To change this template use File | Settings | File Templates.
 */
public class SalerRankingRes {
    private SalerRankingObj salerRankingObj;
    private ResultObj resultObj;
    private String mess;
    private Integer code;

    public SalerRankingObj getSalerRankingObj() {
        return salerRankingObj;
    }

    public void setSalerRankingObj(SalerRankingObj salerRankingObj) {
        this.salerRankingObj = salerRankingObj;
    }

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

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
}
