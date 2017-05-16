package com.jd.appstore.gateway.manager;

import com.jd.appstore.gateway.domain.dao.PadUpdateLog;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-7-5
 * Time: 下午5:15
 * To change this template use File | Settings | File Templates.
 */
public interface PadUpdateLogManager {

    /**
     * 获得pad更新日志
     *
     * @param imeiNumber
     * @return
     */
    PadUpdateLog getPadUpdateLog(String imeiNumber);

    /**
     * 更新pad更新日志
     *
     * @param padUpdateLog
     */
    void updatePadUpdateLog(PadUpdateLog padUpdateLog);
}
