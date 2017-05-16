package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.ClientDao;
import com.jd.appstore.gateway.domain.dao.Client;
import com.jd.appstore.gateway.domain.dao.parameter.ClientParameter;
import com.jd.common.dao.BaseDao;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-9-5
 * Time: 下午8:03
 * To change this template use File | Settings | File Templates.
 */
public class ClientDaoImpl extends BaseDao implements ClientDao {
    public Integer checkPackageByVersion(ClientParameter clientParameter) {
        return (Integer) queryForObject("Client.checkPackageByVersion", clientParameter);
    }

    public Client findNewVersionByClientType(ClientParameter clientParameter) {
        return (Client) queryForObject("Client.findNewVersionByClientType",clientParameter);
    }
}
