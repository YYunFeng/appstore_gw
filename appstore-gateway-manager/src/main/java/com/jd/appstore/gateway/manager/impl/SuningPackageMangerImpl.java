package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.SuningPackageDao;
import com.jd.appstore.gateway.domain.obj.SuningPackageObj;
import com.jd.appstore.gateway.manager.SuningPackageManger;
import com.jd.common.manager.BaseManager;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class SuningPackageMangerImpl extends BaseManager implements SuningPackageManger {
    private SuningPackageDao suningPackageDao;

    public SuningPackageObj getSuningPackage(Integer shopId) {
        return suningPackageDao.getSuningPackage(shopId);
    }

    public void setSuningPackageDao(SuningPackageDao suningPackageDao) {
        this.suningPackageDao = suningPackageDao;
    }
}
