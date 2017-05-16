package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.dao.parameter.ExceptionLogParameter;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.ExceptionLogRes;
import com.jd.appstore.gateway.manager.ExceptionLogManager;
import com.jd.appstore.gateway.service.ExceptionLogService;
import org.apache.commons.lang.StringUtils;

/**
 * User: YUNFENG
 * Date: 13-11-20
 * Time: 上午11:27
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionLogServiceImpl implements ExceptionLogService {
    private ExceptionLogManager exceptionLogManager;

    public ExceptionLogRes createdExceptionLog(String padImei, String saler, Integer exceptionType, String exceptionMess) {
        ExceptionLogRes exceptionLogRes = new ExceptionLogRes();
        try {
            if (exceptionMess != null) {
                ExceptionLogParameter exceptionLogParameter = new ExceptionLogParameter();
                if (StringUtils.isNotBlank(padImei)) {
                    exceptionLogParameter.setPadImei(padImei);
                }
                if (StringUtils.isNotBlank(saler)) {
                    exceptionLogParameter.setSaler(saler);
                }
                if (exceptionType != null) {
                    exceptionLogParameter.setExceptionType(exceptionType);
                }
                exceptionLogParameter.setExceptionMess(exceptionMess);
                exceptionLogManager.createdExceptionLog(exceptionLogParameter);
                exceptionLogRes.setCode(1);
                exceptionLogRes.setMess("上报成功");
                exceptionLogRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
            } else {
                exceptionLogRes.setCode(0);
                exceptionLogRes.setMess("参数错误");
                exceptionLogRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            }
        } catch (Exception e) {
            exceptionLogRes.setCode(0);
            exceptionLogRes.setMess("系统异常");
            exceptionLogRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return exceptionLogRes;
    }

    public void setExceptionLogManager(ExceptionLogManager exceptionLogManager) {
        this.exceptionLogManager = exceptionLogManager;
    }
}
