package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.DownloadDao;
import com.jd.appstore.gateway.domain.dao.DownloadStat;
import com.jd.common.dao.BaseDao;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-8-29
 * Time: 下午5:07
 * To change this template use File | Settings | File Templates.
 */
public class DownloadDaoImpl extends BaseDao implements DownloadDao {
    public DownloadStat findDownloadTimes(int appId) {
        return (DownloadStat) queryForObject("Download.findDownloadStat", appId);
    }

    public Map<Integer, Integer> findDownloadTimesByIds(String appIds) {
        return queryForMap("Download.findDownloadStatByIds", appIds, "appId", "downloadTimes");
    }
}
