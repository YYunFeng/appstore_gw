package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.obj.PadChannelInfoObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.PadChannelRes;
import com.jd.appstore.gateway.manager.PadChannelManager;
import com.jd.appstore.gateway.service.PadChannelService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 13-1-29
 * Time: 下午3:59
 * To change this template use File | Settings | File Templates.
 */
public class PadChannelServiceImpl implements PadChannelService {
    private PadChannelManager padChannelManager;

    public PadChannelRes findPadChannel() {
        PadChannelRes padChannelRes = new PadChannelRes();
        try {
            List<PadChannelInfoObj> padChannelInfoObjList = padChannelManager.findPadChannel();
            padChannelRes.setPadChannelInfoObjs(padChannelInfoObjList);
            padChannelRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
        } catch (Exception e) {
            padChannelRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return padChannelRes;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setPadChannelManager(PadChannelManager padChannelManager) {
        this.padChannelManager = padChannelManager;
    }
}
