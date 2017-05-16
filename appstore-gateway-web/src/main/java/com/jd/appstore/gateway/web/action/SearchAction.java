package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.SearchHotKeywordRes;
import com.jd.appstore.gateway.service.SearchService;

/**
 * User: gaoyang
 * Date: 12-8-21
 * Time: 下午7:41
 * To change this template use File | Settings | File Templates.
 */
public class SearchAction {

    private SearchHotKeywordRes searchHotKeywordRes;
    private SearchService searchService;

    public String Hotkeyword() {
        searchHotKeywordRes = searchService.findSearchHotKeyword();
        return "hotkeyword";
    }


    public SearchHotKeywordRes getSearchHotKeywordRes() {
        return searchHotKeywordRes;
    }

    public void setSearchHotKeywordRes(SearchHotKeywordRes searchHotKeywordRes) {
        this.searchHotKeywordRes = searchHotKeywordRes;
    }

    public SearchService getSearchService() {
        return searchService;
    }

    public void setSearchService(SearchService searchService) {
        this.searchService = searchService;
    }
}
