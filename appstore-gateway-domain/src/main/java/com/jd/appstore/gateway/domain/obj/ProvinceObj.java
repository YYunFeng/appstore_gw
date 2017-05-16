package com.jd.appstore.gateway.domain.obj;

import com.jd.appstore.gateway.domain.dao.Saler;

import java.util.List;

/**
 * YYF on 2015/4/3.
 */
public class ProvinceObj {
    private String cname;
    private Integer cid;
    // 分销促销员list
    private List<Saler> leaderList;
    // 店长促销员List
    private List<Saler> shopownerList;


    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public List<Saler> getLeaderList() {
        return leaderList;
    }

    public void setLeaderList(List<Saler> leaderList) {
        this.leaderList = leaderList;
    }

    public List<Saler> getShopownerList() {
        return shopownerList;
    }

    public void setShopownerList(List<Saler> shopownerList) {
        this.shopownerList = shopownerList;
    }
}
