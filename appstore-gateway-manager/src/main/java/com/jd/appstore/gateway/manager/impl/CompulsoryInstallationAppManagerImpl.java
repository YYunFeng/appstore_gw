package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.CompulsoryInstallationAppDao;
import com.jd.appstore.gateway.domain.obj.CompulsoryInstallationAppObj;
import com.jd.appstore.gateway.manager.CompulsoryInstallationAppManager;
import com.jd.common.manager.BaseManager;

import java.util.List;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class CompulsoryInstallationAppManagerImpl extends BaseManager implements CompulsoryInstallationAppManager {
    private CompulsoryInstallationAppDao compulsoryInstallationAppDao;

    public List<CompulsoryInstallationAppObj> getCompulsoryInstallationApps() {
        return compulsoryInstallationAppDao.getCompulsoryInstallationApps();
    }

    public void setCompulsoryInstallationAppDao(CompulsoryInstallationAppDao compulsoryInstallationAppDao) {
        this.compulsoryInstallationAppDao = compulsoryInstallationAppDao;
    }
}
