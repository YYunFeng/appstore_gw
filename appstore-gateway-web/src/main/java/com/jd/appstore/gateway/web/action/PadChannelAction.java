package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.PadChannelRes;
import com.jd.appstore.gateway.service.PadChannelService;
import com.jd.common.struts.action.BaseAction;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 13-1-29
 * Time: 下午3:26
 * To change this template use File | Settings | File Templates.
 */
public class PadChannelAction extends BaseAction{
    private PadChannelService padChannelService;
    private PadChannelRes padChannelRes;
    
    public  String List(){
        padChannelRes = padChannelService.findPadChannel();
        return "list";
    }

    public void setPadChannelService(PadChannelService padChannelService) {
        this.padChannelService = padChannelService;
    }

    public PadChannelRes getPadChannelRes() {
        return padChannelRes;
    }

    public void setPadChannelRes(PadChannelRes padChannelRes) {
        this.padChannelRes = padChannelRes;
    }
}
