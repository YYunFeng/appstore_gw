package com.jd.appstore.gateway.dao;

import com.jd.appstore.gateway.domain.dao.CountApp;

import java.util.List;

/**
 * Created by YUNFENG on 14-2-11.
 */
public interface CountAppDao {
    void createCountApp(CountApp countApp);

    List getCountAppid(List<String> packageName);
}
