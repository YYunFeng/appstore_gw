package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.obj.RewardStatisticObj;
import com.jd.appstore.gateway.domain.obj.SalerQueryObj;
import com.jd.appstore.gateway.domain.obj.SalerQueryObjNew;

import java.util.List;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class SalerQueryRes {

    private ResultObj resultObj;
    private List<SalerQueryObj> salerQueryObjList;
    private SalerQueryObjNew salerQueryObj;


    public SalerQueryObjNew getSalerQueryObj() {
        return salerQueryObj;
    }

    public void setSalerQueryObj(SalerQueryObjNew salerQueryObj) {
        this.salerQueryObj = salerQueryObj;
    }

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

    public List<SalerQueryObj> getSalerQueryObjList() {
        return salerQueryObjList;
    }

    public void setSalerQueryObjList(List<SalerQueryObj> salerQueryObjList) {
        this.salerQueryObjList = salerQueryObjList;
    }
}
