package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.PadChannelDao;
import com.jd.appstore.gateway.domain.dao.PadChannel;
import com.jd.common.dao.BaseDao;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 13-1-29
 * Time: 下午3:45
 * To change this template use File | Settings | File Templates.
 */
public class PadChannelDaoImpl extends BaseDao implements PadChannelDao {
    public List<PadChannel> findPadChannelList() {
        return queryForList("PadChannel.findPadChannel");  //To change body of implemented methods use File | Settings | File Templates.
    }
}
