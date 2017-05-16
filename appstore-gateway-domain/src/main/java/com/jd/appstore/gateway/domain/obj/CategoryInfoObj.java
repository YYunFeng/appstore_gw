package com.jd.appstore.gateway.domain.obj;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-28
 * Time: 下午11:59
 * To change this template use File | Settings | File Templates.
 */
public class CategoryInfoObj {

    private String name;
    private Integer cid;
    private String logo;
    private String intro;
    private Integer level;
    private Integer partentCid;
    private List<CategoryInfoObj> childCategoryInfoObjs;

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getPartentCid() {
        return partentCid;
    }

    public void setPartentCid(Integer partentCid) {
        this.partentCid = partentCid;
    }

    public List<CategoryInfoObj> getChildCategoryInfoObjs() {
        return childCategoryInfoObjs;
    }

    public void setChildCategoryInfoObjs(List<CategoryInfoObj> childCategoryInfoObjs) {
        this.childCategoryInfoObjs = childCategoryInfoObjs;
    }
}
