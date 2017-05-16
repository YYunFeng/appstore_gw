package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.FillOrderDao;
import com.jd.appstore.gateway.domain.dao.Apps;
import com.jd.appstore.gateway.domain.dao.FillOrder;
import com.jd.appstore.gateway.domain.dao.FillOrderLog;
import com.jd.appstore.gateway.manager.FillOrderManager;
import com.jd.common.manager.BaseManager;

/**
 * User: YUNFENG
 * Date: 13-11-20
 * Time: 下午2:45
 * To change this template use File | Settings | File Templates.
 */
public class FillOrderManagerImpl extends BaseManager implements FillOrderManager {
    private FillOrderDao fillOrderDao;

    public FillOrder getFillOrder() {
        return fillOrderDao.getFillOrder();
    }

    public void createdFillOrderLog(FillOrderLog fillOrderLog) {
        try {
            if (fillOrderLog != null) {
                fillOrderLog.setId((int) sequenceUtil.get("FILLORDERLOG"));
                fillOrderDao.createdFillOrderLog(fillOrderLog);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Apps getApps(Integer appid) {
        return fillOrderDao.getApps(appid);
    }


    public void setFillOrderDao(FillOrderDao fillOrderDao) {
        this.fillOrderDao = fillOrderDao;
    }
}
