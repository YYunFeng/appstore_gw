package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.dao.Topic;
import com.jd.appstore.gateway.domain.dao.TopicApps;
import com.jd.appstore.gateway.domain.obj.AppBaseInfoObj;
import com.jd.appstore.gateway.domain.obj.AppResObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.obj.TopicInfoObj;
import com.jd.appstore.gateway.domain.response.TopicAppListRes;
import com.jd.appstore.gateway.domain.response.TopicListRes;
import com.jd.appstore.gateway.domain.util.GatewayUrl;
import com.jd.appstore.gateway.domain.util.GatewayUtils;
import com.jd.appstore.gateway.manager.TopicManager;
import com.jd.appstore.gateway.service.AppInfoService;
import com.jd.appstore.gateway.service.TopicService;
import com.jd.common.util.PaginatedList;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-12
 * Time: 下午3:42
 * To change this template use File | Settings | File Templates.
 */
public class TopicServiceImpl implements TopicService {

    private TopicManager topicManager;
    private GatewayUrl gatewayUrl;
    private AppInfoService appInfoService;
    Logger logger = Logger.getLogger(this.getClass());

    public TopicListRes findTopicList(Integer topicType, Integer padChannel, Integer pageSize, Integer pageNum) {
        TopicListRes topicListRes = new TopicListRes();
        List<TopicInfoObj> topicInfoObjList = new ArrayList<TopicInfoObj>();
        try {

            pageSize = pageSize == null ? 20 : pageSize;
            pageNum = pageNum == null ? 1 : pageNum;
            PaginatedList<Topic> topicPaginatedList = topicManager.findTopicByPage(topicType, padChannel, pageSize, pageNum);

            topicListRes.setTtn(topicPaginatedList.getTotalItem());
            topicListRes.setTp(topicPaginatedList.getTotalPage());
            topicListRes.setTn(topicPaginatedList.size());

            Map topicAppCountMap = topicManager.findTopicAppCount();
            for (Topic topic : topicPaginatedList) {
                TopicInfoObj topicInfoObj = new TopicInfoObj();
                topicInfoObj.setId(topic.getTopicId());
                topicInfoObj.setName(topic.getTopicName());
                topicInfoObj.setLogo(gatewayUrl.getImgUrl() + "topicImage/" + topic.getLogoUrl());
                topicInfoObj.setIntro(topic.getIntro());
                topicInfoObj.setType(topic.getTopicType());
                topicInfoObj.setPubTime(topic.getPubTime());
                topicInfoObj.setAppCount((Long) topicAppCountMap.get(topic.getTopicId()));
                topicInfoObjList.add(topicInfoObj);
            }
            topicListRes.setTopicInfoObjs(topicInfoObjList);
            topicListRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
        } catch (Exception e) {
            topicListRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return topicListRes;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public TopicAppListRes findTopicAppList(Integer topicId, Integer padChannelId) {
        TopicAppListRes topicAppListRes = new TopicAppListRes();
        String topicName = null;
        try {
            List<TopicApps> topicAppsList = topicManager.findTopicApps(topicId, padChannelId);
            List<AppBaseInfoObj> appBaseInfoObjList = new ArrayList<AppBaseInfoObj>();
            for (TopicApps topicApps : topicAppsList) {
                AppBaseInfoObj appBaseInfoObj = new AppBaseInfoObj();
                appBaseInfoObj.setAppId(topicApps.getAppId());
                appBaseInfoObj.setName(topicApps.getAppName());
                appBaseInfoObj.setAppVersion(topicApps.getAppVersion());
                appBaseInfoObj.setPkgSize(GatewayUtils.formatSize(topicApps.getPkgSize()));
                appBaseInfoObj.setLogo(gatewayUrl.getLogoUrl() + topicApps.getLogoUrl());
                appBaseInfoObj.setDefaultCategoryName(topicApps.getCategoryName());
                appBaseInfoObj.setDefaultScreenshot(gatewayUrl.getImgUrl() + "img_pic/" + topicApps.getResUrl());
                appBaseInfoObj.setApkCode(topicApps.getApkCode());
                appBaseInfoObj.setIntro(topicApps.getAppIntroduce());
                appBaseInfoObj.setPackageName(topicApps.getPackageName());
                if (topicApps.getActivation() != null && topicApps.getActivation().intValue() == 1) {
                    appBaseInfoObj.setActivation(topicApps.getActivation());
                } else {
                    appBaseInfoObj.setActivation(0);
                }

                List<String> pics = topicManager.getAppPics(topicApps.getAppId(), topicApps.getAccountId());
                List<String> picList = new ArrayList<String>();
                for (int i = 0; i < pics.size(); i++) {
                    picList.add(gatewayUrl.getImgUrl() + "img_pic/" + pics.get(i));
                }
                appBaseInfoObj.setPicList(picList);
                appBaseInfoObjList.add(appBaseInfoObj);
            }
            /*   //装载星级，价格，下载次数
            appInfoService.setAppsInfos(appBaseInfoObjList, true, true, true);*/
            topicName = topicManager.findTopicNameById(topicId);
            topicAppListRes.setTopicName(topicName);
            topicAppListRes.setAppBaseInfoObjs(appBaseInfoObjList);
            topicAppListRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
        } catch (Exception e) {
            topicAppListRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, e.getMessage()));
            e.printStackTrace();
        }
        return topicAppListRes;
    }

