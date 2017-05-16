package com.jd.appstore.gateway.dao;

import com.jd.appstore.gateway.domain.dao.MarketErrorLog;
import com.jd.appstore.gateway.domain.dao.parameter.AppSaleLogParameter;
import com.jd.appstore.gateway.domain.dao.parameter.SalerLogParameter;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 13-1-30
 * Time: 上午10:06
 * To change this template use File | Settings | File Templates.
 */
public interface MarketingLogDao {
    void createOfflineappSaleLog(AppSaleLogParameter appSaleLogParameter);

    void createOnlineappSaleLog(AppSaleLogParameter appSaleLogParameter);

    void createErrorLog(MarketErrorLog marketErrorLog);


    void createSalerLog(SalerLogParameter salerLogParameter);
}
