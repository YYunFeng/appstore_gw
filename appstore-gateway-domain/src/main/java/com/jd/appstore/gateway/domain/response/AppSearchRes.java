package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.AppBaseInfoObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-20
 * Time: 下午2:53
 * To change this template use File | Settings | File Templates.
 */
public class AppSearchRes {

    private ResultObj resultObj;
    private Integer tan;
    private Integer tp;
    private Integer an;
    private String categoryName2;
    private String categoryName3;
    private List<AppBaseInfoObj> appBaseInfoObjs;

    public String getCategoryName2() {
        return categoryName2;
    }

    public void setCategoryName2(String categoryName2) {
        this.categoryName2 = categoryName2;
    }

    public String getCategoryName3() {
        return categoryName3;
    }

    public void setCategoryName3(String categoryName3) {
        this.categoryName3 = categoryName3;
    }

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

    public Integer getTan() {
        return tan;
    }

    public void setTan(Integer tan) {
        this.tan = tan;
    }

    public Integer getTp() {
        return tp;
    }

    public void setTp(Integer tp) {
        this.tp = tp;
    }

    public Integer getAn() {
        return an;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

    public List<AppBaseInfoObj> getAppBaseInfoObjs() {
        return appBaseInfoObjs;
    }

    public void setAppBaseInfoObjs(List<AppBaseInfoObj> appBaseInfoObjs) {
        this.appBaseInfoObjs = appBaseInfoObjs;
    }
}
