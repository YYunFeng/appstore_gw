package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.DriverDao;
import com.jd.appstore.gateway.domain.dao.Driver;
import com.jd.appstore.gateway.domain.dao.parameter.DriverParameter;
import com.jd.common.dao.BaseDao;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-9-5
 * Time: 下午2:32
 * To change this template use File | Settings | File Templates.
 */
public class DriverDaoImpl extends BaseDao implements DriverDao{
    public Driver findDriver(DriverParameter driverParameter) {
        return (Driver) queryForObject("Driver.findDriver",driverParameter);
    }
}
