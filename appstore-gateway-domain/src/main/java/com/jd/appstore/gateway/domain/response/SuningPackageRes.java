package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.obj.SuningPackageObj;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class SuningPackageRes {
    private SuningPackageObj suningPackageObj;
    private ResultObj resultObj;

    public SuningPackageObj getSuningPackageObj() {
        return suningPackageObj;
    }

    public void setSuningPackageObj(SuningPackageObj suningPackageObj) {
        this.suningPackageObj = suningPackageObj;
    }

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }
}
