package com.jd.appstore.gateway.service;

import com.jd.appstore.gateway.domain.response.FillOrderRes;

/**
 * User: YUNFENG
 * Date: 13-11-20
 * Time: 下午2:47
 * To change this template use File | Settings | File Templates.
 */
public interface FillOrderService {
    FillOrderRes fillOrder(Integer appId, String padImei, String staffMobile, String staffId, String channelId, String areaProvinceId);
}
