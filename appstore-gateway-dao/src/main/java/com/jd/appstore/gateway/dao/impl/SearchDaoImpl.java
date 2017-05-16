package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.SearchDao;
import com.jd.common.dao.BaseDao;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-21
 * Time: 下午7:18
 * To change this template use File | Settings | File Templates.
 */
public class SearchDaoImpl extends BaseDao implements SearchDao{

    public List<String> findSearchHotKeyword() {
        return queryForList("Search.findSearchHotKeyword");
    }
}
