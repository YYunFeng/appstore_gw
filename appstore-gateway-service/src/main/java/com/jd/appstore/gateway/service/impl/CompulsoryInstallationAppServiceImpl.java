package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.obj.AppBaseInfoObj;
import com.jd.appstore.gateway.domain.obj.CompulsoryInstallationAppObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.obj.TopicInfoObj;
import com.jd.appstore.gateway.domain.response.CompulsoryInstallationAppRes;
import com.jd.appstore.gateway.domain.response.TopicAppListRes;
import com.jd.appstore.gateway.domain.response.TopicListRes;
import com.jd.appstore.gateway.domain.util.GatewayUrl;
import com.jd.appstore.gateway.manager.CompulsoryInstallationAppManager;
import com.jd.appstore.gateway.service.CompulsoryInstallationAppService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class CompulsoryInstallationAppServiceImpl implements CompulsoryInstallationAppService {
    private CompulsoryInstallationAppManager compulsoryInstallationAppManager;
    private GatewayUrl gatewayUrl;

    public TopicAppListRes getCompulsoryInstallationApps() {
        TopicAppListRes topicAppListRes = new TopicAppListRes();
        try {
            List<CompulsoryInstallationAppObj> list = compulsoryInstallationAppManager.getCompulsoryInstallationApps();
            if (list != null && list.size() > 0) {
                List<AppBaseInfoObj> appBaseInfoObjs = new ArrayList<AppBaseInfoObj>();
                for (CompulsoryInstallationAppObj compulsoryInstallationAppObj : list) {
                    AppBaseInfoObj appBaseInfoObj = new AppBaseInfoObj();
                    appBaseInfoObj.setAppId(Integer.valueOf(compulsoryInstallationAppObj.getAppid()));
                    appBaseInfoObj.setPackageName(compulsoryInstallationAppObj.getPackAge());
                    appBaseInfoObjs.add(appBaseInfoObj);
                }
                topicAppListRes.setAppBaseInfoObjs(appBaseInfoObjs);
                topicAppListRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS, "success"));
            } else {
                topicAppListRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS, "数据为空"));
            }
        } catch (Exception e) {
            topicAppListRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "系统异常"));
            e.printStackTrace();
        }
        return topicAppListRes;
    }

    public void setCompulsoryInstallationAppManager(CompulsoryInstallationAppManager compulsoryInstallationAppManager) {
        this.compulsoryInstallationAppManager = compulsoryInstallationAppManager;
    }

    public void setGatewayUrl(GatewayUrl gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }
}
