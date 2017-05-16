package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.PadUpdateLogDao;
import com.jd.appstore.gateway.domain.dao.PadUpdateLog;
import com.jd.common.dao.BaseDao;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-7-5
 * Time: 下午5:10
 * To change this template use File | Settings | File Templates.
 */
public class PadUpdateLogDaoImpl extends BaseDao implements PadUpdateLogDao {
    /**
     * 获得pad更新日志
     *
     * @param imeiNumber
     * @return
     */
    public PadUpdateLog getPadUpdateLog(String imeiNumber) {
        return (PadUpdateLog) queryForObject("PadUpdateLog.getPadUpdateLog", imeiNumber);
    }

    /**
     * 更新pad更新日志
     *
     * @param padUpdateLog
     */
    public void updatePadUpdateLog(PadUpdateLog padUpdateLog) {
        update("PadUpdateLog.updatePadUpdateLog", padUpdateLog);
    }
}
