package com.jd.appstore.gateway.dao;

import com.jd.appstore.gateway.domain.dao.Client;
import com.jd.appstore.gateway.domain.dao.parameter.ClientParameter;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-9-5
 * Time: 下午7:48
 * To change this template use File | Settings | File Templates.
 */
public interface ClientDao {

    Integer checkPackageByVersion(ClientParameter clientParameter);
    Client findNewVersionByClientType(ClientParameter clientParameter);

}
