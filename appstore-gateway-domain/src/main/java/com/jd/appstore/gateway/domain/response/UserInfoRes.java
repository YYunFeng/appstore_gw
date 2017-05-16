package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.ResultObj;

/**
 * Created with IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-10-31
 * Time: 下午12:53
 * To change this template use File | Settings | File Templates.
 */
public class UserInfoRes {

    private ResultObj resultObj;
    private String pin;
    private String imgUrl;// 头像
    private String smallImgUrl; //小头像
    private String location;// 所在地

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getSmallImgUrl() {
        return smallImgUrl;
    }

    public void setSmallImgUrl(String smallImgUrl) {
        this.smallImgUrl = smallImgUrl;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
