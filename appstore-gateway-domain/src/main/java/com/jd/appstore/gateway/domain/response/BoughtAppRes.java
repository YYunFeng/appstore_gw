package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.AppBaseInfoObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-19
 * Time: 下午6:57
 * To change this template use File | Settings | File Templates.
 */
public class BoughtAppRes {
    private ResultObj resultObj;
    private List<AppBaseInfoObj> appBaseInfoObjs;

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

    public List<AppBaseInfoObj> getAppBaseInfoObjs() {
        return appBaseInfoObjs;
    }

    public void setAppBaseInfoObjs(List<AppBaseInfoObj> appBaseInfoObjs) {
        this.appBaseInfoObjs = appBaseInfoObjs;
    }
}
