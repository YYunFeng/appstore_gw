package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.dao.Recommend;
import com.jd.appstore.gateway.domain.obj.ImageLinkObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.RecommendContentsRes;
import com.jd.appstore.gateway.domain.util.GatewayUrl;
import com.jd.appstore.gateway.domain.util.GetImgPath;
import com.jd.appstore.gateway.manager.AppManager;
import com.jd.appstore.gateway.manager.CategoryManager;
import com.jd.appstore.gateway.manager.RecommendManager;
import com.jd.appstore.gateway.manager.TopicManager;
import com.jd.appstore.gateway.service.AppInfoService;
import com.jd.appstore.gateway.service.RecommendService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-12
 * Time: 上午11:38
 * To change this template use File | Settings | File Templates.
 */
public class RecommendServiceImpl implements RecommendService {
    private RecommendManager recommendLocalManager;
    private AppManager appManager;
    private TopicManager topicManager;
    private CategoryManager categoryLocalManager;
    private AppInfoService appInfoService;
    private GatewayUrl gatewayUrl;

    public RecommendContentsRes findRecommendContents(Integer ct, Integer mid, Integer aid) {
        RecommendContentsRes recommendContentsRes = new RecommendContentsRes();
        try {
            List<Recommend> recommendList = recommendLocalManager.findRecommendContents(ct, mid, aid);
            if (recommendList != null && recommendList.size() > 0) {
                recommendContentsRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
                List<ImageLinkObj> imageLinkObjList = new ArrayList<ImageLinkObj>();
                for (Recommend recommends : recommendList) {
                    ImageLinkObj imageLinkObj = new ImageLinkObj();
                    imageLinkObj.setAppId(recommends.getLinkedAppId());
                    imageLinkObj.setLt(recommends.getLinkType());
                    imageLinkObj.setLid(recommends.getLinkedAppId());
                    imageLinkObj.setLurl(recommends.getLinkedUrl());
                    imageLinkObj.setLogo(gatewayUrl.getImgUrl()+ GetImgPath.getImgPath(recommends.getLinkType(), recommends.isAppLogo())+recommends.getUrl());
                    imageLinkObj.setIntro(recommends.getIntro());
                    imageLinkObjList.add(imageLinkObj);
                }
                //装载星级
                /*       appInfoService.setAppsInfos(imageLinkObjList,true,false,false);*/
                recommendContentsRes.setImageLinkObjs(imageLinkObjList);
            }
        } catch (Exception e) {
            recommendContentsRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, e.getMessage()));
            e.printStackTrace();
        }
        return recommendContentsRes;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setRecommendLocalManager(RecommendManager recommendLocalManager) {
        this.recommendLocalManager = recommendLocalManager;
    }

    public void setGatewayUrl(GatewayUrl gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }

    public void setAppManager(AppManager appManager) {
        this.appManager = appManager;
    }

    public void setTopicManager(TopicManager topicManager) {
        this.topicManager = topicManager;
    }

    public void setCategoryLocalManager(CategoryManager categoryLocalManager) {
        this.categoryLocalManager = categoryLocalManager;
    }

    public void setAppInfoService(AppInfoService appInfoService) {
        this.appInfoService = appInfoService;
    }
}
