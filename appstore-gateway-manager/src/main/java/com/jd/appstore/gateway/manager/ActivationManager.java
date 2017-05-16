package com.jd.appstore.gateway.manager;

import com.jd.appstore.gateway.domain.dao.Activation;
import com.jd.appstore.gateway.domain.dao.ActivetionLog;

/**
 * Created by YYF on 2014/9/29.
 */
public interface ActivationManager {

    void createActivation(Activation activation);

    Integer getAppByAppid(String appid);

    String appName(String appid);


    Integer createActiveLog(ActivetionLog activetionLog);


    ActivetionLog getActiveLog(Integer id);


    void updateActiveLog(ActivetionLog activetionLog);
}
