package com.jd.appstore.gateway.service;

import com.jd.appstore.gateway.domain.response.PadUpdateLogRes;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-7-5
 * Time: 下午5:19
 * To change this template use File | Settings | File Templates.
 */
public interface PadUpdateLogService {
    /**
     * 记录pad更新日志
     *
     * @param imeiNumber
     * @param updateTime
     * @return
     */
    PadUpdateLogRes recordPadUpdateLog(String imeiNumber, Long updateTime,Integer type);
}
