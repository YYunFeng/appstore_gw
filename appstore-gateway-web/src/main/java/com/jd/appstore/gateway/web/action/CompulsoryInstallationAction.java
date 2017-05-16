package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.TopicAppListRes;
import com.jd.appstore.gateway.service.CompulsoryInstallationAppService;
import com.jd.common.struts.action.BaseAction;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class CompulsoryInstallationAction extends BaseAction {

    private CompulsoryInstallationAppService compulsoryInstallationAppService;
    private TopicAppListRes topicAppListRes;


    public String AppsList() {
        try {
            topicAppListRes  = compulsoryInstallationAppService.getCompulsoryInstallationApps();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "appsList";
    }


    public void setCompulsoryInstallationAppService(CompulsoryInstallationAppService compulsoryInstallationAppService) {
        this.compulsoryInstallationAppService = compulsoryInstallationAppService;
    }

    public TopicAppListRes getTopicAppListRes() {
        return topicAppListRes;
    }

    public void setTopicAppListRes(TopicAppListRes topicAppListRes) {
        this.topicAppListRes = topicAppListRes;
    }
}
