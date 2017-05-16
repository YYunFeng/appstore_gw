package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.dao.Saler;
import com.jd.appstore.gateway.domain.obj.ResultObj;

/**
 * YYF on 2015/4/2.
 */
public class SalerRes {
    private ResultObj resultObj;
    private Saler saler;

    public Saler getSaler() {
        return saler;
    }

    public void setSaler(Saler saler) {
        this.saler = saler;
    }

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }
}