    public TopicListRes findTopicNewList(Integer padChannelId) {
        TopicListRes topicListRes = new TopicListRes();
        List<TopicInfoObj> topicInfoObjList = new ArrayList<TopicInfoObj>();
        try {
            if (padChannelId != null && padChannelId.intValue() != 0) {
                List<Topic> topicPaginatedList = topicManager.findTopicNew(padChannelId);
                if (topicPaginatedList != null && topicPaginatedList.size() > 0) {
                    topicListRes.setTn(topicPaginatedList.size());
                    Map topicAppCountMap = topicManager.findTopicAppCount();
                    StringBuffer buffer = new StringBuffer();
                    buffer.append("\"");
                    for (int i = 0; i < topicPaginatedList.size(); i++) {
                        if (i == (topicPaginatedList.size() - 1)) {
                            buffer.append(topicPaginatedList.get(i).getTopicId() + "\"");
                        } else {
                            buffer.append(topicPaginatedList.get(i).getTopicId() + "\",\"");
                        }
                    }

                    List<AppResObj> list = topicManager.getAppRes(buffer.toString());
                    Map map = new HashMap();
                    for (AppResObj appResObjTemp : list) {
                        if (map.get(appResObjTemp.getAppid()) != null) {
                            List<String> stringList = (List) map.get(appResObjTemp.getAppid());
                            String resUrl = gatewayUrl.getImgUrl() + "img_pic/" + appResObjTemp.getResUrl();
                            stringList.add(resUrl);
                        } else {
                            List<String> stringList = new ArrayList<String>();
                            String resUrl = gatewayUrl.getImgUrl() + "img_pic/" + appResObjTemp.getResUrl();
                            stringList.add(resUrl);
                            map.put(appResObjTemp.getAppid(), stringList);
                        }
                    }

                    for (Topic topic : topicPaginatedList) {
                        TopicInfoObj topicInfoObj = new TopicInfoObj();
                        topicInfoObj.setId(topic.getTopicId());
                        topicInfoObj.setName(topic.getTopicName());
                        topicInfoObj.setLogo(gatewayUrl.getImgUrl() + "topicImage/" + topic.getLogoUrl());
                        topicInfoObj.setIntro(topic.getIntro());
                        topicInfoObj.setPubTime(topic.getPubTime());
                        topicInfoObj.setAppCount((Long) topicAppCountMap.get(topic.getTopicId()));
                        // 将每个专题下的应用放入专题下
                        List<TopicApps> topicAppsList = topicManager.findTopicNewApps(topic.getTopicId(), padChannelId);
                        List<AppBaseInfoObj> appBaseInfoObjList = new ArrayList<AppBaseInfoObj>();
                        for (TopicApps topicApps : topicAppsList) {
                            AppBaseInfoObj appBaseInfoObj = new AppBaseInfoObj();
                            appBaseInfoObj.setAppId(topicApps.getAppId());
                            appBaseInfoObj.setName(topicApps.getAppName());
                            appBaseInfoObj.setAppVersion(topicApps.getAppVersion());
                            appBaseInfoObj.setPkgSize(GatewayUtils.formatSize(topicApps.getPkgSize()));
                            appBaseInfoObj.setLogo(gatewayUrl.getLogoUrl() + topicApps.getLogoUrl());
                            appBaseInfoObj.setDefaultCategoryName(topicApps.getCategoryName());
                            appBaseInfoObj.setDownPath(gatewayUrl.getImgUrl() + "apk/" + topicApps.getResUrl());
                            appBaseInfoObj.setApkCode(topicApps.getApkCode());
                            appBaseInfoObj.setIntro(topicApps.getAppIntroduce());
                            appBaseInfoObj.setPackageName(topicApps.getPackageName());
                            if (topicApps.getActivation() != null && topicApps.getActivation().intValue() == 1) {
                                appBaseInfoObj.setActivation(topicApps.getActivation());
                            } else {
                                appBaseInfoObj.setActivation(0);
                            }
                            appBaseInfoObj.setPicList((List) map.get(topicApps.getAppId()));
                            appBaseInfoObjList.add(appBaseInfoObj);
                        }

                        topicInfoObj.setAppBaseInfoObjs(appBaseInfoObjList);
                        topicInfoObjList.add(topicInfoObj);
                        topicListRes.setTopicInfoObjs(topicInfoObjList);
                        topicListRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
                    }
                } else {
                    topicListRes.setResultObj(new ResultObj(0, "该渠道下暂无专题"));
                }
            } else {
                topicListRes.setResultObj(new ResultObj(-1, "渠道ID不能为空"));
            }
        } catch (Exception e) {
            topicListRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return topicListRes;
    }


    public void setTopicManager(TopicManager topicManager) {
        this.topicManager = topicManager;
    }

    public void setGatewayUrl(GatewayUrl gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }

    public void setAppInfoService(AppInfoService appInfoService) {
        this.appInfoService = appInfoService;
    }
}
