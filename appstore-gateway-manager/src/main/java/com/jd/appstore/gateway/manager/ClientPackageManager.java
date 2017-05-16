package com.jd.appstore.gateway.manager;

import com.jd.appstore.gateway.domain.dao.ClientPackage;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-6-27
 * Time: 下午2:36
 * To change this template use File | Settings | File Templates.
 */
public interface ClientPackageManager {
    /**
     * 获取有效的版本
     * @return
     */
    ClientPackage getClientPackage(Integer clientType);
}
