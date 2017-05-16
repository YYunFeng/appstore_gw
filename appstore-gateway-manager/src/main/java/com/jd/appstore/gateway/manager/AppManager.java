package com.jd.appstore.gateway.manager;

import com.jd.appstore.gateway.domain.dao.*;
import com.jd.common.util.PaginatedList;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-18
 * Time: 下午8:16
 * To change this template use File | Settings | File Templates.
 */
public interface AppManager {
    List<AppCp> findAppCp(int appId);

    AppDetails findAppDetails(Integer appId, Integer detailsId);

    List<AppResource> findAppResourceByAppId(Integer appId, Integer detailsId);

    String findAppNameById(int appId);

    AppDownloadUrl findAppDownloadUrlById(Integer appId, Integer detailsId);

    PaginatedList<AppSearch> searchApp(String keyword, Integer categoryId,int pageIndex, int pageSize);

    AppUpdate findAppUpdate(String packageName, Integer appVersionCode);

    List<AppDetails> findAppDetailsByIds(String appIds);
}
