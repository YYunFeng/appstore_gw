package com.jd.appstore.gateway.dao;

import com.jd.appstore.gateway.domain.dao.Driver;
import com.jd.appstore.gateway.domain.dao.parameter.DriverParameter;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-9-5
 * Time: 下午2:25
 * To change this template use File | Settings | File Templates.
 */
public interface DriverDao {
    Driver findDriver(DriverParameter driverParameter);
}
