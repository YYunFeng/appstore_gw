package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.HomeDao;
import com.jd.appstore.gateway.domain.constant.ClientConstant;
import com.jd.appstore.gateway.domain.constant.HomeInfoConstant;
import com.jd.appstore.gateway.domain.dao.HomeInfo;
import com.jd.appstore.gateway.domain.dao.parameter.HomeInfoParameter;
import com.jd.appstore.gateway.manager.HomeManager;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-21
 * Time: 下午6:26
 * To change this template use File | Settings | File Templates.
 */
public class HomeManagerImpl implements HomeManager {

    private HomeDao homeDao;

    public List<HomeInfo> findHomeInfo(Integer clientType) {
        HomeInfoParameter homeInfoParameter = new HomeInfoParameter();
        homeInfoParameter.setClientType(clientType);
        if (ClientConstant.ANDROID_PHONE_CLIENT == clientType.intValue()) {
            homeInfoParameter.setModuleId(HomeInfoConstant.ANDROID_PHONE_HOMEINFO_MODULEID);
            homeInfoParameter.setAreaId(HomeInfoConstant.ANDROID_PHONE_HOMEINFO_AREAID);
        } else if (ClientConstant.ANDROID_PAD_CLIENT == clientType.intValue()) {
            homeInfoParameter.setModuleId(HomeInfoConstant.ANDROID_PAD_HOMEINFO_MODULEID);
            homeInfoParameter.setAreaId(HomeInfoConstant.ANDROID_PAD_HOMEINFO_AREAID);
        }
        return homeDao.findHomeInfo(homeInfoParameter);  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setHomeDao(HomeDao homeDao) {
        this.homeDao = homeDao;
    }
}
