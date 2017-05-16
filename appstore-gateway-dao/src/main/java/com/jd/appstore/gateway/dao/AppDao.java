package com.jd.appstore.gateway.dao;


import com.jd.appstore.gateway.domain.dao.*;
import com.jd.appstore.gateway.domain.dao.parameter.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-7
 * Time: 下午2:33
 * To change this template use File | Settings | File Templates.
 */
public interface AppDao {

    public List<AppCp> findAppCp(int appId);

    public String findAppNameById(int appId);

    public AppDownloadUrl findAppDownloadUrlByid(AppDownloadParameter appDownloadParameter);

    public AppDetails findAppDetails(AppDetailsParameter appDetailsParameter);

    public List<AppDetails> findAppDetailsByIds(String appIds);

    public List<AppResource> findAppResources(AppResourceParameter appResourceParameter);

    public List<AppSearch> searchApp(AppSearchParameter appSearchParameter);

    public Integer searchAppCounts(AppSearchParameter appSearchParameter);

    public AppUpdate findAppUpdate(AppUpdateParameter appUpdateParameter);

}
