package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.ActivationDao;
import com.jd.appstore.gateway.domain.dao.Activation;
import com.jd.appstore.gateway.domain.dao.ActivetionLog;
import com.jd.appstore.gateway.manager.ActivationManager;
import com.jd.common.manager.BaseManager;

/**
 * Created by YYF on 2014/9/29.
 */
public class ActivationManagerImpl extends BaseManager implements ActivationManager {
    private ActivationDao activationDao;

    public void createActivation(Activation activation) {
        activationDao.createActivation(activation);
    }

    public Integer getAppByAppid(String appid) {
        return activationDao.getAppByAppid(appid);
    }

    public String appName(String appid) {
        return activationDao.appName(appid);
    }

    public Integer createActiveLog(ActivetionLog activetionLog) {
        return activationDao.createActiveLog(activetionLog);
    }

    public ActivetionLog getActiveLog(Integer id) {
        return activationDao.getActiveLog(id);
    }

    public void updateActiveLog(ActivetionLog activetionLog) {
        activationDao.updateActiveLog(activetionLog);
    }

    public void setActivationDao(ActivationDao activationDao) {
        this.activationDao = activationDao;
    }


}
