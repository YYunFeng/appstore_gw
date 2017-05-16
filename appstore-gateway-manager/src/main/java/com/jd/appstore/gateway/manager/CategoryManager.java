package com.jd.appstore.gateway.manager;

import com.jd.appstore.gateway.domain.dao.Category;
import com.jd.appstore.gateway.domain.obj.CategoryInfoObj;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-13
 * Time: 下午5:45
 * To change this template use File | Settings | File Templates.
 */
public interface CategoryManager {
    List<CategoryInfoObj> findAllCategory();

    Category findCategoryNameById(Integer categoryId);
}
