package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.HomeInfoObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-28
 * Time: 下午9:40
 * To change this template use File | Settings | File Templates.
 */
public class HomeRes {
    private ResultObj resultObj ;
    private List<HomeInfoObj> homeInfoObjs;

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

    public List<HomeInfoObj> getHomeInfoObjs() {
        return homeInfoObjs;
    }

    public void setHomeInfoObjs(List<HomeInfoObj> homeInfoObjs) {
        this.homeInfoObjs = homeInfoObjs;
    }
}
