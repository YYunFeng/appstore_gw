package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.CollectUpdateDao;
import com.jd.common.dao.BaseDao;

import java.util.List;

/**
 * Created by YUNFENG on 13-12-16.
 */
public class CollectUpdateDaoImpl extends BaseDao implements CollectUpdateDao {
    public List<String> getCollectUpdateAppids(String appids) {
        return queryForList("CollectUpdate.getCollectUpdateAppids", appids);
    }
}
