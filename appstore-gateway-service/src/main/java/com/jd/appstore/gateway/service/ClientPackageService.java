package com.jd.appstore.gateway.service;

import com.jd.appstore.gateway.domain.response.ClientUpdateRes;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-6-27
 * Time: 下午2:39
 * To change this template use File | Settings | File Templates.
 */
public interface ClientPackageService {
    /**
     * 获取有效版本
     *
     * @return
     */
    ClientUpdateRes checkClientUpdate(Integer versionCode, Integer clientType);


    /**
     * 获取更新工具
     *
     * @return
     */
    ClientUpdateRes getUpdateTools(Integer versionCode);
}
