package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.SuningPackageDao;
import com.jd.appstore.gateway.domain.obj.SuningPackageObj;
import com.jd.common.dao.BaseDao;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class SuningPackageDaoImpl extends BaseDao implements SuningPackageDao {

    public SuningPackageObj getSuningPackage(Integer shopId) {
        return (SuningPackageObj) queryForObject("SuningPackage.getSuningPackage", shopId);
    }
}
