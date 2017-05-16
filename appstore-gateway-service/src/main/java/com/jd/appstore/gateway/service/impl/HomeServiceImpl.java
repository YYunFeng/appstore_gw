package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.dao.HomeInfo;
import com.jd.appstore.gateway.domain.obj.HomeInfoObj;
import com.jd.appstore.gateway.domain.obj.ImageLinkObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.HomeRes;
import com.jd.appstore.gateway.domain.util.GatewayUrl;
import com.jd.appstore.gateway.domain.util.GetImgPath;
import com.jd.appstore.gateway.manager.HomeManager;
import com.jd.appstore.gateway.service.AppInfoService;
import com.jd.appstore.gateway.service.HomeService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-21
 * Time: 下午6:35
 * To change this template use File | Settings | File Templates.
 */
public class HomeServiceImpl implements HomeService {
    private HomeManager homeManager;
    private AppInfoService appInfoService;
    private GatewayUrl gatewayUrl;

    public HomeRes findHomeInfo(Integer clientType) {
        HomeRes homeRes = new HomeRes();
        try {
            List<HomeInfo> homeInfoList = homeManager.findHomeInfo(clientType);
            List<ImageLinkObj> imageLinkObjList = null;
            List<HomeInfoObj> homeInfoObjList = new ArrayList<HomeInfoObj>();
            HomeInfoObj homeInfoObj = null;
            int homeAreaId = -1;
            for (int i = 0; i < homeInfoList.size(); i++) {
                HomeInfo homeInfo = homeInfoList.get(i);
                ImageLinkObj imageLinkObj = new ImageLinkObj();
                imageLinkObj.setLt(homeInfo.getLinkType());
                imageLinkObj.setLid(homeInfo.getLinkedAppId());
                imageLinkObj.setLogo(gatewayUrl.getImgUrl()+ GetImgPath.getImgPath(homeInfo.getLinkType(),homeInfo.isAppLogo()) + homeInfo.getUrl());
                imageLinkObj.setIntro(homeInfo.getIntro());
                if (i == 0 || homeAreaId != homeInfo.getHomeAreaId()) {
                    imageLinkObjList = new ArrayList<ImageLinkObj>();
                    imageLinkObjList.add(imageLinkObj);
                    homeInfoObj = new HomeInfoObj();
                    homeInfoObj.setAreaType(homeInfo.getHomeAreaType());
                    homeInfoObj.setImageLinkObjs(imageLinkObjList);
                    homeInfoObjList.add(homeInfoObj);
                } else {
                    imageLinkObjList.add(imageLinkObj);
                }
                homeAreaId = homeInfo.getHomeAreaId();
            }

            homeRes.setHomeInfoObjs(homeInfoObjList);
            homeRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
        } catch (Exception e) {
            homeRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return homeRes;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setHomeManager(HomeManager homeManager) {
        this.homeManager = homeManager;
    }

    public void setGatewayUrl(GatewayUrl gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }
}
