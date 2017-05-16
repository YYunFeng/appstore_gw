package com.jd.appstore.gateway.domain.util;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;


import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created with IntelliJ IDEA.
 * User: gaoyang
 * Date: 13-2-4
 * Time: 上午10:32
 * To change this template use File | Settings | File Templates.
 */
public class HttpUtil {


    public static String doPost(String url, String xml) throws UnsupportedEncodingException {
        String response = null;
        HttpClient client = new HttpClient();
        PostMethod method = new PostMethod(url);
        method.addRequestHeader("MsgType", "FindStaffByMobileReqP2P");
        method.setRequestEntity(new StringRequestEntity(xml, "text/xml", "utf-8"));
        try {
            client.executeMethod(method);
            if (method.getStatusCode() == HttpStatus.SC_OK) {
                response = new String(method.getResponseBodyAsString().getBytes("GB2312"), "UTF-8");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            method.releaseConnection();
        }
        return response;
    }

    public static void main(String[] args) {
        String x = null;
        try {
            String xml = XMLUtil.order();
            System.out.println(xml);
            x = doPost("http://10.2.20.17:8080/TRANSCENTER/download/", XMLUtil.order());
//            x = doPost("http://10.2.15.71:8187/admin/portalService.portal", XMLUtil.write());
            System.out.println(x);
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
