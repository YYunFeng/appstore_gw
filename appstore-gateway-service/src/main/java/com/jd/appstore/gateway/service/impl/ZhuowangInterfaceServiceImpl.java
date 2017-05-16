package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.util.DESUtils;
import com.jd.appstore.gateway.domain.util.HttpUtil;
import com.jd.appstore.gateway.domain.util.MD5Util;
import com.jd.appstore.gateway.domain.zhuowangobj.xmlbean.OrderRelationReq;
import com.jd.appstore.gateway.domain.zhuowangobj.xmlbean.OrderRelationRes;
import com.jd.appstore.gateway.domain.zhuowangobj.xmlbean.ZhuowangUserLoginReq;
import com.jd.appstore.gateway.domain.zhuowangobj.xmlbean.ZhuowangUserLoginRes;
import com.jd.appstore.gateway.service.ZhuowangInterfaceService;
import com.thoughtworks.xstream.XStream;
import org.apache.log4j.Logger;

import java.util.Random;


/**
 * User: gaoyang
 * Date: 13-3-12
 * Time: 下午11:09
 * To change this template use File | Settings | File Templates.
 */
public class ZhuowangInterfaceServiceImpl implements ZhuowangInterfaceService {
    private Logger logger = Logger.getLogger(this.getClass());
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
        String basepassword = "";
        XStream xstream = null;
        String xmlHeader = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
        if (zhuowangUserLoginReq != null) {
            xstream = new XStream();
            xstream.alias("XMLObject", ZhuowangUserLoginReq.class);
            try {
                basepassword = DESUtils.getBASE64(DESUtils.encrypt(zhuowangUserLoginReq.getPassword(), loginServiceDesKey.getBytes()));
                zhuowangUserLoginReq.setPassword(basepassword);
                String responseXml = HttpUtil.doPost(loginServiceUrl, xmlHeader + xstream.toXML(zhuowangUserLoginReq));
                logger.info("zhuowangLoginResponseXml:" + responseXml + ",mobile:" + zhuowangUserLoginReq.getMobile() + ",password:" + zhuowangUserLoginReq.getPassword() + ",despassword:" + basepassword);
                if (responseXml.indexOf("<params>") > -1 && responseXml.indexOf("</params>") > -1)
                    responseXml = responseXml.substring(0, responseXml.indexOf("<params>")) + responseXml.substring(responseXml.lastIndexOf("</params>") + 9);
                logger.info("zhuowangLoginResponseXml:" + responseXml + ",mobile:" + zhuowangUserLoginReq.getMobile() + ",password:" + zhuowangUserLoginReq.getPassword() + ",despassword:" + basepassword);
                xstream.alias("XMLObject", ZhuowangUserLoginRes.class);

                zhuowangUserLoginRes = (ZhuowangUserLoginRes) xstream.fromXML(responseXml);
                if (zhuowangUserLoginRes != null && !zhuowangUserLoginRes.getResult()) {
                    zhuowangUserLoginRes.setDescription("用户名或者密码错误");
                }
            } catch (Exception e) {
                logger.error("zhuowangLoginError:mobile:" + zhuowangUserLoginReq.getMobile() + ",despassword:" + basepassword + ",error:" + e.getMessage());
                zhuowangUserLoginRes.setResult(false);
                zhuowangUserLoginRes.setDescription("系统错误,请重试");
                e.printStackTrace();
            }
        }
        return zhuowangUserLoginRes;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public OrderRelationRes zhuowangAppDownload(OrderRelationReq orderRelationReq) {
        OrderRelationRes orderRelationRes = null;
        String authCode = "";
        XStream xstream = null;
        String xmlHeader = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
        if (orderRelationReq != null) {
            Random random = new Random(1023);
            String tid = String.valueOf(System.currentTimeMillis() + random.nextInt());
            xstream = new XStream();
            xstream.alias("XMLObject", OrderRelationReq.class);
            try {
//            orderRelationReq.setStaffMobile("13501193863");
//            orderRelationReq.setStaffId("CEM1212983");
                orderRelationReq.setCommendMobile(orderRelationReq.getStaffMobile());
                orderRelationReq.setReceiveMobile(orderRelationReq.getStaffMobile());
                orderRelationReq.setPlatformId("12");
                orderRelationReq.setServiceClass("35");
                orderRelationReq.setServiceCodeType("0");
//            orderRelationReq.setServiceCode("300000863435");
                orderRelationReq.setTransactionId(tid);
                orderRelationReq.setInterfaceFunctionCode("order");
//                orderRelationReq.setChannelId("10001");
//                orderRelationReq.setAreaProvinceID("11");
                authCode = orderRelationReq.getStaffId() + orderRelationReq.getCommendMobile() +
                        orderRelationReq.getReceiveMobile() + orderRelationReq.getPlatformId()
                        + orderRelationReq.getServiceClass() + orderRelationReq.getServiceCode()
                        + orderRelationReq.getTransactionId() + orderServiceAuthCodeKey;
                orderRelationReq.setAuthCode(MD5Util.string2MD5(authCode));
                String responseXml = HttpUtil.doPost(orderServiceUrl, xmlHeader + xstream.toXML(orderRelationReq));
                logger.info("zhuowangOrderResponseXml:" + responseXml);
                xstream.alias("XMLObject", OrderRelationRes.class);
                orderRelationRes = (OrderRelationRes) xstream.fromXML(responseXml);
                return orderRelationRes;
            } catch (Exception e) {
                logger.error("zhuowangOrderError:" + e.getMessage());
            }
        }
        return null;  //To change body of implemented methods use File | Settings | File Templates.
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
