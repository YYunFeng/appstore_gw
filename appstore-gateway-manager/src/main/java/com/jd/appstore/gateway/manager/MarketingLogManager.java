package com.jd.appstore.gateway.manager;

import com.jd.appstore.gateway.domain.dao.MarketErrorLog;
import com.jd.appstore.gateway.domain.dao.parameter.AppSaleLogParameter;
import com.jd.appstore.gateway.domain.dao.parameter.SalerLogParameter;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 13-1-30
 * Time: 上午10:57
 * To change this template use File | Settings | File Templates.
 */
public interface MarketingLogManager {
    /**
     * 创建营销日志信息
     *
     * @param appSaleLogParameter
     */
    void createMarketingLog(AppSaleLogParameter appSaleLogParameter);

    /**
     * 创建营销日错误信息
     *
     * @param marketErrorLog
     */
    void createMalketingErrorLog(MarketErrorLog marketErrorLog);


    void createSalerLog(SalerLogParameter salerLogParameter);
}
