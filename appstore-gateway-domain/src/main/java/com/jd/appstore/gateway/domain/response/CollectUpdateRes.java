package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.CollectUpdateObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;

import java.util.List;

/**
 * Created by YUNFENG on 13-12-16.
 */
public class CollectUpdateRes {
    private List<CollectUpdateObj> collectUpdateObjList;
    private ResultObj resultObj;

    public List<CollectUpdateObj> getCollectUpdateObjList() {
        return collectUpdateObjList;
    }

    public void setCollectUpdateObjList(List<CollectUpdateObj> collectUpdateObjList) {
        this.collectUpdateObjList = collectUpdateObjList;
    }

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }
}
