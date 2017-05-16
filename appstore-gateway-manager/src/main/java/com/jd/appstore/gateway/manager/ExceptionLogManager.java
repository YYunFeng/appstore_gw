package com.jd.appstore.gateway.manager;


import com.jd.appstore.gateway.domain.dao.parameter.ExceptionLogParameter;

/**
 * User: YUNFENG
 * Date: 13-11-20
 * Time: 上午11:17
 * To change this template use File | Settings | File Templates.
 */
public interface ExceptionLogManager {
    /**
     * 创建异常信息
     *
     */
    void createdExceptionLog(ExceptionLogParameter exceptionLogParameter);
}
