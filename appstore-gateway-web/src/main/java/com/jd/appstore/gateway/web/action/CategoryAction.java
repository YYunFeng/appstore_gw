package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.CategoryRes;
import com.jd.appstore.gateway.service.CategoryService;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-29
 * Time: 上午12:04
 * To change this template use File | Settings | File Templates.
 */
public class CategoryAction {

    private Integer clientType;

    private CategoryRes categoryRes;

    private CategoryService categoryService;

    /**
     * 获取类目
     * @return
     */
    public String Info() {
        categoryRes = categoryService.findCategory();
        return "info";
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public CategoryRes getCategoryRes() {
        return categoryRes;
    }

    public void setCategoryRes(CategoryRes categoryRes) {
        this.categoryRes = categoryRes;
    }

    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
}
