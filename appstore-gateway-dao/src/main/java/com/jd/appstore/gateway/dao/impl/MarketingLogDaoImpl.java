package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.MarketingLogDao;
import com.jd.appstore.gateway.domain.dao.MarketErrorLog;
import com.jd.appstore.gateway.domain.dao.parameter.AppSaleLogParameter;
import com.jd.appstore.gateway.domain.dao.parameter.SalerLogParameter;
import com.jd.common.dao.BaseDao;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 13-1-30
 * Time: 上午10:54
 * To change this template use File | Settings | File Templates.
 */
public class MarketingLogDaoImpl extends BaseDao implements MarketingLogDao {
    /**
     * 创建在线应用营销日志
     *
     * @param appSaleLogParameter
     */
    public void createOfflineappSaleLog(AppSaleLogParameter appSaleLogParameter) {
        insert("MarketingLog.createOfflineAppSaleLog", appSaleLogParameter);
    }

    /**
     * 创建离线应用营销日志
     *
     * @param appSaleLogParameter
     */
    public void createOnlineappSaleLog(AppSaleLogParameter appSaleLogParameter) {
        insert("MarketingLog.createOnlineAppSaleLog", appSaleLogParameter);
    }

    /**
     * 创建错误日志
     *
     * @param marketErrorLog
     */
    public void createErrorLog(MarketErrorLog marketErrorLog) {
        insert("MarketingLog.createErrorLog", marketErrorLog);
    }

    public void createSalerLog(SalerLogParameter salerLogParameter) {
        insert("MarketingLog.createSalerLog", salerLogParameter);
    }
}
