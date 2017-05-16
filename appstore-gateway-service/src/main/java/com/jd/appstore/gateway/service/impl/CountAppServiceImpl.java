package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.dao.CountApp;
import com.jd.appstore.gateway.domain.obj.ReportCount;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.CountAppRes;
import com.jd.appstore.gateway.domain.response.LogStatusRes;
import com.jd.appstore.gateway.manager.CountAppManager;
import com.jd.appstore.gateway.service.CountAppService;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by YUNFENG on 14-2-11.
 */
public class CountAppServiceImpl implements CountAppService {
    private CountAppManager countAppManager;
    private Logger logger = Logger.getLogger(this.getClass());

    public CountAppRes createCountApp(String phoneImei, String appid) {
        CountAppRes countAppRes = new CountAppRes();
        try {
            if (StringUtils.isNotBlank(phoneImei) && StringUtils.isNotBlank(appid)) {
                CountApp countApp = new CountApp();
                countApp.setPhoneImei(phoneImei);
                countApp.setAppid(appid);
                try {
//                    countAppManager.createCountApp(countApp);
                    countAppRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS, "成功"));
                } catch (Exception e) {
                    countAppRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "插入数据异常，请检查是否重复提交"));
                }
            } else {
                countAppRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "参数错误，phoneImei和appid不能为空"));
            }
        } catch (Exception e) {
            countAppRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "系统异常，请重试"));
            e.printStackTrace();
        }
        return countAppRes;
    }

    public LogStatusRes reportCount(ReportCount reportCount) {
        LogStatusRes logStatusRes = new LogStatusRes();
        try {
            if (reportCount != null && reportCount.getPckList() != null) {
                List<String> list = countAppManager.getCountAppid(reportCount.getPckList());
                if (list != null && list.size() > 0) {
                    for (int i = 0; i < list.size(); i++) {
                        logger.info("AppId:" + list.get(i));
                        if (StringUtils.isNotBlank(list.get(i))) {
                            CountApp countApp = new CountApp();
                            countApp.setAppid(list.get(i));
                            countApp.setPhoneImei(reportCount.getPhoneImei());
                            try {
                                countAppManager.createCountApp(countApp);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
                logStatusRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
            }else{
                logStatusRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            }
        } catch (Exception e) {
            e.printStackTrace();
            logStatusRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
        }
        return logStatusRes;
    }

    public void setCountAppManager(CountAppManager countAppManager) {
        this.countAppManager = countAppManager;
    }
}
