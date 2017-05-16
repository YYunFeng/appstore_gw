package com.jd.appstore.gateway.dao;

import com.jd.appstore.gateway.domain.dao.DownloadStat;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-8-29
 * Time: 下午4:51
 * To change this template use File | Settings | File Templates.
 */
public interface DownloadDao {
    DownloadStat findDownloadTimes(int appId);
    Map<Integer,Integer> findDownloadTimesByIds(String appIds);
}
