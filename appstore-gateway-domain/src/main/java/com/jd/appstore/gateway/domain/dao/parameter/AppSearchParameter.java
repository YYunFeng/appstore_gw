package com.jd.appstore.gateway.domain.dao.parameter;

import com.jd.common.util.base.BaseQuery;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-13
 * Time: 下午7:13
 * To change this template use File | Settings | File Templates.
 */
public class AppSearchParameter extends BaseQuery{

    private String keyword;
    private Integer categoryId;
    private Integer offset;
    private Integer limit;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
