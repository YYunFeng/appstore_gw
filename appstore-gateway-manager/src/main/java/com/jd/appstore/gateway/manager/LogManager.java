package com.jd.appstore.gateway.manager;

/**
 * User: xietieyun
 * Date: 12-9-5
 * Time: 下午6:05
 * To change this template use File | Settings | File Templates.
 */
public interface LogManager {
    void createDownloadLog(String pin, Integer appId, String orderId, Integer downloadSucceed, Integer clientType, String uuid, String ip, String terminalModel);
}
