package com.jd.appstore.gateway.domain.obj;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-20
 * Time: 下午2:08
 * To change this template use File | Settings | File Templates.
 */
public class TopicInfoObj {
    /**
     * 专题编号
     */
    private Integer id;
    /**
     * 专题名称
     */
    private String name;
    /**
     * 专题类型，具体含义见数据库专题表定义
     */
    private Integer type;
    /**
     * 专题Logo完整URL
     */
    private String logo;
    /**
     * 最后更新日期（发布时间）
     */
    private Date pubTime;
    /**
     * 专题简介
     */
    private String intro;

    /**
     * 专题下的应用数量
     */
    private Long appCount;


    private List<AppBaseInfoObj> appBaseInfoObjs;

    public Long getAppCount() {
        return appCount;
    }

    public void setAppCount(Long appCount) {
        this.appCount = appCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Date getPubTime() {
        return pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public List<AppBaseInfoObj> getAppBaseInfoObjs() {
        return appBaseInfoObjs;
    }

    public void setAppBaseInfoObjs(List<AppBaseInfoObj> appBaseInfoObjs) {
        this.appBaseInfoObjs = appBaseInfoObjs;
    }
}
