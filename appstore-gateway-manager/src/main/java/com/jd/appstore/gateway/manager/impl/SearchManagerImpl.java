package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.SearchDao;
import com.jd.appstore.gateway.manager.SearchManager;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-21
 * Time: 下午7:31
 * To change this template use File | Settings | File Templates.
 */
public class SearchManagerImpl implements SearchManager{

    private SearchDao searchDao;

    public List<String> findSearchHotKeyword() {
        return searchDao.findSearchHotKeyword();
    }

    public void setSearchDao(SearchDao searchDao) {
        this.searchDao = searchDao;
    }
}
