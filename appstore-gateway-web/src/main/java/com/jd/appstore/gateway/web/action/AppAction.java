package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.AppDetailsRes;
import com.jd.appstore.gateway.domain.response.AppDownloadRes;
import com.jd.appstore.gateway.domain.response.AppSearchRes;
import com.jd.appstore.gateway.domain.response.AppUpdateRes;
import com.jd.appstore.gateway.service.AppService;
import com.jd.common.struts.action.BaseAction;


/**
 * User: gaoyang
 * Date: 12-7-24
 * Time: 下午5:48
 * To change this template use File | Settings | File Templates.
 */
public class AppAction extends BaseAction {

    //应用编号
    private Integer appId;
    //详情编号
    private Integer detailsId;
    //客户端类型
    private Integer clientType;
    //UUID
    private String uuid;
    //是否首次请求下载接口（用于判断是否记录下载日志）
    private Integer first;
    //搜索关键字
    private String keyword;
    //类目ID
    private Integer cid;
    //应用类型
    private Integer appType;
    //收费或免费
    private Integer fee;
    //价格排序
    private Integer op;
    //下载次数排序
    private Integer od;
    //发布时间排序
    private Integer ou;
    //评论数排序
    private Integer oc;
    //好评排序
    private Integer og;
    private String appsInfo;
    private Integer pageNum;
    private Integer pageSize;


    /**
     * 通过卓望下载应用需要的几个参数
     */
    private String staffMobile;
    private String staffId;
    private String channelId;
    private String areaProvinceId;
    /**
     * end
     */


    private AppSearchRes appSearchRes;
    private AppDetailsRes appDetailsRes;
    private AppDownloadRes appDownloadRes;
    private AppUpdateRes appUpdateRes;


    private AppService appService;


    /**
     * 应用详情
     *
     * @return
     */
    public String Details() throws Exception {
        appDetailsRes = appService.details(appId, detailsId);
        return "details";
    }

    /**
     * 应用下载
     *
     * @return
     */
    public String Download() {
        appDownloadRes = appService.download(appId, detailsId, clientType, uuid, first, staffMobile, staffId, channelId, areaProvinceId);
        return "download";
    }

    /**
     * 应用更新
     *
     * @return
     */
    public String Update() {
        appUpdateRes = appService.update(appsInfo);
        return "update";
    }

    /**
     * 应用搜索接口
     *
     * @return
     */
    public String Search() throws Exception {
        appSearchRes = appService.search(keyword, cid, appType, fee, op, od, ou, oc, og, pageNum, pageSize, clientType);
        return "search";
    }


    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }


    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    public Integer getOp() {
        return op;
    }

    public void setOp(Integer op) {
        this.op = op;
    }

    public Integer getOd() {
        return od;
    }

    public void setOd(Integer od) {
        this.od = od;
    }

    public Integer getOu() {
        return ou;
    }

    public void setOu(Integer ou) {
        this.ou = ou;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public AppService getAppService() {
        return appService;
    }

    public void setAppService(AppService appService) {
        this.appService = appService;
    }

    public AppSearchRes getAppSearchRes() {
        return appSearchRes;
    }

    public void setAppSearchRes(AppSearchRes appSearchRes) {
        this.appSearchRes = appSearchRes;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(Integer detailsId) {
        this.detailsId = detailsId;
    }

    public AppDetailsRes getAppDetailsRes() {
        return appDetailsRes;
    }

    public void setAppDetailsRes(AppDetailsRes appDetailsRes) {
        this.appDetailsRes = appDetailsRes;
    }

    public AppDownloadRes getAppDownloadRes() {
        return appDownloadRes;
    }

    public void setAppDownloadRes(AppDownloadRes appDownloadRes) {
        this.appDownloadRes = appDownloadRes;
    }

    public String getAppsInfo() {
        return appsInfo;
    }

    public void setAppsInfo(String appsInfo) {
        this.appsInfo = appsInfo;
    }

    public AppUpdateRes getAppUpdateRes() {
        return appUpdateRes;
    }

    public void setAppUpdateRes(AppUpdateRes appUpdateRes) {
        this.appUpdateRes = appUpdateRes;
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getOc() {
        return oc;
    }

    public void setOc(Integer oc) {
        this.oc = oc;
    }

    public Integer getOg() {
        return og;
    }

    public void setOg(Integer og) {
        this.og = og;
    }

    public String getStaffMobile() {
        return staffMobile;
    }

    public void setStaffMobile(String staffMobile) {
        this.staffMobile = staffMobile;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getAreaProvinceId() {
        return areaProvinceId;
    }

    public void setAreaProvinceId(String areaProvinceId) {
        this.areaProvinceId = areaProvinceId;
    }
}
