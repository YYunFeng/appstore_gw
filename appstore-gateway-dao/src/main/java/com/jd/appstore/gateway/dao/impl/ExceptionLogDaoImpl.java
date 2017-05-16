package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.ExceptionLogDao;
import com.jd.appstore.gateway.domain.dao.parameter.ExceptionLogParameter;
import com.jd.common.dao.BaseDao;

/**
 * User: YUNFENG
 * Date: 13-11-20
 * Time: 上午11:14
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionLogDaoImpl extends BaseDao implements ExceptionLogDao {
    public void createdExceptionLog(ExceptionLogParameter exceptionLogParameter) {
        insert("ExceptionLog.createExceptionLog", exceptionLogParameter);
    }
}
