package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.CategoryDao;
import com.jd.appstore.gateway.domain.dao.Category;
import com.jd.common.dao.BaseDao;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-13
 * Time: 下午5:43
 * To change this template use File | Settings | File Templates.
 */
public class CategoryDaoImpl extends BaseDao implements CategoryDao{
    public List<Category> findLevel2Category() {
        return queryForList("Category.findLevel2Category");
    }

    public List<Category> findCategoryByParentId(Integer parentId) {
        return queryForList("Category.findCategoryByParentId",parentId);
    }

    public Category findCategoryNameById(Integer categoryId) {
        return (Category) queryForObject("Category.findCategoryNameById",categoryId);
    }
}
