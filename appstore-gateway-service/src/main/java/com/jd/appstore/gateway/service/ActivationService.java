package com.jd.appstore.gateway.service;

import com.jd.appstore.gateway.domain.dao.Activation;
import com.jd.appstore.gateway.domain.dao.ActivetionLog;
import com.jd.appstore.gateway.domain.obj.ActivationObj;
import com.jd.appstore.gateway.domain.response.ActivationRes;
import com.jd.common.web.result.Result;

/**
 * Created by YYF on 2014/9/29.
 */
public interface ActivationService {

    ActivationRes createActivation(ActivationObj activationObj);

    void createActive(Activation activation);

    Result appName(String appid);


    Integer createActiveLog(ActivetionLog activetionLog);


    ActivetionLog getActiveLog(Integer id);


    void updateActiveLog(ActivetionLog activetionLog);
}
