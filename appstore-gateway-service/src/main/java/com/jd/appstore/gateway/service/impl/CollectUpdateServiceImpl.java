package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.obj.CollectUpdateObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.CollectUpdateRes;
import com.jd.appstore.gateway.manager.CollectUpdateManager;
import com.jd.appstore.gateway.service.CollectUpdateService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YUNFENG on 13-12-16.
 */
public class CollectUpdateServiceImpl implements CollectUpdateService {
    private CollectUpdateManager collectUpdateManager;

    public CollectUpdateRes getCollectUpdateAppids(String appids) {
        CollectUpdateRes collectUpdateRes = new CollectUpdateRes();
        try {
            if (appids != null && !appids.equals("")) {
                List<String> appidList = collectUpdateManager.getCollectUpdateAppids(appids);
                //       查询出收藏应用还未下线的或者未被删除
                String[] listAppid = appids.split(",");
                List<CollectUpdateObj> collectUpdateObjList = new ArrayList<CollectUpdateObj>();
                if (listAppid != null && listAppid.length > 0) {
                    for (int i = 0; i < listAppid.length; i++) {
                        CollectUpdateObj collectUpdateObj = new CollectUpdateObj();
                        collectUpdateObj.setAppid(listAppid[i]);
                        if (appidList != null && appidList.size() > 0) {
                            for (int j = 0; j < appidList.size(); j++) {
                                if (listAppid[i].equals(appidList.get(j))) {
                                    collectUpdateObj.setDelete(0);  // 不需要删除该收藏的应用
                                    break;
                                }
                                if (j == appidList.size() - 1) {
                                    collectUpdateObj.setDelete(1); // 需要删除该收藏的应用
                                }
                            }
                        } else {
                            collectUpdateObj.setDelete(1);
                        }
                        collectUpdateObjList.add(collectUpdateObj);
                    }
                    collectUpdateRes.setCollectUpdateObjList(collectUpdateObjList);
                    collectUpdateRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
                } else {
                    collectUpdateRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "参数错误"));
                }
            } else {
                collectUpdateRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "参数不能为空"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            collectUpdateRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "系统异常"));
        }
        return collectUpdateRes;
    }

    public CollectUpdateManager getCollectUpdateManager() {
        return collectUpdateManager;
    }

    public void setCollectUpdateManager(CollectUpdateManager collectUpdateManager) {
        this.collectUpdateManager = collectUpdateManager;
    }
}
