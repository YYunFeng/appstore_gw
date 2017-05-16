package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.CollectUpdateDao;
import com.jd.appstore.gateway.manager.CollectUpdateManager;
import com.jd.common.manager.BaseManager;

import java.util.List;

/**
 * Created by YUNFENG on 13-12-16.
 */
public class CollectUpdateManagerImpl extends BaseManager implements CollectUpdateManager {
    private CollectUpdateDao collectUpdateDao;

    public List<String> getCollectUpdateAppids(String appids) {
        return collectUpdateDao.getCollectUpdateAppids(appids);
    }

    public void setCollectUpdateDao(CollectUpdateDao collectUpdateDao) {
        this.collectUpdateDao = collectUpdateDao;
    }
}
