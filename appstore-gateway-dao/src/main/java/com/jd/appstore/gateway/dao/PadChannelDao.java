package com.jd.appstore.gateway.dao;

import com.jd.appstore.gateway.domain.dao.PadChannel;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 13-1-29
 * Time: 下午3:44
 * To change this template use File | Settings | File Templates.
 */
public interface PadChannelDao {
      List<PadChannel> findPadChannelList();
}
