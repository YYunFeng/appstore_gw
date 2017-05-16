package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.ClientPackageDao;
import com.jd.appstore.gateway.domain.dao.ClientPackage;
import com.jd.common.dao.BaseDao;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-6-27
 * Time: 下午2:34
 * To change this template use File | Settings | File Templates.
 */
public class ClientPackageDaoImpl extends BaseDao implements ClientPackageDao {
    public ClientPackage getClientPackage(Integer clientType) {
        return (ClientPackage) queryForObject("ClientVersion.getClientPackage", clientType);
    }
}
