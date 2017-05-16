package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.zhuowangobj.xmlbean.OrderRelationReq;
import com.jd.appstore.gateway.domain.zhuowangobj.xmlbean.OrderRelationRes;
import com.jd.appstore.gateway.domain.zhuowangobj.xmlbean.ZhuowangUserLoginReq;
import com.jd.appstore.gateway.domain.zhuowangobj.xmlbean.ZhuowangUserLoginRes;
import com.jd.appstore.gateway.service.ZhuowangInterfaceService;

/**
 * User: YUNFENG
 * Date: 13-11-26
 * Time: 上午9:47
 * To change this template use File | Settings | File Templates.
 */
public class ZhuowangInterfaceDateServiceImpl implements ZhuowangInterfaceService {

    /**
     * 卓望登陆接口url
     */
    private String loginServiceUrl;
    /**
     * 卓望订购接口url(获取下载地址接口)
     */
    private String orderServiceUrl;
    /**
     * 登陆接口des加密key
     */
    private String loginServiceDesKey;
    /**
     * 订购接口autocode的key
     */
    private String orderServiceAuthCodeKey;

    public ZhuowangUserLoginRes zhuowangLogin(ZhuowangUserLoginReq zhuowangUserLoginReq) {
        ZhuowangUserLoginRes zhuowangUserLoginRes = new ZhuowangUserLoginRes();
        if (zhuowangUserLoginReq.getMobile().equals("13811030063") && zhuowangUserLoginReq.getPassword().equals("t123456")) {
            zhuowangUserLoginRes.setAreaCityId("");
            zhuowangUserLoginRes.setAreaProvinceId("11");
            zhuowangUserLoginRes.setChannelId("10071");
            zhuowangUserLoginRes.setCreateDate("2010-12-06");
            zhuowangUserLoginRes.setCreateUser("CEM1010510");
            zhuowangUserLoginRes.setDepartmentId("CEM7100002");
            zhuowangUserLoginRes.setDescription("OK");
            zhuowangUserLoginRes.setEmail("1@1.com");
            zhuowangUserLoginRes.setLastUpdateDate("2013-07-30");
            zhuowangUserLoginRes.setLoginName("suntao");
            zhuowangUserLoginRes.setMobile("13811030063");
            zhuowangUserLoginRes.setPassword("XAbF7UaMEX1wGz64vCKn0Q");
            zhuowangUserLoginRes.setPasswordExpireDate("2113-07-06");
            zhuowangUserLoginRes.setRealName("test");
            zhuowangUserLoginRes.setResult(true);
            zhuowangUserLoginRes.setSex("MALE");
            zhuowangUserLoginRes.setStaffId("CEM1178135");
            zhuowangUserLoginRes.setStatus("NORMAL");
        } else {
            zhuowangUserLoginRes.setDescription("用户名或者密码错误");
            zhuowangUserLoginRes.setResult(false);
        }
        return zhuowangUserLoginRes;
    }

    public OrderRelationRes zhuowangAppDownload(OrderRelationReq orderRelationReq) {
        OrderRelationRes orderRelationRes = new OrderRelationRes();
        orderRelationRes.setRetCode(0);
        orderRelationRes.setRetDesc("http://img.zhuowang.taotaojing.cn/apk//liantong/EEC31B0180D446F68FE272504144DF05.apk");
        return orderRelationRes;
    }

    public String getLoginServiceUrl() {
        return loginServiceUrl;
    }

    public void setLoginServiceUrl(String loginServiceUrl) {
        this.loginServiceUrl = loginServiceUrl;
    }

    public String getOrderServiceUrl() {
        return orderServiceUrl;
    }

    public void setOrderServiceUrl(String orderServiceUrl) {
        this.orderServiceUrl = orderServiceUrl;
    }

    public String getLoginServiceDesKey() {
        return loginServiceDesKey;
    }

    public void setLoginServiceDesKey(String loginServiceDesKey) {
        this.loginServiceDesKey = loginServiceDesKey;
    }

    public String getOrderServiceAuthCodeKey() {
        return orderServiceAuthCodeKey;
    }

    public void setOrderServiceAuthCodeKey(String orderServiceAuthCodeKey) {
        this.orderServiceAuthCodeKey = orderServiceAuthCodeKey;
    }
}
