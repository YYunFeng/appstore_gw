package com.jd.appstore.gateway.manager;

import com.jd.appstore.gateway.domain.dao.CountApp;

import java.util.List;

/**
 * Created by YUNFENG on 14-2-11.
 */
public interface CountAppManager {
    void createCountApp(CountApp countApp);

    List<String> getCountAppid(List<String> packageName);
}
