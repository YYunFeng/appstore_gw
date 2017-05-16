package com.jd.appstore.gateway.manager;

import com.jd.appstore.gateway.domain.dao.Driver;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-9-5
 * Time: 下午2:41
 * To change this template use File | Settings | File Templates.
 */
public interface DriverManager {
    Driver findDriver(String vid,String pid);
}
