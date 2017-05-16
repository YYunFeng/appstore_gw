package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.ActivationDao;
import com.jd.appstore.gateway.domain.dao.Activation;
import com.jd.appstore.gateway.domain.dao.ActivetionLog;
import com.jd.common.dao.BaseDao;

/**
 * Created by YYF on 2014/9/29.
 */
public class ActivationDaoImpl extends BaseDao implements ActivationDao {
    public void createActivation(Activation activation) {
        insert("Activation.createActivation", activation);
    }

    public Integer getAppByAppid(String appid) {
        return (Integer) queryForObject("Activation.getApp", appid);
    }

    public String appName(String appid) {
        return (String) queryForObject("Activation.getAppName", appid);
    }

    public Integer createActiveLog(ActivetionLog activetionLog) {
        return (Integer) insert("Activation.createActiveLog", activetionLog);
    }

    public ActivetionLog getActiveLog(Integer id) {
        return (ActivetionLog) queryForObject("Activation.getActiveLog", id);
    }

    public void updateActiveLog(ActivetionLog activetionLog) {
        update("Activation.updateActiveLog", activetionLog);
    }


}
