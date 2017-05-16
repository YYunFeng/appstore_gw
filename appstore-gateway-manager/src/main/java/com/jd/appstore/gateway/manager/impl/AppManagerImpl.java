package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.AppDao;
import com.jd.appstore.gateway.domain.dao.*;
import com.jd.appstore.gateway.domain.dao.parameter.*;
import com.jd.appstore.gateway.manager.AppManager;
import com.jd.common.manager.BaseManager;
import com.jd.common.util.PaginatedList;
import com.jd.common.util.base.PaginatedArrayList;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-18
 * Time: 下午8:17
 * To change this template use File | Settings | File Templates.
 */
public class AppManagerImpl extends BaseManager implements AppManager {
    private AppDao appDao;

    public List<AppCp> findAppCp(int appId) {
        return appDao.findAppCp(appId);
    }

    public AppDetails findAppDetails(Integer appId, Integer detailsId) {
        AppDetailsParameter appDetailsParameter = new AppDetailsParameter();
        appDetailsParameter.setAppId(appId);
        appDetailsParameter.setDetailsId(detailsId);
        return appDao.findAppDetails(appDetailsParameter);
    }

    public List<AppResource> findAppResourceByAppId(Integer appId, Integer detailsId) {
        AppResourceParameter appResourceParameter = new AppResourceParameter();
        appResourceParameter.setAppId(appId);
        appResourceParameter.setDetailsId(detailsId);
        return appDao.findAppResources(appResourceParameter);
    }

    public String findAppNameById(int appId) {
        return appDao.findAppNameById(appId);
    }

    public AppDownloadUrl findAppDownloadUrlById(Integer appId, Integer detailsId) {
        AppDownloadParameter appDownloadParameter = new AppDownloadParameter();
        appDownloadParameter.setAppId(appId);
        appDownloadParameter.setDetailsId(detailsId);
        return appDao.findAppDownloadUrlByid(appDownloadParameter);
    }

    public PaginatedList<AppSearch> searchApp(String keyword, Integer categoryId, int pageIndex, int pageSize) {
        if (0 == pageIndex) pageIndex = 1;
        AppSearchParameter appSearchParameter = new AppSearchParameter();
        appSearchParameter.setCategoryId(categoryId);
        appSearchParameter.setKeyword(keyword);
        PaginatedList<AppSearch> appSearches = new PaginatedArrayList<AppSearch>(pageIndex, pageSize);
        int total = appDao.searchAppCounts(appSearchParameter);
        if (total > 0) {
            appSearches.setTotalItem(total);
            appSearchParameter.setLimit(pageSize);
            appSearchParameter.setOffset((pageIndex - 1) * pageSize);
            List<AppSearch> list = appDao.searchApp(appSearchParameter);
            appSearches.addAll(list);
        }
        return appSearches;
    }

    public AppUpdate findAppUpdate(String packageName, Integer appVersionCode) {
        AppUpdateParameter appUpdateParameter = new AppUpdateParameter();
        appUpdateParameter.setPackageName(packageName);
        appUpdateParameter.setAppVersionCode(appVersionCode);
        return appDao.findAppUpdate(appUpdateParameter);  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<AppDetails> findAppDetailsByIds(String appIds) {
        return appDao.findAppDetailsByIds(appIds);
    }


    public void setAppDao(AppDao appDao) {
        this.appDao = appDao;
    }
}
