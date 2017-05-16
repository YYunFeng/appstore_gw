package com.jd.appstore.gateway.domain.obj;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-20
 * Time: 下午2:07
 * To change this template use File | Settings | File Templates.
 */
public class AppBaseInfoObj {
    /**
     * 应用编号
     */
    private Integer appId;

    /**
     * 应用详情编号
     */
    private Integer detailsId;

    /**
     * 应用名称
     */
    private String name;
    /**
     * 主图完整URL
     */
    private String logo;
    /**
     * 价格，以分为单位，客户端负责显示格式转换。
     */
    private Long price;
    /**
     * 下载量
     */
    private Integer downloads;
    /**
     * 最后更新日期
     */
    private Date update;
    /**
     * 评级
     */
    private Integer star;
    /**
     * 评论次数
     */
    private Integer cn;
    /**
     * 类目ID，根据类目查看应用列表时必填，其它场景可填可不填。
     */
    private Integer cid;
    /**
     * 应用类型，具体含义见数据库定义。
     */
    private Integer at;
    /**
     * 适配的最低固件版本
     */
    private String lv;
    /**
     * 应用简介
     */
    private String intro;

    /**
     * 包名
     */
    private String packageName;

    /**
     * 安装包大小
     */
    private String pkgSize;

    /**
     * CP名称
     */
    private String cpName;

    /**
     * app版本
     */
    private String appVersion;

    /**
     * app版本号
     */
    private Integer appVersionCode;

    /**
     * 默认分类名称
     */
    private String defaultCategoryName;

    /**
     * 默认截图地址
     */
    private String defaultScreenshot;


    private String downPath;

    /**
     * 购买时间
     */
    private Date boughtTime;

    /**
     * 关注id
     */
    private Integer followId;

    private String apkCode;

    private Integer activation;

    private List<String> picList;


    private Integer zhuoWangMark;


    public Integer getZhuoWangMark() {
        return zhuoWangMark;
    }

    public void setZhuoWangMark(Integer zhuoWangMark) {
        this.zhuoWangMark = zhuoWangMark;
    }

    public Integer getActivation() {
        return activation;
    }

    public void setActivation(Integer activation) {
        this.activation = activation;
    }

    public List<String> getPicList() {
        return picList;
    }

    public void setPicList(List<String> picList) {
        this.picList = picList;
    }

    public Integer getFollowId() {
        return followId;
    }

    public String getApkCode() {
        return apkCode;
    }

    public void setApkCode(String apkCode) {
        this.apkCode = apkCode;
    }

    public void setFollowId(Integer followId) {
        this.followId = followId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Date getBoughtTime() {
        return boughtTime;
    }

    public void setBoughtTime(Date boughtTime) {
        this.boughtTime = boughtTime;
    }

    public String getDefaultCategoryName() {
        return defaultCategoryName;
    }

    public void setDefaultCategoryName(String defaultCategoryName) {
        this.defaultCategoryName = defaultCategoryName;
    }

    public String getDefaultScreenshot() {
        return defaultScreenshot;
    }

    public void setDefaultScreenshot(String defaultScreenshot) {
        this.defaultScreenshot = defaultScreenshot;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName;
    }

    public String getPkgSize() {
        return pkgSize;
    }

    public void setPkgSize(String pkgSize) {
        this.pkgSize = pkgSize;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Integer getCn() {
        return cn;
    }

    public void setCn(Integer cn) {
        this.cn = cn;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getAt() {
        return at;
    }

    public void setAt(Integer at) {
        this.at = at;
    }

    public String getLv() {
        return lv;
    }

    public void setLv(String lv) {
        this.lv = lv;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(Integer detailsId) {
        this.detailsId = detailsId;
    }

    public Integer getAppVersionCode() {
        return appVersionCode;
    }

    public void setAppVersionCode(Integer appVersionCode) {
        this.appVersionCode = appVersionCode;
    }

    public String getDownPath() {
        return downPath;
    }

    public void setDownPath(String downPath) {
        this.downPath = downPath;
    }
}
