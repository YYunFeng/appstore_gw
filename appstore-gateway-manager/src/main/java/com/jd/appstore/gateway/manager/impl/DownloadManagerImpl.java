package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.DownloadDao;
import com.jd.appstore.gateway.domain.dao.DownloadStat;
import com.jd.appstore.gateway.manager.DownloadManager;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-8-29
 * Time: 下午5:20
 * To change this template use File | Settings | File Templates.
 */
public class DownloadManagerImpl implements DownloadManager {

    private DownloadDao downloadDao;

    public Integer findDownloadTimes(Integer appId) {
        DownloadStat downloadStat = downloadDao.findDownloadTimes(appId);
        return downloadStat == null ? 0 : downloadStat.getDownloadTimes();
    }

    public Map<Integer, Integer> findDownloadTimesByIds(String appIds) {
        return downloadDao.findDownloadTimesByIds(appIds);
    }

    public void setDownloadDao(DownloadDao downloadDao) {
        this.downloadDao = downloadDao;
    }
}
