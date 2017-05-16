package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.ExceptionLogDao;
import com.jd.appstore.gateway.domain.dao.parameter.ExceptionLogParameter;
import com.jd.appstore.gateway.manager.ExceptionLogManager;
import com.jd.common.manager.BaseManager;

/**
 * User: YUNFENG
 * Date: 13-11-20
 * Time: 上午11:18
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionLogManagerImpl extends BaseManager implements ExceptionLogManager {
    private ExceptionLogDao exceptionLogDao;

    public void createdExceptionLog(ExceptionLogParameter exceptionLogParameter) {
        try {
            exceptionLogDao.createdExceptionLog(exceptionLogParameter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setExceptionLogDao(ExceptionLogDao exceptionLogDao) {
        this.exceptionLogDao = exceptionLogDao;
    }
}
