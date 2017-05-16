package com.jd.appstore.gateway.manager;

import com.jd.appstore.gateway.domain.obj.CompulsoryInstallationAppObj;

import java.util.List;

/**
 * Created by YUNFENG on 14-2-10.
 */
public interface CompulsoryInstallationAppManager {
    List<CompulsoryInstallationAppObj> getCompulsoryInstallationApps();
}
