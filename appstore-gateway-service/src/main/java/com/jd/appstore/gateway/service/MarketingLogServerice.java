package com.jd.appstore.gateway.service;

import com.jd.appstore.gateway.domain.dao.MarketErrorLog;
import com.jd.appstore.gateway.domain.dao.parameter.AppSaleLogParameter;
import com.jd.appstore.gateway.domain.dao.parameter.SalerLogParameter;
import com.jd.appstore.gateway.domain.response.LogStatusRes;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 13-1-30
 * Time: 下午3:57
 * To change this template use File | Settings | File Templates.
 */
public interface MarketingLogServerice {
    /**
     * 营销日志入库
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

    /**
     * 促销员安装日志入库
     *
     * @param salerLogParameter
     */
    void createSalerLog(SalerLogParameter salerLogParameter);


}
