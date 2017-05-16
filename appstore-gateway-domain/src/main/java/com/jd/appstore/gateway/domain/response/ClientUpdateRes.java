package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.ClientVersionObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-6-27
 * Time: 下午2:45
 * To change this template use File | Settings | File Templates.
 */
public class ClientUpdateRes {
    private ClientVersionObj clientVersionObj;
    private ResultObj resultObj;

    public ClientVersionObj getClientVersionObj() {
        return clientVersionObj;
    }

    public void setClientVersionObj(ClientVersionObj clientVersionObj) {
        this.clientVersionObj = clientVersionObj;
    }

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }
}
