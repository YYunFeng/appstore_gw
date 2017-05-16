package com.jd.appstore.gateway.dao;

import com.jd.appstore.gateway.domain.dao.parameter.LogDownloadParameter;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-9-5
 * Time: 下午6:03
 * To change this template use File | Settings | File Templates.
 */
public interface LogDao {
    void createDownloadLog(LogDownloadParameter logDownloadParameter);
}
