package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.PadChannelDao;
import com.jd.appstore.gateway.domain.dao.PadChannel;
import com.jd.appstore.gateway.domain.obj.PadChannelInfoObj;
import com.jd.appstore.gateway.manager.PadChannelManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 13-1-29
 * Time: 下午3:48
 * To change this template use File | Settings | File Templates.
 */
public class PadChannelManagerImpl implements PadChannelManager {
    private PadChannelDao padChannelDao;

    public List<PadChannelInfoObj> findPadChannel() {
        List<PadChannelInfoObj> padChannelInfoObjList = new ArrayList<PadChannelInfoObj>();
        List<PadChannel> padChannelList = padChannelDao.findPadChannelList();
        for (PadChannel padChannel : padChannelList) {
            PadChannelInfoObj padChannelInfoObj = new PadChannelInfoObj();
            padChannelInfoObj.setId(padChannel.getId());
            padChannelInfoObj.setCname(padChannel.getCname());
            padChannelInfoObj.setIntro(padChannel.getIntro());
            padChannelInfoObj.setGw(padChannel.getGw());
            padChannelInfoObjList.add(padChannelInfoObj);
        }
        return padChannelInfoObjList;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setPadChannelDao(PadChannelDao padChannelDao) {
        this.padChannelDao = padChannelDao;
    }
}
