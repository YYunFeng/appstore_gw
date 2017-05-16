package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.FillOrderDao;
import com.jd.appstore.gateway.domain.dao.Apps;
import com.jd.appstore.gateway.domain.dao.FillOrder;
import com.jd.appstore.gateway.domain.dao.FillOrderLog;
import com.jd.common.dao.BaseDao;

/**
 * User: YUNFENG
 * Date: 13-11-20
 * Time: 下午2:43
 * To change this template use File | Settings | File Templates.
 */
public class FillOrderDaoImpl extends BaseDao implements FillOrderDao {
    public FillOrder getFillOrder() {
        return (FillOrder) queryForObject("FillOrder.getFillOrder");
    }

    public void createdFillOrderLog(FillOrderLog fillOrderLog) {
        insert("FillOrder.createdFillOrderLog", fillOrderLog);
    }

    public Apps getApps(Integer appid) {
        return (Apps)queryForObject("FillOrder.getApps",appid);
    }


}
