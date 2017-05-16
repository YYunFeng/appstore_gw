package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.ClientPackageDao;
import com.jd.appstore.gateway.domain.dao.ClientPackage;
import com.jd.appstore.gateway.manager.ClientPackageManager;
import com.jd.common.manager.BaseManager;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-6-27
 * Time: 下午2:37
 * To change this template use File | Settings | File Templates.
 */
public class ClientPackageManageImpl extends BaseManager implements ClientPackageManager {
    private ClientPackageDao clientPackageDao;

    public ClientPackage getClientPackage(Integer clientType) {
        return clientPackageDao.getClientPackage(clientType);
    }

    public void setClientPackageDao(ClientPackageDao clientPackageDao) {
        this.clientPackageDao = clientPackageDao;
    }
}
