package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.HomeDao;
import com.jd.appstore.gateway.domain.dao.HomeInfo;
import com.jd.appstore.gateway.domain.dao.parameter.HomeInfoParameter;
import com.jd.common.dao.BaseDao;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-21
 * Time: 下午6:23
 * To change this template use File | Settings | File Templates.
 */
public class HomeDaoImpl extends BaseDao implements HomeDao{

    public List<HomeInfo> findHomeInfo(HomeInfoParameter homeInfoParameter) {
        return queryForList("Home.findHomeInfo",homeInfoParameter);
    }
}
