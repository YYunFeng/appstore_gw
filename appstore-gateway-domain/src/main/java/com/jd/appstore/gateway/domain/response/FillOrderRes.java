package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.dao.FillOrder;
import com.jd.appstore.gateway.domain.obj.ResultObj;

/**
 * User: YUNFENG
 * Date: 13-11-20
 * Time: 下午2:47
 * To change this template use File | Settings | File Templates.
 */
public class FillOrderRes {
    private String downloadUrl;
    private String packageName;
    private Integer appVersionCode;
    private FillOrder fillOrder;
    private ResultObj resultObj;

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public FillOrder getFillOrder() {
        return fillOrder;
    }

    public void setFillOrder(FillOrder fillOrder) {
        this.fillOrder = fillOrder;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Integer getAppVersionCode() {
        return appVersionCode;
    }

    public void setAppVersionCode(Integer appVersionCode) {
        this.appVersionCode = appVersionCode;
    }


    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }
}
