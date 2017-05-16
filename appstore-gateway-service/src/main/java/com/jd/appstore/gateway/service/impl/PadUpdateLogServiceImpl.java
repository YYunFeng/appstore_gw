package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.dao.PadUpdateLog;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.PadUpdateLogRes;
import com.jd.appstore.gateway.manager.PadUpdateLogManager;
import com.jd.appstore.gateway.service.PadUpdateLogService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-7-5
 * Time: 下午5:24
 * To change this template use File | Settings | File Templates.
 */
public class PadUpdateLogServiceImpl implements PadUpdateLogService {
    private PadUpdateLogManager padUpdateLogManager;

    /**
     * 记录pad更新日志
     *
     * @param imeiNumber
     * @return
     */
    public PadUpdateLogRes recordPadUpdateLog(String imeiNumber, Long updateTime, Integer type) {
        PadUpdateLogRes padUpdateLogRes = new PadUpdateLogRes();
        try {
            if (imeiNumber != null && updateTime != null) {
                PadUpdateLog padUpdateLogTemp = padUpdateLogManager.getPadUpdateLog(imeiNumber);
                if (padUpdateLogTemp != null) {
                    PadUpdateLog padUpdateLog = new PadUpdateLog();
                    padUpdateLog.setImeiNumber(imeiNumber);
                    if (type != null) {
                        if (type.intValue() == 0) { // 同步应用
                            padUpdateLog.setUpdateTime(new Date(updateTime));
                        }
                        if (type.intValue() == 1) { // 上传日志
                            padUpdateLog.setUploadLogTime(new Date(updateTime));
                        }
                        if (type.intValue() == 2) { // 更新客户端版本
                            padUpdateLog.setUpdateVersionTime(new Date(updateTime));
                        }
                    }else{
                        padUpdateLog.setUpdateTime(new Date(updateTime));
                    }
                    padUpdateLogManager.updatePadUpdateLog(padUpdateLog);
                    padUpdateLogRes.setMess("更新成功");
                    padUpdateLogRes.setCode(1);
                    padUpdateLogRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
                } else {
                    padUpdateLogRes.setMess("不存在该Imei号");
                    padUpdateLogRes.setCode(0);
                    padUpdateLogRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
                }
            } else {
                padUpdateLogRes.setMess("参数imeiNumber或updateTime");
                padUpdateLogRes.setCode(0);
                padUpdateLogRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            }
        } catch (Exception e) {
            padUpdateLogRes.setCode(0);
            padUpdateLogRes.setMess("系统异常");
            padUpdateLogRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return padUpdateLogRes;
    }

    public void setPadUpdateLogManager(PadUpdateLogManager padUpdateLogManager) {
        this.padUpdateLogManager = padUpdateLogManager;
    }
}
