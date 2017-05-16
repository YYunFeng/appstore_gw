package com.jd.appstore.gateway.service;

import com.jd.appstore.gateway.domain.response.ExceptionLogRes;

/**
 * User: YUNFENG
 * Date: 13-11-20
 * Time: 上午11:21
 * To change this template use File | Settings | File Templates.
 */
public interface ExceptionLogService {
    ExceptionLogRes createdExceptionLog(String padImei, String saler,Integer exceptionType, String exceptionMess);
}
