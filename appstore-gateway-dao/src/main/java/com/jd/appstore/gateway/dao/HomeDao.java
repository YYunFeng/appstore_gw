package com.jd.appstore.gateway.dao;

import com.jd.appstore.gateway.domain.dao.HomeInfo;
import com.jd.appstore.gateway.domain.dao.parameter.HomeInfoParameter;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-21
 * Time: 下午6:22
 * To change this template use File | Settings | File Templates.
 */
public interface HomeDao {
    List<HomeInfo> findHomeInfo(HomeInfoParameter homeInfoParameter);
}
