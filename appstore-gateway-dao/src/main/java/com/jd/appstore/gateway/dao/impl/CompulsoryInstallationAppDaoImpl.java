package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.CompulsoryInstallationAppDao;
import com.jd.appstore.gateway.domain.obj.CompulsoryInstallationAppObj;
import com.jd.common.dao.BaseDao;

import java.util.List;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class CompulsoryInstallationAppDaoImpl extends BaseDao implements CompulsoryInstallationAppDao {
    public List<CompulsoryInstallationAppObj> getCompulsoryInstallationApps() {
        return queryForList("CompulsoryInstallation.getCompulsoryInstallationApps");
    }
}
