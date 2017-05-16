package com.jd.appstore.gateway.manager;

import com.jd.appstore.gateway.domain.dao.Apps;
import com.jd.appstore.gateway.domain.dao.FillOrder;
import com.jd.appstore.gateway.domain.dao.FillOrderLog;

/**
 * User: YUNFENG
 * Date: 13-11-20
 * Time: 下午2:45
 * To change this template use File | Settings | File Templates.
 */
public interface FillOrderManager {
    FillOrder getFillOrder();

    void createdFillOrderLog(FillOrderLog fillOrderLog);

    Apps getApps(Integer appid);

}
