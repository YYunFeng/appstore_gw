package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.obj.AppInfoResult;
import com.jd.appstore.gateway.domain.obj.CommentSummaryInfoObj;
import com.jd.appstore.gateway.manager.DownloadManager;
import com.jd.appstore.gateway.service.AppInfoService;
import com.jd.common.util.Money;
import org.apache.log4j.Logger;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-24
 * Time: 下午4:54
 * To change this template use File | Settings | File Templates.
 */
public class AppInfoServiceImpl implements AppInfoService {

    private Logger logger = Logger.getLogger(this.getClass());
    private DownloadManager downloadManager;

    public AppInfoResult setAppInfos(Object object, boolean star, boolean price, boolean download) {
        AppInfoResult appInfoResult = null;
        try {

            Method getAppIdMethod;
            Method setPriceMethod;
            Method setStarMethod;
            Method setDownloadMethod;
            if (object != null) {
                //获取appId
                getAppIdMethod = object.getClass().getMethod("getAppId");
                Integer appId = (Integer) getAppIdMethod.invoke(object);
                if (appId != null) {
                    if (download) {
                        logger.info("appid:" + appId);
                        Integer downloadTimes = downloadManager.findDownloadTimes(appId);
                        setDownloadMethod = object.getClass().getMethod("setDownloads", Integer.class);
                        setDownloadMethod.invoke(object, downloadTimes);
                    }
                }
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return appInfoResult;
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setAppsInfos(List<?> appList, boolean star, boolean price, boolean download) {
        Map<String, Money> priceMap = null;
        Map<Integer, CommentSummaryInfoObj> commentSummaryMap = null;
        Map<Integer, Integer> downloadStatMap = null;
        try {
            if (appList != null && appList.size() > 0) {
                StringBuilder appIds = new StringBuilder();
                Method getAppIdMethod;
                Method setPriceMethod;
                Method setStarMethod;
                Method setDownloadMethod;
                for (Object obj : appList) {
                    getAppIdMethod = obj.getClass().getMethod("getAppId");
                    appIds.append(getAppIdMethod.invoke(obj)).append(",");
                }
                if (appIds.indexOf(",") > -1) {
                    appIds.deleteCharAt(appIds.lastIndexOf(","));
                }

                if (download) {
                    downloadStatMap = downloadManager.findDownloadTimesByIds(appIds.toString());
                }
                for (Object obj : appList) {
                    getAppIdMethod = obj.getClass().getMethod("getAppId");
                    Integer appId = (Integer) getAppIdMethod.invoke(obj);
                    if (price) {
                        setPriceMethod = obj.getClass().getMethod("setPrice", Long.class);
                        if (priceMap != null) {
                            if (priceMap.get(appId + "") != null)
                                setPriceMethod.invoke(obj, priceMap.get(appId + "").getCent());
                            else
                                setPriceMethod.invoke(obj, 0L);
                        } else {
                            setPriceMethod.invoke(obj, 0L);
                        }
                    }
                    if (star) {
                        setStarMethod = obj.getClass().getMethod("setStar", Integer.class);
                        if (commentSummaryMap != null) {
                            if (commentSummaryMap.get(appId) != null)
                                setStarMethod.invoke(obj, commentSummaryMap.get(appId).getStar());
                            else
                                setStarMethod.invoke(obj, 0);
                        } else {
                            setStarMethod.invoke(obj, 0);
                        }
                    }
                    if (download) {
                        setDownloadMethod = obj.getClass().getMethod("setDownloads", Integer.class);
                        if (downloadStatMap != null) {
                            if (downloadStatMap.get(appId.intValue()) != null)
                                setDownloadMethod.invoke(obj, downloadStatMap.get(appId.intValue()));
                            else
                                setDownloadMethod.invoke(obj, 0);
                        } else {
                            setDownloadMethod.invoke(obj, 0);
                        }
                    }
                }
            } else {
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //To change body of implemented methods use File | Settings | File Templates.
    }



    public void setDownloadManager(DownloadManager downloadManager) {
        this.downloadManager = downloadManager;
    }

}
