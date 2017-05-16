package com.jd.appstore.gateway.service;

import com.jd.appstore.gateway.domain.response.AppDetailsRes;
import com.jd.appstore.gateway.domain.response.AppDownloadRes;
import com.jd.appstore.gateway.domain.response.AppSearchRes;
import com.jd.appstore.gateway.domain.response.AppUpdateRes;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-30
 * Time: 下午2:03
 * To change this template use File | Settings | File Templates.
 */
public interface AppService {

    AppSearchRes search(String keyword, Integer cid, Integer appType, Integer fee, Integer op, Integer od, Integer ou, Integer oc, Integer og, Integer pageNum, Integer pageSize, Integer clientType);

    AppDetailsRes details(Integer appId, Integer detailsId) throws Exception;

    AppDownloadRes download(Integer appId, Integer detailsId, Integer clientType, String uuid, Integer first, String staffMobile, String staffId, String channelId, String areaProvinceId);

    AppUpdateRes update(String appsInfo);

}
