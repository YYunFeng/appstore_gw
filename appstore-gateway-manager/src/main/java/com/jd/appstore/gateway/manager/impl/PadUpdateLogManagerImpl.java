package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.PadUpdateLogDao;
import com.jd.appstore.gateway.domain.dao.PadUpdateLog;
import com.jd.appstore.gateway.manager.PadUpdateLogManager;
import com.jd.common.manager.BaseManager;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-7-5
 * Time: 下午5:16
 * To change this template use File | Settings | File Templates.
 */
public class PadUpdateLogManagerImpl extends BaseManager implements PadUpdateLogManager {
    private PadUpdateLogDao padUpdateLogDao;


    public PadUpdateLog getPadUpdateLog(String imeiNumber) {
        return padUpdateLogDao.getPadUpdateLog(imeiNumber);
    }


    public void updatePadUpdateLog(PadUpdateLog padUpdateLog) {
        padUpdateLogDao.updatePadUpdateLog(padUpdateLog);
    }

    public void setPadUpdateLogDao(PadUpdateLogDao padUpdateLogDao) {
        this.padUpdateLogDao = padUpdateLogDao;
    }
}
