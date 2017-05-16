package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.CountAppDao;
import com.jd.appstore.gateway.domain.dao.CountApp;
import com.jd.appstore.gateway.manager.CountAppManager;
import com.jd.common.manager.BaseManager;

import java.util.List;

/**
 * Created by YUNFENG on 14-2-11.
 */
public class CountAppManagerImpl extends BaseManager implements CountAppManager {
    private CountAppDao countAppDao;

    public void createCountApp(CountApp countApp) {
        countAppDao.createCountApp(countApp);
    }

    public List<String> getCountAppid(List<String> packageName) {
        return countAppDao.getCountAppid(packageName);
    }


    public void setCountAppDao(CountAppDao countAppDao) {
        this.countAppDao = countAppDao;
    }
}
