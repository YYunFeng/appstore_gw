package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.LogDao;
import com.jd.appstore.gateway.domain.dao.parameter.LogDownloadParameter;
import com.jd.appstore.gateway.manager.LogManager;
import com.jd.common.util.SequenceUtil;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-9-5
 * Time: 下午6:07
 * To change this template use File | Settings | File Templates.
 */
public class LogManagerImpl implements LogManager {

    private LogDao logDao;
    private SequenceUtil sequenceUtil;

    public void createDownloadLog(String pin, Integer appId,String orderId, Integer downloadSucceed, Integer clientType, String uuid, String ip, String terminalModel) {
        LogDownloadParameter logDownloadParameter = new LogDownloadParameter();
        Long id = sequenceUtil.get("APP_DOWNLOAD_LOG");
        logDownloadParameter.setId(id.intValue());
        logDownloadParameter.setAppId(appId);
        logDownloadParameter.setPin(pin);
        logDownloadParameter.setOrderId(orderId);
        logDownloadParameter.setDownloadSucceed(1);
        logDownloadParameter.setClientType(clientType);
        logDownloadParameter.setUuid(uuid);
        logDownloadParameter.setIp(ip);
        logDao.createDownloadLog(logDownloadParameter);
    }


    public void setLogDao(LogDao logDao) {
        this.logDao = logDao;
    }

    public void setSequenceUtil(SequenceUtil sequenceUtil) {
        this.sequenceUtil = sequenceUtil;
    }
}
