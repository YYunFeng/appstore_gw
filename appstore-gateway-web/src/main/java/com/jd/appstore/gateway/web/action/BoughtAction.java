package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.obj.AppBaseInfoObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.BoughtAppRes;
import com.jd.appstore.gateway.domain.util.GatewayUrl;
import com.jd.appstore.gateway.domain.util.GatewayUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * User: gaoyang
 * Date: 12-8-19
 * Time: 下午6:53
 * To change this template use File | Settings | File Templates.
 */
public class BoughtAction {
    private BoughtAppRes boughtAppRes;
    private GatewayUrl gatewayUrl;

    public String App() {
        boughtAppRes = new BoughtAppRes();
        List<AppBaseInfoObj> appBaseInfoObjList = new ArrayList<AppBaseInfoObj>();
        AppBaseInfoObj appBaseInfoObj = new AppBaseInfoObj();
        appBaseInfoObj.setAppId(1043);
        appBaseInfoObj.setName("ZAKER（扎客)");
        appBaseInfoObj.setLogo(gatewayUrl.getLogoUrl() + "0B4413967E75496EAB05BA2512C40824.jpg");
        appBaseInfoObj.setBoughtTime(new Date());
        appBaseInfoObj.setPkgSize(GatewayUtils.formatSize(2344421));
        appBaseInfoObjList.add(appBaseInfoObj);
        appBaseInfoObj = new AppBaseInfoObj();
        appBaseInfoObj.setAppId(1046);
        appBaseInfoObj.setName("豆瓣电影");
        appBaseInfoObj.setLogo(gatewayUrl.getLogoUrl() + "6951D740458C48678473A3B877FCD48D.jpg");
        appBaseInfoObj.setBoughtTime(new Date());
        appBaseInfoObj.setPkgSize(GatewayUtils.formatSize(2344421));
        appBaseInfoObjList.add(appBaseInfoObj);
        appBaseInfoObj = new AppBaseInfoObj();
        appBaseInfoObj.setAppId(1047);
        appBaseInfoObj.setName("鳄鱼爱洗澡");
        appBaseInfoObj.setLogo(gatewayUrl.getLogoUrl() + "9AA4F22635BC4B97B6231E9D728299ED.jpg");
        appBaseInfoObj.setBoughtTime(new Date());
        appBaseInfoObj.setPkgSize(GatewayUtils.formatSize(2344421));
        appBaseInfoObjList.add(appBaseInfoObj);
        boughtAppRes.setAppBaseInfoObjs(appBaseInfoObjList);
        boughtAppRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
        return "app";
    }


    public BoughtAppRes getBoughtAppRes() {
        return boughtAppRes;
    }

    public void setBoughtAppRes(BoughtAppRes boughtAppRes) {
        this.boughtAppRes = boughtAppRes;
    }

    public void setGatewayUrl(GatewayUrl gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }
}
