package com.jd.appstore.gateway.dao;


import com.jd.appstore.gateway.domain.dao.Category;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-13
 * Time: 下午5:16
 * To change this template use File | Settings | File Templates.
 */
public interface CategoryDao {
    List<Category> findLevel2Category();
    List<Category> findCategoryByParentId(Integer parentId);
    Category findCategoryNameById(Integer categoryId);
}
