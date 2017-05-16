package com.jd.appstore.gateway.domain.util;

import com.jd.appstore.gateway.domain.zhuowangobj.xmlbean.OrderRelationReq;
import com.jd.appstore.gateway.domain.zhuowangobj.xmlbean.ZhuowangUserLoginReq;
import com.thoughtworks.xstream.XStream;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

/**
 * Created with IntelliJ IDEA.
 * User: gaoyang
 * Date: 13-2-4
 * Time: 上午9:37
 * To change this template use File | Settings | File Templates.
 */
public class XMLUtil {

    public static void main(String[] args) throws Exception {
        read();
//        DESUtil des = new DESUtil("1234567");
//        XStream xstream = new XStream();
//        xstream.alias("XMLObject", ZhuowangUserLoginReq.class);
//        ZhuowangUserLoginReq userLoginReq = new ZhuowangUserLoginReq();
//        userLoginReq.setMobile("13501193863");
//        userLoginReq.setPassword(des.encryptStr("gao0823"));
//        String xmlHeader = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
//        String xml = xmlHeader + xstream.toXML(userLoginReq);
//        System.out.println(xml);
    }

    static String write() {
        XStream xstream = new XStream();
        xstream.alias("XMLObject", ZhuowangUserLoginReq.class);
        ZhuowangUserLoginReq zhuowangUserLoginReq = new ZhuowangUserLoginReq();
        zhuowangUserLoginReq.setMobile("13501193863");

        String desKey = "88888888";
        String basepassword = "";
        try {
            basepassword = DESUtils.getBASE64(DESUtils.encrypt("abc123", desKey.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (InvalidKeyException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (BadPaddingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        zhuowangUserLoginReq.setPassword(basepassword);
        String xmlHeader = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
        String xml = xmlHeader + xstream.toXML(zhuowangUserLoginReq);
        return xml;
    }

    static void read() {
//        XStream xstream = new XStream();
//        xstream.alias("XMLObject", ZhuowangUserLoginRes.class);
//        ZhuowangUserLoginRes zhuowangUserLoginRes = (ZhuowangUserLoginRes) xstream.fromXML(new File("d:/test.xml"));
//        if (zhuowangUserLoginRes.getResult()) {
//            System.out.println(zhuowangUserLoginRes.getDepartmentId());
//        }
//        System.out.println(zhuowangUserLoginRes);
    }

    static String order() {
        String tid = String.valueOf(System.currentTimeMillis()) ;
        XStream xstream = new XStream();
        xstream.alias("XMLObject", OrderRelationReq.class);
        OrderRelationReq orderRelationReq = new OrderRelationReq();
        orderRelationReq.setStaffMobile("13501193863");
        orderRelationReq.setStaffId("CEM1212983");
        orderRelationReq.setCommendMobile("13501193863");
        orderRelationReq.setReceiveMobile("13501193863");
        orderRelationReq.setPlatformId("12");
        orderRelationReq.setServiceClass("35");
        orderRelationReq.setServiceCodeType("0");
        orderRelationReq.setServiceCode("300000863435");
        orderRelationReq.setTransactionId(tid);
        orderRelationReq.setInterfaceFunctionCode("order");
        orderRelationReq.setChannelId("10001");
        orderRelationReq.setAreaProvinceID("11");

        String authCode = orderRelationReq.getStaffId() + orderRelationReq.getCommendMobile() +
                orderRelationReq.getReceiveMobile() + orderRelationReq.getPlatformId()
                + orderRelationReq.getServiceClass() + orderRelationReq.getServiceCode()
                + orderRelationReq.getTransactionId() + "cemwxlh";
        System.out.println(authCode);
        orderRelationReq.setAuthCode(MD5Util.string2MD5(authCode));
        String xmlHeader = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
        return xmlHeader + xstream.toXML(orderRelationReq);
    }

//    Md5加密，成员ID+推荐人手机号+被推荐人手机+平台ID+业务一级分类+业务ID+流水号+key，通过共同协商的key进行md5加密；
}
