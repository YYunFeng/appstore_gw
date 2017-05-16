package com.jd.appstore.gateway.dao;

import com.jd.appstore.gateway.domain.obj.SuningPackageObj;

/**
 * Created by YUNFENG on 14-2-10.
 */
public interface SuningPackageDao {
    SuningPackageObj getSuningPackage(Integer shopId);
}
