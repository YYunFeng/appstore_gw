package com.jd.appstore.gateway.domain.zhuowangobj.xmlbean;

/**
 * Created with IntelliJ IDEA.
 * User: gaoyang
 * Date: 13-2-4
 * Time: 上午9:43
 * To change this template use File | Settings | File Templates.
 */
public class ZhuowangUserLoginReq {
    private String mobile;
    private String password;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
