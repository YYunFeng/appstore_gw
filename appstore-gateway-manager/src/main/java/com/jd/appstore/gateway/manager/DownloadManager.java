package com.jd.appstore.gateway.manager;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-8-29
 * Time: 下午5:19
 * To change this template use File | Settings | File Templates.
 */
public interface DownloadManager {
    
    Integer findDownloadTimes(Integer appId);

    Map<Integer, Integer> findDownloadTimesByIds(String appIds);
}
