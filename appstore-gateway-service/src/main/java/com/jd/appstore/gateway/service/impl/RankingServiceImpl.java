package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.dao.Ranking;
import com.jd.appstore.gateway.domain.enumtype.PicResolutionEnum;
import com.jd.appstore.gateway.domain.obj.AppBaseInfoObj;
import com.jd.appstore.gateway.domain.obj.AppResObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.RankingAppsRes;
import com.jd.appstore.gateway.domain.util.GatewayUtils;
import com.jd.appstore.gateway.manager.RankingManager;
import com.jd.appstore.gateway.service.AppInfoService;
import com.jd.appstore.gateway.service.RankingService;
import com.jd.appstore.gateway.domain.util.GatewayUrl;
import com.jd.common.util.PaginatedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: gaoyang
 * Date: 12-8-12
 * Time: 下午5:09
 * To change this template use File | Settings | File Templates.
 */
public class RankingServiceImpl implements RankingService {
    private RankingManager rankingManager;
    private GatewayUrl gatewayUrl;
    private AppInfoService appInfoService;

    public RankingAppsRes findRankingApp(Integer rangkingStyle, Integer rankingType, Integer pageNum, Integer pageSize) {
        RankingAppsRes rankingAppsRes = new RankingAppsRes();
        try {
            PaginatedList<Ranking> rankingList = rankingManager.findRanking(rangkingStyle, rankingType, pageNum, pageSize);
            if (rankingList != null && rankingList.size() > 0) {
                List<AppBaseInfoObj> appBaseInfoObjList = new ArrayList<AppBaseInfoObj>();
                StringBuffer buffer = new StringBuffer();
                buffer.append("\"");
                for (int i = 0; i < rankingList.size(); i++) {
                    if (i == (rankingList.size() - 1)) {
                        buffer.append(rankingList.get(i).getAppId() + "\"");
                    } else {
                        buffer.append(rankingList.get(i).getAppId() + "\",\"");
                    }
                }


                List<AppResObj> list = rankingManager.getAppRes(buffer.toString());
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

                for (Ranking ranking : rankingList) {
                    AppBaseInfoObj appBaseInfoObj = new AppBaseInfoObj();
                    appBaseInfoObj.setAppId(ranking.getAppId());
                    appBaseInfoObj.setName(ranking.getAppName());
                    appBaseInfoObj.setLogo(gatewayUrl.getImgUrl() + PicResolutionEnum.COVER.getPrefix() + ranking.getLogoUrl());
                    appBaseInfoObj.setDefaultCategoryName(ranking.getCategoryName());
                    appBaseInfoObj.setCpName(ranking.getCpName());
                    appBaseInfoObj.setIntro(ranking.getAppIntroduce());
                    appBaseInfoObj.setPackageName(ranking.getPackageName());
                    appBaseInfoObj.setApkCode(ranking.getApkCode());
                    appBaseInfoObj.setPkgSize(GatewayUtils.formatSize(ranking.getPkgSize()));
                    appBaseInfoObj.setAppVersion(ranking.getAppVersion());
                    appBaseInfoObj.setDownPath(gatewayUrl.getImgUrl() + "apk/" + ranking.getDownPath());
                    appBaseInfoObj.setPicList((List) map.get(ranking.getAppId()));


                    appBaseInfoObjList.add(appBaseInfoObj);
                }
                rankingAppsRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
                rankingAppsRes.setAppBaseInfoObjs(appBaseInfoObjList);
                rankingAppsRes.setAn(pageNum);
                rankingAppsRes.setTp(GatewayUtils.getTotalPage(rankingList.getTotalItem(), pageSize));
            } else {
                rankingAppsRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            }
        } catch (Exception e) {
            rankingAppsRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return rankingAppsRes;
    }

    public void setAppInfoService(AppInfoService appInfoService) {
        this.appInfoService = appInfoService;
    }

    public void setRankingManager(RankingManager rankingManager) {
        this.rankingManager = rankingManager;
    }

    public void setGatewayUrl(GatewayUrl gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }
}
