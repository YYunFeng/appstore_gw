package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.AppBaseInfoObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-20
 * Time: 下午2:58
 * To change this template use File | Settings | File Templates.
 */
public class FollowListRes {
    private ResultObj resultObj;
    private Integer tan;
    private Integer tp;
    private List<AppBaseInfoObj> appBaseInfoObjs;

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

    public Integer getTan() {
        return tan;
    }

    public void setTan(Integer tan) {
        this.tan = tan;
    }

    public Integer getTp() {
        return tp;
    }

    public void setTp(Integer tp) {
        this.tp = tp;
    }

    public List<AppBaseInfoObj> getAppBaseInfoObjs() {
        return appBaseInfoObjs;
    }

    public void setAppBaseInfoObjs(List<AppBaseInfoObj> appBaseInfoObjs) {
        this.appBaseInfoObjs = appBaseInfoObjs;
    }
}
