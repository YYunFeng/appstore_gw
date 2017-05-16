package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.dao.MarketErrorLog;
import com.jd.appstore.gateway.domain.dao.parameter.AppSaleLogParameter;
import com.jd.appstore.gateway.domain.dao.parameter.SalerLogParameter;
import com.jd.appstore.gateway.manager.MarketingLogManager;
import com.jd.appstore.gateway.service.MarketingLogServerice;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 13-1-30
 * Time: 下午3:58
 * To change this template use File | Settings | File Templates.
 */
public class MarketingLogServiceImpl implements MarketingLogServerice {
    private MarketingLogManager marketingLogManager;

    public void createMarketingLog(AppSaleLogParameter appSaleLogParameter) {
        marketingLogManager.createMarketingLog(appSaleLogParameter);
    }

    public void createMalketingErrorLog(MarketErrorLog marketErrorLog) {
        marketingLogManager.createMalketingErrorLog(marketErrorLog);
    }

    public void createSalerLog(SalerLogParameter salerLogParameter) {
        marketingLogManager.createSalerLog(salerLogParameter);
    }


    public void setMarketingLogManager(MarketingLogManager marketingLogManager) {
        this.marketingLogManager = marketingLogManager;
    }
}
