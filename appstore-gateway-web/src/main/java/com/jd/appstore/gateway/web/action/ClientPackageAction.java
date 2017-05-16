package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.ClientUpdateRes;
import com.jd.appstore.gateway.service.ClientPackageService;
import com.jd.common.struts.action.BaseAction;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-6-27
 * Time: 下午2:41
 * To change this template use File | Settings | File Templates.
 */
public class ClientPackageAction extends BaseAction {
    private ClientPackageService clientPackageService;
    private ClientUpdateRes clientUpdateRes;
    private Integer versionCode;
    private Integer clientType;

    public String Update() {
        clientUpdateRes = clientPackageService.getUpdateTools(versionCode);
        return "update";

    /*  clientUpdateRes = clientPackageService.checkClientUpdate(versionCode, clientType);
        return "update";*/
    }

    public String Update2() {
        clientUpdateRes = clientPackageService.checkClientUpdate(versionCode, clientType);
        return "update";
    }

    public void setClientPackageService(ClientPackageService clientPackageService) {
        this.clientPackageService = clientPackageService;
    }

    public Integer getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }

    public ClientUpdateRes getClientUpdateRes() {
        return clientUpdateRes;
    }

    public void setClientUpdateRes(ClientUpdateRes clientUpdateRes) {
        this.clientUpdateRes = clientUpdateRes;
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }
}
