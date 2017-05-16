package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.CategoryInfoObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-29
 * Time: 上午12:03
 * To change this template use File | Settings | File Templates.
 */
public class CategoryRes {

    private ResultObj resultObj;
    private List<CategoryInfoObj> categoryInfoObjs;

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

    public List<CategoryInfoObj> getCategoryInfoObjs() {
        return categoryInfoObjs;
    }

    public void setCategoryInfoObjs(List<CategoryInfoObj> categoryInfoObjs) {
        this.categoryInfoObjs = categoryInfoObjs;
    }
}
