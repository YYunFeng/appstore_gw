package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.CountAppDao;
import com.jd.appstore.gateway.domain.dao.CountApp;
import com.jd.common.dao.BaseDao;

import java.util.List;

/**
 * Created by YUNFENG on 14-2-11.
 */
public class CountAppDaoImpl extends BaseDao implements CountAppDao {
    public void createCountApp(CountApp countApp) {
        insert("CountApp.createCountApp", countApp);
    }

    public List<String> getCountAppid(List<String> packageName) {
        return queryForList("CountApp.getCountAppid", packageName);
    }


}
