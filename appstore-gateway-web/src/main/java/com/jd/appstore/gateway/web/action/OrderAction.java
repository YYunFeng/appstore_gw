package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.obj.AppBaseInfoObj;
import com.jd.appstore.gateway.domain.obj.OrderInfoObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.OrderListRes;
import com.jd.appstore.gateway.domain.util.GatewayUrl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-19
 * Time: 下午5:37
 * To change this template use File | Settings | File Templates.
 */
public class OrderAction {

    private GatewayUrl gatewayUrl;
    OrderListRes orderListRes;

    public String List() {
        orderListRes = new OrderListRes();
        orderListRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
        List<OrderInfoObj> orderInfoObjList = new ArrayList<OrderInfoObj>();

        OrderInfoObj orderInfoObj = new OrderInfoObj();
        List<AppBaseInfoObj> appBaseInfoObjList = new ArrayList<AppBaseInfoObj>();
        AppBaseInfoObj appBaseInfoObj = new AppBaseInfoObj();
        appBaseInfoObj.setAppId(1043);
        appBaseInfoObj.setName("ZAKER（扎客)");
        appBaseInfoObj.setLogo(gatewayUrl.getLogoUrl() + "0B4413967E75496EAB05BA2512C40824.jpg");
        appBaseInfoObjList.add(appBaseInfoObj);
        appBaseInfoObj = new AppBaseInfoObj();
        appBaseInfoObj.setAppId(1046);
        appBaseInfoObj.setName("豆瓣电影");
        appBaseInfoObj.setLogo(gatewayUrl.getLogoUrl() + "6951D740458C48678473A3B877FCD48D.jpg");
        appBaseInfoObjList.add(appBaseInfoObj);
        appBaseInfoObj = new AppBaseInfoObj();
        appBaseInfoObj.setAppId(1047);
        appBaseInfoObj.setName("鳄鱼爱洗澡");
        appBaseInfoObj.setLogo(gatewayUrl.getLogoUrl() + "9AA4F22635BC4B97B6231E9D728299ED.jpg");
        appBaseInfoObjList.add(appBaseInfoObj);
        orderInfoObj.setAppBaseInfoObjs(appBaseInfoObjList);
        orderInfoObj.setOrderId("2775666094");
        orderInfoObj.setOrderAmount(new BigDecimal("10.0"));
        orderInfoObj.setOrderStatus(0);
        orderInfoObj.setOrderTime(new Date());
        orderInfoObjList.add(orderInfoObj);

        orderInfoObj = new OrderInfoObj();
        appBaseInfoObjList = new ArrayList<AppBaseInfoObj>();
        appBaseInfoObj = new AppBaseInfoObj();
        appBaseInfoObj.setAppId(1043);
        appBaseInfoObj.setName("ZAKER（扎客)");
        appBaseInfoObj.setLogo(gatewayUrl.getLogoUrl() + "0B4413967E75496EAB05BA2512C40824.jpg");
        appBaseInfoObjList.add(appBaseInfoObj);
        appBaseInfoObj = new AppBaseInfoObj();
        appBaseInfoObj.setAppId(1046);
        appBaseInfoObj.setName("豆瓣电影");
        appBaseInfoObj.setLogo(gatewayUrl.getLogoUrl() + "6951D740458C48678473A3B877FCD48D.jpg");
        appBaseInfoObjList.add(appBaseInfoObj);
        appBaseInfoObj = new AppBaseInfoObj();
        appBaseInfoObj.setAppId(1047);
        appBaseInfoObj.setName("鳄鱼爱洗澡");
        appBaseInfoObj.setLogo(gatewayUrl.getLogoUrl() + "9AA4F22635BC4B97B6231E9D728299ED.jpg");
        appBaseInfoObjList.add(appBaseInfoObj);
        orderInfoObj.setAppBaseInfoObjs(appBaseInfoObjList);
        orderInfoObj.setOrderId("2775666053");
        orderInfoObj.setOrderAmount(new BigDecimal("15.0"));
        orderInfoObj.setOrderStatus(1);
        orderInfoObj.setOrderTime(new Date());
        orderInfoObjList.add(orderInfoObj);

        orderInfoObj = new OrderInfoObj();
        appBaseInfoObjList = new ArrayList<AppBaseInfoObj>();
        appBaseInfoObj = new AppBaseInfoObj();
        appBaseInfoObj.setAppId(1043);
        appBaseInfoObj.setName("ZAKER（扎客)");
        appBaseInfoObj.setLogo(gatewayUrl.getLogoUrl() + "0B4413967E75496EAB05BA2512C40824.jpg");
        appBaseInfoObjList.add(appBaseInfoObj);
        appBaseInfoObj = new AppBaseInfoObj();
        appBaseInfoObj.setAppId(1046);
        appBaseInfoObj.setName("豆瓣电影");
        appBaseInfoObj.setLogo(gatewayUrl.getLogoUrl() + "6951D740458C48678473A3B877FCD48D.jpg");
        appBaseInfoObjList.add(appBaseInfoObj);
        appBaseInfoObj = new AppBaseInfoObj();
        appBaseInfoObj.setAppId(1047);
        appBaseInfoObj.setName("鳄鱼爱洗澡");
        appBaseInfoObj.setLogo(gatewayUrl.getLogoUrl() + "9AA4F22635BC4B97B6231E9D728299ED.jpg");
        appBaseInfoObjList.add(appBaseInfoObj);
        orderInfoObj.setAppBaseInfoObjs(appBaseInfoObjList);
        orderInfoObj.setOrderId("2775653245");
        orderInfoObj.setOrderAmount(new BigDecimal("5.0"));
        orderInfoObj.setOrderStatus(2);
        orderInfoObj.setOrderTime(new Date());
        orderInfoObjList.add(orderInfoObj);

        orderInfoObj = new OrderInfoObj();
        appBaseInfoObjList = new ArrayList<AppBaseInfoObj>();
        appBaseInfoObj = new AppBaseInfoObj();
        appBaseInfoObj.setAppId(1043);
        appBaseInfoObj.setName("ZAKER（扎客)");
        appBaseInfoObj.setLogo(gatewayUrl.getLogoUrl() + "0B4413967E75496EAB05BA2512C40824.jpg");
        appBaseInfoObjList.add(appBaseInfoObj);
        appBaseInfoObj = new AppBaseInfoObj();
        appBaseInfoObj.setAppId(1046);
        appBaseInfoObj.setName("豆瓣电影");
        appBaseInfoObj.setLogo(gatewayUrl.getLogoUrl() + "6951D740458C48678473A3B877FCD48D.jpg");
        appBaseInfoObjList.add(appBaseInfoObj);
        appBaseInfoObj = new AppBaseInfoObj();
        appBaseInfoObj.setAppId(1047);
        appBaseInfoObj.setName("鳄鱼爱洗澡");
        appBaseInfoObj.setLogo(gatewayUrl.getLogoUrl() + "9AA4F22635BC4B97B6231E9D728299ED.jpg");
        appBaseInfoObjList.add(appBaseInfoObj);
        orderInfoObj.setAppBaseInfoObjs(appBaseInfoObjList);
        orderInfoObj.setOrderId("2775666095");
        orderInfoObj.setOrderAmount(new BigDecimal("18.0"));
        orderInfoObj.setOrderStatus(0);
        orderInfoObj.setOrderTime(new Date());
        orderInfoObjList.add(orderInfoObj);

        orderListRes.setOrderInfoObjs(orderInfoObjList);
        return "list";
    }

    public void setGatewayUrl(GatewayUrl gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }


    public OrderListRes getOrderListRes() {
        return orderListRes;
    }

    public void setOrderListRes(OrderListRes orderListRes) {
        this.orderListRes = orderListRes;
    }
}
