package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.ProvinceObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;

import java.util.List;

/**
 * YYF on 2015/4/3.
 */
public class ProvinceRes {

    private List<ProvinceObj> provinceObjList;
    private ResultObj resultObj;

    public List<ProvinceObj> getProvinceObjList() {
        return provinceObjList;
    }

    public void setProvinceObjList(List<ProvinceObj> provinceObjList) {
        this.provinceObjList = provinceObjList;
    }

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }
}
