package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.dao.*;
import com.jd.appstore.gateway.domain.enumtype.PicResolutionEnum;
import com.jd.appstore.gateway.domain.obj.*;
import com.jd.appstore.gateway.domain.response.AppDetailsRes;
import com.jd.appstore.gateway.domain.response.AppDownloadRes;
import com.jd.appstore.gateway.domain.response.AppSearchRes;
import com.jd.appstore.gateway.domain.response.AppUpdateRes;
import com.jd.appstore.gateway.domain.util.GatewayUrl;
import com.jd.appstore.gateway.domain.util.GatewayUtils;
import com.jd.appstore.gateway.domain.zhuowangobj.xmlbean.OrderRelationReq;
import com.jd.appstore.gateway.domain.zhuowangobj.xmlbean.OrderRelationRes;
import com.jd.appstore.gateway.manager.AppManager;
import com.jd.appstore.gateway.manager.CategoryManager;
import com.jd.appstore.gateway.manager.LogManager;
import com.jd.appstore.gateway.service.*;
import com.jd.common.util.PaginatedList;
import com.jd.common.util.StringUtils;
import com.jd.digital.common.util.tool.WebHelper;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-30
 * Time: 下午2:03
 * To change this template use File | Settings | File Templates.
 */
public class AppServiceImpl implements AppService {

    AppManager appManager;

    CategoryManager categoryLocalManager;
    LogManager logManager;


    GatewayUrl gatewayUrl;
    AppInfoService appInfoService;

    ZhuowangInterfaceService zhuowangInterfaceService;

    Logger logger = Logger.getLogger(this.getClass());

