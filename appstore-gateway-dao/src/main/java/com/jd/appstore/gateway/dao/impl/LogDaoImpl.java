package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.LogDao;
import com.jd.appstore.gateway.domain.dao.parameter.LogDownloadParameter;
import com.jd.common.dao.BaseDao;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-9-5
 * Time: 下午6:04
 * To change this template use File | Settings | File Templates.
 */
public class LogDaoImpl extends BaseDao implements LogDao {
    public void createDownloadLog(LogDownloadParameter logDownloadParameter) {
        insert("Log.createdDownloadLog", logDownloadParameter);
    }
}
