package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.SearchHotKeywordRes;
import com.jd.appstore.gateway.manager.SearchManager;
import com.jd.appstore.gateway.service.SearchService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-21
 * Time: 下午7:37
 * To change this template use File | Settings | File Templates.
 */
public class SearchServiceImpl implements SearchService {
    private SearchManager searchManager;

    public SearchHotKeywordRes findSearchHotKeyword() {
        SearchHotKeywordRes searchHotKeywordRes = new SearchHotKeywordRes();
        try {
            List<String> hotKeyWordList = searchManager.findSearchHotKeyword();
            searchHotKeywordRes.setHotKeywords(hotKeyWordList);
            searchHotKeywordRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
        } catch (Exception e) {
            searchHotKeywordRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return searchHotKeywordRes;  //To change body of implemented methods use File | Settings | File Templates.
    }


    public void setSearchManager(SearchManager searchManager) {
        this.searchManager = searchManager;
    }
}
