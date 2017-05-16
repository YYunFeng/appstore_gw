package com.jd.appstore.gateway.dao;

import com.jd.appstore.gateway.domain.dao.Apps;
import com.jd.appstore.gateway.domain.dao.FillOrder;
import com.jd.appstore.gateway.domain.dao.FillOrderLog;

/**
 * 补订单
 * User: YUNFENG
 * Date: 13-11-20
 * Time: 下午2:41
 * To change this template use File | Settings | File Templates.
 */
public interface FillOrderDao {
    FillOrder getFillOrder();

    void createdFillOrderLog(FillOrderLog fillOrderLog);

    Apps getApps(Integer appid);
}
