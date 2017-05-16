package com.jd.appstore.gateway.domain.dao.parameter;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-8-24
 * Time: 下午6:04
 * To change this template use File | Settings | File Templates.
 */
public class RelatedRecommendAppParameter {

    private Integer appId;
    private Integer categoryId;
    private Integer limit;

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
