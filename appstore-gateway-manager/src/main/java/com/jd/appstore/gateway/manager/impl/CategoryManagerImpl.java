package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.CategoryDao;
import com.jd.appstore.gateway.domain.dao.Category;
import com.jd.appstore.gateway.domain.enumtype.PicResolutionEnum;
import com.jd.appstore.gateway.domain.obj.CategoryInfoObj;
import com.jd.appstore.gateway.domain.util.GatewayUrl;
import com.jd.appstore.gateway.manager.CategoryManager;
import com.jd.common.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-13
 * Time: 下午5:47
 * To change this template use File | Settings | File Templates.
 */
public class CategoryManagerImpl implements CategoryManager {

    private CategoryDao categoryDao;
    private GatewayUrl gatewayUrl;

    public List<CategoryInfoObj> findAllCategory() {
        List<CategoryInfoObj> categoryInfoObjList = new ArrayList<CategoryInfoObj>();
        //获取2级类目
        List<Category> level2CategoryList = categoryDao.findLevel2Category();
        //遍历2级类目
        for (Category level2Category : level2CategoryList) {
            CategoryInfoObj categoryInfoObj = new CategoryInfoObj();
            //转换Category为CategoryInfoObj
            categoryInfoObj.setCid(level2Category.getCategoryId());
            categoryInfoObj.setName(level2Category.getCategoryName());
            categoryInfoObj.setPartentCid(level2Category.getParentId());
            categoryInfoObj.setLevel(level2Category.getLevel());
            if (StringUtils.isNotBlank(level2Category.getLogoUrl()))
                categoryInfoObj.setLogo(gatewayUrl.getImgUrl() + PicResolutionEnum.CATEGORYIMAGE.getPrefix() + level2Category.getLogoUrl());
            categoryInfoObj.setIntro(level2Category.getIntro());
            //根据2级类目的ID获取3级类目
            List<Category> level3CategoryList = categoryDao.findCategoryByParentId(level2Category.getCategoryId());
            //遍历3级类目
            List<CategoryInfoObj> level3CategoryInfoObjList = new ArrayList<CategoryInfoObj>();
            for (Category level3Category : level3CategoryList) {
                //转换Category为CategoryInfoObj
                CategoryInfoObj level3CategoryInfoObj = new CategoryInfoObj();
                level3CategoryInfoObj.setCid(level3Category.getCategoryId());
                level3CategoryInfoObj.setName(level3Category.getCategoryName());
                level3CategoryInfoObj.setPartentCid(level3Category.getParentId());
                level3CategoryInfoObj.setLevel(level3Category.getLevel());
                if (StringUtils.isNotBlank(level3Category.getLogoUrl())){
                    level3CategoryInfoObj.setLogo(gatewayUrl.getImgUrl() +  PicResolutionEnum.CATEGORYIMAGE.getPrefix() + level3Category.getLogoUrl());
                }
                level3CategoryInfoObj.setIntro(level3Category.getIntro());
                level3CategoryInfoObjList.add(level3CategoryInfoObj);
            }
            //set子类目
            categoryInfoObj.setChildCategoryInfoObjs(level3CategoryInfoObjList);
            categoryInfoObjList.add(categoryInfoObj);
        }
        return categoryInfoObjList;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Category findCategoryNameById(Integer categoryId) {
        return categoryDao.findCategoryNameById(categoryId);
    }

    public void setCategoryDao(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    public void setGatewayUrl(GatewayUrl gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }
}
