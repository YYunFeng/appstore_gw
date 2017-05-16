package com.jd.appstore.gateway.manager.impl;


import com.jd.appstore.gateway.dao.DriverDao;
import com.jd.appstore.gateway.domain.dao.Driver;
import com.jd.appstore.gateway.domain.dao.parameter.DriverParameter;
import com.jd.appstore.gateway.manager.DriverManager;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-9-5
 * Time: 下午2:41
 * To change this template use File | Settings | File Templates.
 */
public class DriverManagerImpl implements DriverManager {
    private DriverDao driverDao;

    public Driver findDriver(String vid, String pid) {
        DriverParameter driverParameter = new DriverParameter();
        driverParameter.setPid(pid);
        driverParameter.setVid(vid);
        return driverDao.findDriver(driverParameter);
    }

    public void setDriverDao(DriverDao driverDao) {
        this.driverDao = driverDao;
    }
}
