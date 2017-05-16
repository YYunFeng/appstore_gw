package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.AppDownloadRes;
import com.jd.appstore.gateway.domain.response.SuningPackageRes;
import com.jd.appstore.gateway.service.SuningPackageService;
import com.jd.common.struts.action.BaseAction;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class SuningPackageAction extends BaseAction {
    private SuningPackageService suningPackageService;
    private Integer shopId;
    private AppDownloadRes appDownloadRes;

    public String Detail() {
        try {
            appDownloadRes = suningPackageService.getSuningPackage(shopId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "suningPackageDetail";
    }

    public void setSuningPackageService(SuningPackageService suningPackageService) {
        this.suningPackageService = suningPackageService;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public AppDownloadRes getAppDownloadRes() {
        return appDownloadRes;
    }

    public void setAppDownloadRes(AppDownloadRes appDownloadRes) {
        this.appDownloadRes = appDownloadRes;
    }
}
