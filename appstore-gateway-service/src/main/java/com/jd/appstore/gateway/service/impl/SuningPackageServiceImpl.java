package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.obj.SuningPackageObj;
import com.jd.appstore.gateway.domain.response.AppDownloadRes;
import com.jd.appstore.gateway.domain.response.SuningPackageRes;
import com.jd.appstore.gateway.domain.util.GatewayUrl;
import com.jd.appstore.gateway.manager.SuningPackageManger;
import com.jd.appstore.gateway.service.SuningPackageService;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class SuningPackageServiceImpl implements SuningPackageService {
    private SuningPackageManger suningPackageManger;
    private GatewayUrl gatewayUrl;

    public AppDownloadRes getSuningPackage(Integer shopId) {
        AppDownloadRes appDownloadRes = new AppDownloadRes();
        try {
            SuningPackageObj suningPackageObj = suningPackageManger.getSuningPackage(shopId);
            if (suningPackageObj != null) {
                appDownloadRes.setUrl(gatewayUrl.getSuningApkUrl() + suningPackageObj.getFileUrl());
                appDownloadRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS, "success"));
            } else {
                appDownloadRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS, "暂无该门店安装包,请检查门店ID是否正确"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            appDownloadRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "系统异常"));
        }
        return appDownloadRes;
    }

    public void setSuningPackageManger(SuningPackageManger suningPackageManger) {
        this.suningPackageManger = suningPackageManger;
    }

    public void setGatewayUrl(GatewayUrl gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }
}
