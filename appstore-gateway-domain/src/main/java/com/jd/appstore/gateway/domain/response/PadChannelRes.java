package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.PadChannelInfoObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: YYF
 * Date: 13-1-29
 * Time: 下午3:32
 * To change this template use File | Settings | File Templates.
 */
public class PadChannelRes {
    private ResultObj  resultObj;
    private List<PadChannelInfoObj> padChannelInfoObjs;

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

    public List<PadChannelInfoObj> getPadChannelInfoObjs() {
        return padChannelInfoObjs;
    }

    public void setPadChannelInfoObjs(List<PadChannelInfoObj> padChannelInfoObjs) {
        this.padChannelInfoObjs = padChannelInfoObjs;
    }
}