    public AppDetailsRes details(Integer appId, Integer detailsId) throws Exception {
        AppDetailsRes appDetailsRes = new AppDetailsRes();
        AppInfoResult appInfoResult = null;
        try {
            //应用基本信息
            AppDetails appDetails = appManager.findAppDetails(appId, detailsId);
            if (appDetails != null) {
                AppBaseInfoObj appBaseInfoObj = new AppBaseInfoObj();
                if (appDetails != null) {
                    appBaseInfoObj.setAppId(appDetails.getAppId());
                    appBaseInfoObj.setName(appDetails.getAppName());
                    appBaseInfoObj.setAppVersion(appDetails.getAppVersion());
                    appBaseInfoObj.setUpdate(appDetails.getPubTime());
                    if (appDetails.getZhuoWangMark() != null && appDetails.getZhuoWangMark().intValue() == 1) {
                        appBaseInfoObj.setLogo(appDetails.getLogoUrl());
                    } else {
                        //100*100 LOGO
                        appBaseInfoObj.setLogo(gatewayUrl.getImgUrl() + PicResolutionEnum.COVER.getPrefix() + appDetails.getLogoUrl());
                        appBaseInfoObj.setPkgSize(GatewayUtils.formatSize(appDetails.getPkgSize()));
                    }
                    appBaseInfoObj.setIntro(appDetails.getAppIntroduce());
                    appBaseInfoObj.setCpName(appDetails.getCpName());
                    appBaseInfoObj.setDefaultCategoryName(appDetails.getCategoryName());
                    appBaseInfoObj.setLv(appDetails.getOsVersionName());
                    /*    //装载星级,价格,下载次数
                  appInfoResult = appInfoService.setAppInfos(appBaseInfoObj, true, true, true);*/
                }
                appDetailsRes.setAppBaseInfoObj(appBaseInfoObj);

                //评论概述
                if (appInfoResult != null) {
                    appDetailsRes.setCommentSummaryInfoObj(appInfoResult.getCommentSummaryInfoObj());
                }

                //应用资源列表,截图
                List<AppResource> appResourceList = appManager.findAppResourceByAppId(appId, detailsId);
                List<AppResourceInfoObj> appResourceInfoObjList = new ArrayList<AppResourceInfoObj>();
                for (AppResource appResource : appResourceList) {
                    AppResourceInfoObj appResourceInfoObj = new AppResourceInfoObj();
                    appResourceInfoObj.setCapSeq(appResource.getCapSeq());
                    appResourceInfoObj.setResType(appResource.getResType());
                    if (appResource.getZhuoWangMark() != null && appResource.getZhuoWangMark().intValue() == 1) {
                        appResourceInfoObj.setUrl(appResource.getResUrl());
                    } else {
                        appResourceInfoObj.setUrl(gatewayUrl.getImgUrl() + PicResolutionEnum.IMGPIC.getPrefix() + appResource.getResUrl());
                    }
                    //186x310 截图
                    appResourceInfoObjList.add(appResourceInfoObj);
                }
                appDetailsRes.setAppResourceInfoObjs(appResourceInfoObjList);

                //应用的CP列表
                List<AppCp> appCpList = appManager.findAppCp(appId);
                List<CpInfoObj> cpInfoObjList = new ArrayList<CpInfoObj>();
                for (AppCp appCp : appCpList) {
                    CpInfoObj cpInfoObj = new CpInfoObj();
                    cpInfoObj.setCpName(appCp.getCpName());
                    if (appCp.getDetailsId().intValue() == appDetails.getDefaultDetailId().intValue())
                        cpInfoObj.setDefaultDetails(true);
                    else
                        cpInfoObj.setDefaultDetails(false);
                    cpInfoObj.setDetailsId(appCp.getDetailsId());
                    cpInfoObj.setEmail(appCp.getEmail());
                    cpInfoObjList.add(cpInfoObj);
                }
                appDetailsRes.setCpInfoObjs(cpInfoObjList);

                appDetailsRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
            } else {
                appDetailsRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            }
        } catch (Exception e) {
            appDetailsRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return appDetailsRes;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public AppDownloadRes download(Integer appId, Integer detailsId, Integer clientType, String uuid, Integer first, String staffMobile, String staffId, String channelId, String areaProvinceId) {
        AppDownloadRes appDownloadRes = new AppDownloadRes();
        try {
            AppDownloadUrl appDownloadUrl = appManager.findAppDownloadUrlById(appId, detailsId);
            if (appDownloadUrl != null) {
                //判断是否卓望的数据
                if (appDownloadUrl.getZhuowangMark() != null && appDownloadUrl.getZhuowangMark().intValue() == 1) {
                    //判断调用卓望接口的几个参数是否都存在
                    if (StringUtils.isNotBlank(staffId) && StringUtils.isNotBlank(staffMobile) && StringUtils.isNotBlank(channelId) && StringUtils.isNotBlank(areaProvinceId)) {
                        OrderRelationReq orderRelationReq = new OrderRelationReq();
                        String zhuowangAppcode = appDownloadUrl.getPackageName().substring(appDownloadUrl.getPackageName().lastIndexOf(".") + 1);
                        orderRelationReq.setServiceCode(zhuowangAppcode);
                        orderRelationReq.setStaffMobile(staffMobile);
                        orderRelationReq.setStaffId(staffId);
                        orderRelationReq.setChannelId(channelId);
                        orderRelationReq.setAreaProvinceID(areaProvinceId);
                        OrderRelationRes orderRelationRes = zhuowangInterfaceService.zhuowangAppDownload(orderRelationReq);
                        if (orderRelationRes.getRetCode().intValue() == 0) {
                            appDownloadRes.setAppVersionCode(appDownloadUrl.getAppVersionCode());
                            appDownloadRes.setPackageName(appDownloadUrl.getPackageName());
                            appDownloadRes.setUrl(orderRelationRes.getRetDesc());
                            appDownloadRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
                        }
                    } else {                    //参数不全,返回错误
                        appDownloadRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "staffId or staffMobile or channelId or areaProvinceId is null"));
                    }
                    return appDownloadRes;
                }

                //本地应用,非卓望数据
                String url = appDownloadUrl.getUrl();
                if (StringUtils.isNotBlank(url)) {
                    appDownloadRes.setUrl(gatewayUrl.getApkUrl() + url);
                    appDownloadRes.setPackageName(appDownloadUrl.getPackageName());
                    appDownloadRes.setAppVersionCode(appDownloadUrl.getAppVersionCode());
                    appDownloadRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
                    if (first != null && 0 == first.intValue())
                        logManager.createDownloadLog(WebHelper.getPin(), appId, null, 1, clientType, uuid, WebHelper.getRemoteIP(), null);
                } else {
                    appDownloadRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
                }
            }

        } catch (Exception e) {
            appDownloadRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return appDownloadRes;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public AppUpdateRes update(String appsInfo) {
        AppUpdateRes appUpdateRes = new AppUpdateRes();
        List<AppBaseInfoObj> appBaseInfoObjList = new ArrayList<AppBaseInfoObj>();
        try {
            String[] appsInfoArray = null;
            //按分号拆分成单个应用信息
            if (appsInfo != null) {
                if (appsInfo.indexOf(";") > -1)
                    appsInfoArray = appsInfo.split(";");
                else
                    appsInfoArray = new String[]{appsInfo};
            }
            if (appsInfoArray != null && appsInfoArray.length > 0) {
                //遍历应用
                String packageName = null;
                String appVersionCode = null;
                for (String appInfo : appsInfoArray) {
                    //如果单个应用信息包含逗号,按逗号拆分包名和appversioncde;
                    if (appInfo.indexOf(",") > -1) {
                        packageName = appInfo.substring(0, appInfo.indexOf(","));
                        appVersionCode = appInfo.substring(appInfo.indexOf(",") + 1);
                        AppUpdate appUpdate = appManager.findAppUpdate(packageName, Integer.parseInt(appVersionCode));
                        //如果有比当前版本更新的版本
                        if (appUpdate != null) {
                            AppBaseInfoObj appBaseInfoObj = new AppBaseInfoObj();
                            appBaseInfoObj.setAppId(appUpdate.getAppId());
                            appBaseInfoObj.setDetailsId(appUpdate.getDetailsId());
                            appBaseInfoObj.setAppVersionCode(appUpdate.getAppVersionCode());
                            appBaseInfoObj.setAppVersion(appUpdate.getAppVersion());
                            appBaseInfoObj.setPackageName(appUpdate.getAppPackage());
                            if (appUpdate.isAppLogo())
                                appBaseInfoObj.setLogo(gatewayUrl.getLogoUrl() + PicResolutionEnum.COVER_N4.getPrefix() + appUpdate.getLogoUrl());
                            else
                                appBaseInfoObj.setLogo(gatewayUrl.getImgUrl() + PicResolutionEnum.IMG_N4.getPrefix() + appUpdate.getLogoUrl());
                            appBaseInfoObj.setName(appUpdate.getAppName());
                            appBaseInfoObj.setPkgSize(GatewayUtils.formatSize(appUpdate.getPkgSize()));
                            appBaseInfoObj.setUpdate(appUpdate.getPubTime());
                            appBaseInfoObjList.add(appBaseInfoObj);
                        }
                    }
                }
            }
            appUpdateRes.setAppBaseInfoObjs(appBaseInfoObjList);
            appUpdateRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
        } catch (Exception e) {
            appUpdateRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return appUpdateRes;  //To change body of implemented methods use File | Settings | File Templates.
    }


    public AppSearchRes search(String keyword, Integer cid, Integer appType, Integer fee, Integer op, Integer od, Integer ou, Integer oc, Integer og, Integer pageNum, Integer pageSize, Integer clientType) {
        AppSearchRes appSearchRes = new AppSearchRes();
        try {
            pageNum = pageNum == null ? 1 : pageNum;
            pageSize = pageSize == null ? 20 : pageSize;

            PaginatedList<AppSearch> result = appManager.searchApp(keyword, cid, pageNum, pageSize);
            List<AppBaseInfoObj> appBaseInfoObjList = new ArrayList<AppBaseInfoObj>();
            for (AppSearch searchDetail : result) {
                AppBaseInfoObj appBaseInfoObj = new AppBaseInfoObj();
                appBaseInfoObj.setAppId(searchDetail.getAppId());
                appBaseInfoObj.setName(searchDetail.getAppName());
                appBaseInfoObj.setPackageName(searchDetail.getPackageName());
                appBaseInfoObj.setUpdate(searchDetail.getPubTime());
                if (searchDetail.getZhuoWangMark() != null && searchDetail.getZhuoWangMark().intValue() == 1) {
                    appBaseInfoObj.setLogo(searchDetail.getLogoUrl().trim());
                } else {
                    appBaseInfoObj.setPkgSize(GatewayUtils.formatSize(searchDetail.getPkgSize()));
                    appBaseInfoObj.setLogo(gatewayUrl.getLogoUrl() + searchDetail.getLogoUrl().trim());
                }
                appBaseInfoObj.setIntro(searchDetail.getAppIntroduce());
                appBaseInfoObj.setAppVersion(searchDetail.getAppVersion());
                appBaseInfoObj.setLv(searchDetail.getOsVersionName());
                appBaseInfoObj.setPrice(searchDetail.getPrice().longValue());
                appBaseInfoObjList.add(appBaseInfoObj);
            }

            //如果是按类目ID搜索，装载类目名称
            if (cid != null) {
                Category category = categoryLocalManager.findCategoryNameById(cid);
                if (category != null) {
                    appSearchRes.setCategoryName2(category.getCategoryName2());
                    appSearchRes.setCategoryName3(category.getCategoryName3());
                }
            }
            appSearchRes.setTan(result.getTotalItem());
            appSearchRes.setTp(GatewayUtils.getTotalPage(result.getTotalItem(), pageSize));
            appSearchRes.setAppBaseInfoObjs(appBaseInfoObjList);
            appSearchRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
        } catch (Exception e) {
            appSearchRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return appSearchRes;
    }


    public void setCategoryLocalManager(CategoryManager categoryLocalManager) {
        this.categoryLocalManager = categoryLocalManager;
    }



    public void setGatewayUrl(GatewayUrl gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }


    public void setAppInfoService(AppInfoService appInfoService) {
        this.appInfoService = appInfoService;
    }



    public void setLogManager(LogManager logManager) {
        this.logManager = logManager;
    }


    public void setAppManager(AppManager appManager) {
        this.appManager = appManager;
    }

    public void setZhuowangInterfaceService(ZhuowangInterfaceService zhuowangInterfaceService) {
        this.zhuowangInterfaceService = zhuowangInterfaceService;
    }
}
