package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.OrderInfoObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-19
 * Time: 下午6:19
 * To change this template use File | Settings | File Templates.
 */
public class OrderListRes {
    private ResultObj resultObj ;
    List<OrderInfoObj> orderInfoObjs;

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

    public List<OrderInfoObj> getOrderInfoObjs() {
        return orderInfoObjs;
    }

    public void setOrderInfoObjs(List<OrderInfoObj> orderInfoObjs) {
        this.orderInfoObjs = orderInfoObjs;
    }
}
