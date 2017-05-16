package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.dao.Activation;
import com.jd.appstore.gateway.domain.dao.ActivetionLog;
import com.jd.appstore.gateway.domain.dao.PhoneImeis;
import com.jd.appstore.gateway.domain.obj.ActivationObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.ActivationRes;
import com.jd.appstore.gateway.manager.ActivationManager;
import com.jd.appstore.gateway.service.ActivationService;
import com.jd.common.web.result.Result;
import org.apache.commons.lang.StringUtils;

import java.util.List;

/**
 * Created by YYF on 2014/9/29.
 */
public class ActivationServiceImpl implements ActivationService {
    private ActivationManager activationManager;

    public ActivationRes createActivation(ActivationObj activationObj) {
        ActivationRes activationRes = new ActivationRes();
        try {
            if (StringUtils.isNotBlank(activationObj.getAppid())) {
                Integer counts = activationManager.getAppByAppid(activationObj.getAppid());
                if (counts > 0) {
                    if (activationObj.getPhoneImeiObjs() != null && activationObj.getPhoneImeiObjs().size() > 0) {
                        List<PhoneImeis> list = activationObj.getPhoneImeiObjs();
                        for (int i = 0; i < list.size(); i++) {
                            Activation activation = new Activation();
                            activation.setAppid(activationObj.getAppid());
                            activation.setPhoneImei(list.get(i).getPhoneImei());
                            activation.setActivationTime(list.get(i).getActivationTime());
                            try {
                                activationManager.createActivation(activation);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        activationRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS, "成功"));
                    } else {
                        activationRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "提交的数据为空"));
                    }
                } else {
                    activationRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "该应用不存在"));
                }
            } else {
                activationRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "参数不全"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return activationRes;
    }

    public void createActive(Activation activation) {
        activationManager.createActivation(activation);
    }

    public Result appName(String appid) {
        Result result = new Result();
        try {
            result.addDefaultModel("appName", activationManager.appName(appid));
            result.addDefaultModel("appId", appid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public Integer createActiveLog(ActivetionLog activetionLog) {
        return activationManager.createActiveLog(activetionLog);
    }

    public ActivetionLog getActiveLog(Integer id) {
        return activationManager.getActiveLog(id);
    }

    public void updateActiveLog(ActivetionLog activetionLog) {
        activationManager.updateActiveLog(activetionLog);
    }


    public void setActivationManager(ActivationManager activationManager) {
        this.activationManager = activationManager;
    }
}
