package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.dao.Driver;
import com.jd.appstore.gateway.domain.obj.ResultObj;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-9-5
 * Time: 下午2:43
 * To change this template use File | Settings | File Templates.
 */
public class DriverSearchRes {
    private ResultObj resultObj;
    private Driver driver;

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
