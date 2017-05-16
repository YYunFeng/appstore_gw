package com.jd.appstore.gateway.web.action;

import com.google.gson.Gson;
import com.jd.appstore.gateway.domain.dao.parameter.AppSaleLogParameter;
import com.jd.appstore.gateway.domain.obj.ActivationObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.LogStatusRes;
import com.jd.appstore.gateway.service.MarketingLogServerice;
import com.jd.common.struts.action.BaseAction;
import org.apache.log4j.Logger;

import java.io.BufferedReader;

/**
 * Created by YYF on 2014/10/15.
 */
public class PcMarketingLogAction extends BaseAction {

    private MarketingLogServerice marketingLogServerice;
    private LogStatusRes logStatusRes;

    Logger logger = Logger.getLogger(this.getClass());

    public String pcMarketingLog() {
        logStatusRes = new LogStatusRes();
        try {
            //获取HTTP请求的输入流
            //已HTTP请求输入流建立一个BufferedReader对象
            BufferedReader br = request.getReader();
            String buffer = null;
            StringBuffer buff = new StringBuffer();
            while ((buffer = br.readLine()) != null) {
                buff.append(buffer + "\n");
            }
            br.close();
            Gson gson = new Gson();
            AppSaleLogParameter appSaleLogParameter = gson.fromJson(buff.toString(), AppSaleLogParameter.class);
            marketingLogServerice.createMarketingLog(appSaleLogParameter);
            logger.info("日志上报成功，日志：" + appSaleLogParameter.toString());
            logStatusRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
        } catch (Exception e) {
            logStatusRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            logger.error("error" + e.getMessage());
            return "status";
        }
        return "status";
    }

    public void setMarketingLogServerice(MarketingLogServerice marketingLogServerice) {
        this.marketingLogServerice = marketingLogServerice;
    }

    public LogStatusRes getLogStatusRes() {
        return logStatusRes;
    }

    public void setLogStatusRes(LogStatusRes logStatusRes) {
        this.logStatusRes = logStatusRes;
    }
}
