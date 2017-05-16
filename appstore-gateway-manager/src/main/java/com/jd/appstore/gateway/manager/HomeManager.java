package com.jd.appstore.gateway.manager;

import com.jd.appstore.gateway.domain.dao.HomeInfo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-21
 * Time: 下午6:25
 * To change this template use File | Settings | File Templates.
 */
public interface HomeManager {
    List<HomeInfo> findHomeInfo(Integer clientType);
}
