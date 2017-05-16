package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.obj.CategoryInfoObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.CategoryRes;
import com.jd.appstore.gateway.manager.CategoryManager;
import com.jd.appstore.gateway.service.CategoryService;
import com.jd.appstore.gateway.domain.util.GatewayUrl;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-13
 * Time: 下午5:59
 * To change this template use File | Settings | File Templates.
 */
public class CategoryServiceImpl implements CategoryService {

    private CategoryManager categoryLocalManager;
    private Logger logger = Logger.getLogger(this.getClass());

    public CategoryRes findCategory() {
        CategoryRes categoryRes = new CategoryRes();
        try {
            List<CategoryInfoObj> categoryInfoObjList = categoryLocalManager.findAllCategory();
            categoryRes.setCategoryInfoObjs(categoryInfoObjList);
            categoryRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
        } catch (Exception e) {
            categoryRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return categoryRes;
    }


    public void setCategoryLocalManager(CategoryManager categoryLocalManager) {
        this.categoryLocalManager = categoryLocalManager;
    }


}
