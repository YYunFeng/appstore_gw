package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.MarketingLogDao;
import com.jd.appstore.gateway.domain.dao.MarketErrorLog;
import com.jd.appstore.gateway.domain.dao.parameter.AppSaleLogParameter;
import com.jd.appstore.gateway.domain.dao.parameter.SalerLogParameter;
import com.jd.appstore.gateway.manager.MarketingLogManager;
import com.jd.common.util.SequenceUtil;
import org.apache.log4j.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 13-1-30
 * Time: 上午11:00
 * To change this template use File | Settings | File Templates.
 */
public class MarketingLogManagerImpl implements MarketingLogManager {
    private MarketingLogDao marketingLogDao;
    private SequenceUtil sequenceUtil;
    Logger logger = Logger.getLogger(this.getClass());

    public void createMarketingLog(AppSaleLogParameter appSaleLogParameter) {
        logger.info("营销日志入库");
        if (appSaleLogParameter.getAppType().intValue() == 0) {  //离线应用
            logger.info("营销日志入库--离线应用");
            appSaleLogParameter.setId((int) sequenceUtil.get("OFFLINEAPP_SALE_LOG"));
            marketingLogDao.createOfflineappSaleLog(appSaleLogParameter);
        }
        if (appSaleLogParameter.getAppType().intValue() == 1) { //在线应用
            logger.info("营销日志入库--在线应用");
            appSaleLogParameter.setId((int) sequenceUtil.get("ONLINEAPP_SALE_LOG"));
            marketingLogDao.createOnlineappSaleLog(appSaleLogParameter);
        }
        logger.info("营销日志入库结束");

    }

    public void createMalketingErrorLog(MarketErrorLog marketErrorLog) {
        logger.info("错误信息入库");
        if (marketErrorLog != null) {
            marketingLogDao.createErrorLog(marketErrorLog);
        }
        logger.info("错误信息入库结束");
    }

    public void createSalerLog(SalerLogParameter salerLogParameter) {

        marketingLogDao.createSalerLog(salerLogParameter);
    }

    public MarketingLogDao getMarketingLogDao() {
        return marketingLogDao;
    }

    public void setMarketingLogDao(MarketingLogDao marketingLogDao) {
        this.marketingLogDao = marketingLogDao;
    }

    public void setSequenceUtil(SequenceUtil sequenceUtil) {
        this.sequenceUtil = sequenceUtil;
    }
}
