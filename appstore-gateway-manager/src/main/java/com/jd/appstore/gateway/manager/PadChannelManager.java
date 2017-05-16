package com.jd.appstore.gateway.manager;

import com.jd.appstore.gateway.domain.obj.PadChannelInfoObj;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 13-1-29
 * Time: 下午3:48
 * To change this template use File | Settings | File Templates.
 */
public interface PadChannelManager {
    List<PadChannelInfoObj> findPadChannel();
}
