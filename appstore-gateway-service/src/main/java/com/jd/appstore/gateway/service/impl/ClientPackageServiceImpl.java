package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.dao.ClientPackage;
import com.jd.appstore.gateway.domain.enumtype.PicResolutionEnum;
import com.jd.appstore.gateway.domain.obj.ClientVersionObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.ClientUpdateRes;
import com.jd.appstore.gateway.domain.util.GatewayUrl;
import com.jd.appstore.gateway.manager.ClientPackageManager;
import com.jd.appstore.gateway.service.ClientPackageService;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-6-27
 * Time: 下午2:39
 * To change this template use File | Settings | File Templates.
 */
public class ClientPackageServiceImpl implements ClientPackageService {
    private ClientPackageManager clientPackageManager;
    private GatewayUrl gatewayUrl;

    public void setClientPackageManager(ClientPackageManager clientPackageManager) {
        this.clientPackageManager = clientPackageManager;
    }

    public ClientUpdateRes checkClientUpdate(Integer versionCode, Integer clientType) {
        ClientUpdateRes clientUpdateRes = new ClientUpdateRes();
        try {
            if (versionCode != null) {
                if (clientType == null) {
                    clientType = 1;
                }
                ClientPackage clientPackage = clientPackageManager.getClientPackage(clientType);
                if (clientPackage != null) {
                    ClientVersionObj clientVersionObj = new ClientVersionObj();
                    if (clientPackage.getVersionCode().intValue() <= versionCode.intValue()) {  // 不需要更新
                        clientVersionObj.setNeedUpdate(false);
                        clientVersionObj.setIntro("当前版本为最新，不需要升级");
                    } else {
                        clientVersionObj.setNeedUpdate(true);
                        clientVersionObj.setIntro(clientPackage.getIntro());
                        clientVersionObj.setVersion(clientPackage.getVersion());
                        clientVersionObj.setVersionCode(clientPackage.getVersionCode());
                        clientVersionObj.setPackageUrl(gatewayUrl.getImgUrl() + PicResolutionEnum.ANDROIDCLIENT.getPrefix() + clientPackage.getPackageUrl());
                    }
                    clientUpdateRes.setClientVersionObj(clientVersionObj);
                    clientUpdateRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
                } else {
                    clientUpdateRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
                }
            } else {
                clientUpdateRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            }
        } catch (Exception e) {
            clientUpdateRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return clientUpdateRes;
    }

    public ClientUpdateRes getUpdateTools(Integer versionCode) {
        ClientUpdateRes clientUpdateRes = new ClientUpdateRes();
        try {

           /*   if (versionCode != null) {
                ClientVersionObj clientVersionObj = new ClientVersionObj();
                clientVersionObj.setNeedUpdate(false);
                clientVersionObj.setIntro("当前为最新版本");
                clientUpdateRes.setClientVersionObj(clientVersionObj);
                clientUpdateRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
            } else {
                clientUpdateRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            }*/
            if (versionCode != null) {
                ClientVersionObj clientVersionObj = new ClientVersionObj();
                clientVersionObj.setNeedUpdate(true);
                clientVersionObj.setPackageUrl("http://182.92.79.56/PPadUpgrader.apk");
                clientUpdateRes.setClientVersionObj(clientVersionObj);
                clientUpdateRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
            } else {
                clientUpdateRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            }
        } catch (Exception e) {
            clientUpdateRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return clientUpdateRes;
    }

    public void setGatewayUrl(GatewayUrl gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }
}
