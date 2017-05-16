package com.jd.appstore.gateway.service;

import com.jd.appstore.gateway.domain.response.HomeRes;

/**
 * User: gaoyang
 * Date: 12-8-21
 * Time: 下午6:34
 * To change this template use File | Settings | File Templates.
 */
public interface HomeService {
    HomeRes findHomeInfo(Integer clientType);
}
