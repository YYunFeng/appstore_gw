package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.AppBaseInfoObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-20
 * Time: 下午2:55
 * To change this template use File | Settings | File Templates.
 */
public class RankingAppsRes {
    private ResultObj resultObj;
    private Integer tp;
    private Integer an;

    public Integer getTp() {
        return tp;
    }

    public void setTp(Integer tp) {
        this.tp = tp;
    }

    public Integer getAn() {
        return an;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

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
