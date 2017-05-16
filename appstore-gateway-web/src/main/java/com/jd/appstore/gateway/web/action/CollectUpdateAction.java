package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.CollectUpdateRes;
import com.jd.appstore.gateway.service.CollectUpdateService;
import com.jd.common.struts.action.BaseAction;

/**
 * 收藏更新接口接口
 * Created by YUNFENG on 13-12-16.
 */
public class CollectUpdateAction extends BaseAction {
    private String appids;
    private CollectUpdateRes collectUpdateRes;
    private CollectUpdateService collectUpdateService;

    public String collectUpdate() {
        collectUpdateRes = collectUpdateService.getCollectUpdateAppids(appids);
        return "collectUpdate";
    }

    public String getAppids() {
        return appids;
    }

    public void setAppids(String appids) {
        this.appids = appids;
    }

    public CollectUpdateRes getCollectUpdateRes() {
        return collectUpdateRes;
    }

    public void setCollectUpdateRes(CollectUpdateRes collectUpdateRes) {
        this.collectUpdateRes = collectUpdateRes;
    }

    public void setCollectUpdateService(CollectUpdateService collectUpdateService) {
        this.collectUpdateService = collectUpdateService;
    }
}
