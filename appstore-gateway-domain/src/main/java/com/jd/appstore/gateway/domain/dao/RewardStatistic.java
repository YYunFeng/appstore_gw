package com.jd.appstore.gateway.domain.dao;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class RewardStatistic {

    private Integer vaildMachine;
    private Integer huaShengCounts;
    private Integer mineCounts;


    public Integer getVaildMachine() {
        return vaildMachine;
    }

    public void setVaildMachine(Integer vaildMachine) {
        this.vaildMachine = vaildMachine;
    }

    public Integer getHuaShengCounts() {
        return huaShengCounts;
    }

    public void setHuaShengCounts(Integer huaShengCounts) {
        this.huaShengCounts = huaShengCounts;
    }

    public Integer getMineCounts() {
        return mineCounts;
    }

    public void setMineCounts(Integer mineCounts) {
        this.mineCounts = mineCounts;
    }
}
