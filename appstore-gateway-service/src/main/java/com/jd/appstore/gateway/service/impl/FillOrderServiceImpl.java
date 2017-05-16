package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.dao.AppDownloadUrl;
import com.jd.appstore.gateway.domain.dao.Apps;
import com.jd.appstore.gateway.domain.dao.FillOrder;
import com.jd.appstore.gateway.domain.dao.FillOrderLog;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.FillOrderRes;
import com.jd.appstore.gateway.domain.zhuowangobj.xmlbean.OrderRelationReq;
import com.jd.appstore.gateway.domain.zhuowangobj.xmlbean.OrderRelationRes;
import com.jd.appstore.gateway.manager.AppManager;
import com.jd.appstore.gateway.manager.FillOrderManager;
import com.jd.appstore.gateway.service.FillOrderService;
import com.jd.appstore.gateway.service.ZhuowangInterfaceService;
import com.jd.common.util.StringUtils;

/**
 * User: YUNFENG
 * Date: 13-11-20
 * Time: 下午2:53
 * To change this template use File | Settings | File Templates.
 */
public class FillOrderServiceImpl implements FillOrderService {
    private FillOrderManager fillOrderManager;
    private AppManager appManager;
    private ZhuowangInterfaceService zhuowangInterfaceService;

    /**
     * @param appId
     * @param padImei
     * @param staffMobile
     * @param staffId
     * @param channelId
     * @param areaProvinceId
     * @return
     */
    public FillOrderRes fillOrder(Integer appId, String padImei, String staffMobile, String staffId, String channelId, String areaProvinceId) {
        FillOrderRes fillOrderRes = new FillOrderRes();
        FillOrderLog fillOrderLog = new FillOrderLog();
        try {
            fillOrderLog.setPadImei(padImei);
            fillOrderLog.setSaler(staffId);
            Apps apps  = fillOrderManager.getApps(appId);
            FillOrder fillOrder = fillOrderManager.getFillOrder();
            if (fillOrder != null) {
                fillOrderLog.setFillOrderType(fillOrder.getType());
                fillOrderLog.setFillOrderPercentage(fillOrder.getPercentage());
                //判断是否卓望的数据
                if (apps.getZhuowangMark()!= null && apps.getZhuowangMark().intValue() == 1) {
                    //判断调用卓望接口的几个参数是否都存在
                    if (StringUtils.isNotBlank(staffId) && StringUtils.isNotBlank(staffMobile) && StringUtils.isNotBlank(channelId) && StringUtils.isNotBlank(areaProvinceId)) {
                        OrderRelationReq orderRelationReq = new OrderRelationReq();
                        String zhuowangAppcode = apps.getPackageName().substring(apps.getPackageName().lastIndexOf(".") + 1);
                        orderRelationReq.setServiceCode(zhuowangAppcode);
                        orderRelationReq.setStaffMobile(staffMobile);
                        orderRelationReq.setStaffId(staffId);
                        orderRelationReq.setChannelId(channelId);
                        orderRelationReq.setAreaProvinceID(areaProvinceId);
                        OrderRelationRes orderRelationRes = zhuowangInterfaceService.zhuowangAppDownload(orderRelationReq);
                        if (orderRelationRes.getRetCode().intValue() == 0) {
                            fillOrderRes.setDownloadUrl(orderRelationRes.getRetDesc());
                            fillOrderRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
                            fillOrderRes.setFillOrder(fillOrder);
                            fillOrderLog.setDownloadUrl(orderRelationRes.getRetDesc());
                            fillOrderLog.setStatus(1);
                            fillOrderLog.setMess("补订单成功");
                        }

                     /*   fillOrderRes.setAppVersionCode(231);
                        fillOrderRes.setPackageName("com.test");
                        fillOrderRes.setDownloadUrl("http://img.zhuowang.taotaojing.cn/apk//liantong/EEC31B0180D446F68FE272504144DF05.apk");
                        fillOrderRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
                        fillOrderRes.setFillOrder(fillOrder);
                        fillOrderLog.setDownloadUrl("http://img.zhuowang.taotaojing.cn/apk//liantong/EEC31B0180D446F68FE272504144DF05.apk");
                        fillOrderLog.setStatus(1);
                        fillOrderLog.setMess("补订单成功");*/
                    } else {
                        //参数不全,返回错误
                        fillOrderRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "staffId or staffMobile or channelId or areaProvinceId is null"));
                        fillOrderLog.setStatus(0);
                        fillOrderLog.setMess("staffId or staffMobile or channelId or areaProvinceId is null");
                    }
                } else {
                    fillOrderRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "该应用不是卓望应用，不需要补订单"));
                    fillOrderLog.setStatus(0);
                    fillOrderLog.setMess("该应用不是卓望应用，不需要补订单");
                }
            } else {
                fillOrderRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "未能获取补订单参数"));
                fillOrderLog.setStatus(0);
                fillOrderLog.setMess("未能获取补订单参数");
            }
        } catch (Exception e) {
            e.printStackTrace();
            fillOrderLog.setStatus(0);
            fillOrderLog.setMess("系统异常");
            fillOrderManager.createdFillOrderLog(fillOrderLog);
        }
        fillOrderManager.createdFillOrderLog(fillOrderLog);
        return fillOrderRes;
    }

    public void setFillOrderManager(FillOrderManager fillOrderManager) {
        this.fillOrderManager = fillOrderManager;
    }

    public void setAppManager(AppManager appManager) {
        this.appManager = appManager;
    }

    public void setZhuowangInterfaceService(ZhuowangInterfaceService zhuowangInterfaceService) {
        this.zhuowangInterfaceService = zhuowangInterfaceService;
    }
}
