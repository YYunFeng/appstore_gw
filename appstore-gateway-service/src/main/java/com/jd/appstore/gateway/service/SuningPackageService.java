package com.jd.appstore.gateway.service;

import com.jd.appstore.gateway.domain.response.AppDownloadRes;

/**
 * Created by YUNFENG on 14-2-10.
 */
public interface SuningPackageService {
    AppDownloadRes getSuningPackage(Integer shopId);
}
