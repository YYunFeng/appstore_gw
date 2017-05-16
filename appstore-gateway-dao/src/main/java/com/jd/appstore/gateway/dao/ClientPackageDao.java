package com.jd.appstore.gateway.dao;


import com.jd.appstore.gateway.domain.dao.ClientPackage;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-6-27
 * Time: 下午2:32
 * To change this template use File | Settings | File Templates.
 */
public interface ClientPackageDao {
    /**
     * 获取上线的客户端包
     *
     * @return
     */
    ClientPackage getClientPackage(Integer clientType);
}
