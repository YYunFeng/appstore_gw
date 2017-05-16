package com.jd.appstore.gateway.dao;

import com.jd.appstore.gateway.domain.dao.parameter.ExceptionLogParameter;

/**
 * User: YUNFENG
 * Date: 13-11-20
 * Time: 上午11:13
 * To change this template use File | Settings | File Templates.
 */
public interface ExceptionLogDao {
    /**
     * 创建异常信息
     *
     * @param exceptionLogParameter
     */
    void createdExceptionLog(ExceptionLogParameter exceptionLogParameter);
}


