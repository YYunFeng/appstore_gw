package com.jd.appstore.gateway.service;

import com.jd.appstore.gateway.domain.obj.AppInfoResult;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-8-24
 * Time: 下午4:53
 * To change this template use File | Settings | File Templates.
 */
public interface AppInfoService {

    AppInfoResult setAppInfos(Object object, boolean star, boolean price, boolean download);

    void setAppsInfos(List<?> appList, boolean star, boolean price, boolean download);
}
