package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.AppDao;
import com.jd.appstore.gateway.domain.dao.*;
import com.jd.appstore.gateway.domain.dao.parameter.*;
import com.jd.common.dao.BaseDao;
import com.jd.common.util.Query;

import java.util.List;

/**
 * User: gaoyang
 * Date: 12-8-7
 * Time: 下午2:33
 * To change this template use File | Settings | File Templates.
 */
public class AppDaoImpl extends BaseDao implements AppDao {

    public List<AppCp> findAppCp(int appId) {
        return queryForList("App.findAppCp", appId);
    }

    public String findAppNameById(int appId) {
        return (String) queryForObject("App.findAppName", appId);
    }

    public AppDownloadUrl findAppDownloadUrlByid(AppDownloadParameter appDownloadParameter) {
        return (AppDownloadUrl) queryForObject("App.findAppDownloadUrl", appDownloadParameter);
    }

    public AppDetails findAppDetails(AppDetailsParameter appDetailsParameter) {
        return (AppDetails) queryForObject("App.findAppDetails", appDetailsParameter);
    }

    public List<AppDetails> findAppDetailsByIds(String appIds) {
        return queryForList("App.findAppDetailsByIds", appIds);
    }

    public List<AppResource> findAppResources(AppResourceParameter appResourceParameter) {
        return queryForList("App.findAppResource", appResourceParameter);
    }

    public List<AppSearch> searchApp(AppSearchParameter appSearchParameter) {
        return queryForList("App.searchApp", appSearchParameter);
    }


    public Integer searchAppCounts(AppSearchParameter appSearchParameter) {
        return (Integer) queryForObject("App.searchAppCounts", appSearchParameter);
    }

    public Integer searchAppCount(AppSearchParameter appSearchParameter) {
        return (Integer)queryForObject("App.searchAppCount",appSearchParameter);
    }

    public AppUpdate findAppUpdate(AppUpdateParameter appUpdateParameter) {
        return (AppUpdate) queryForObject("App.findAppUpdate", appUpdateParameter);
    }

}
