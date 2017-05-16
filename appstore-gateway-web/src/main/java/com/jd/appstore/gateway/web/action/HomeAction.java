package com.jd.appstore.gateway.web.action;


import com.jd.appstore.gateway.domain.response.HomeRes;
import com.jd.appstore.gateway.service.HomeService;

/**
 * User: gaoyang
 * Date: 12-7-28
 * Time: 下午9:43
 * To change this template use File | Settings | File Templates.
 */
public class HomeAction {

    private Integer clientType;

    private HomeRes homeRes;

    private HomeService homeService;

    /**
     * 首页
     * @return
     */
    public String Info() {
        homeRes = homeService.findHomeInfo(clientType);
        return "info";
    }

    public void setHomeService(HomeService homeService) {
        this.homeService = homeService;
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public HomeRes getHomeRes() {
        return homeRes;
    }

    public void setHomeRes(HomeRes homeRes) {
        this.homeRes = homeRes;
    }


}
