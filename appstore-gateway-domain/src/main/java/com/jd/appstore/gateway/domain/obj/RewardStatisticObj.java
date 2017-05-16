package com.jd.appstore.gateway.domain.obj;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class RewardStatisticObj {
    private Integer niceCounts;
    private Integer saleCounts;
    private Integer arrCounts;
    private Double nicePrice;
    private Double salePrice;
    private Double reward;
    private Double vaildMachine;


    private String salerNo;
    private String salerName;
    private String salerType;
    private Integer appCounts;
    private Integer phoneCounts;
    private Integer arriveCounts;

    private Integer actCountsCompute;
    private Integer actCounts;


    public String getSalerType() {
        if (Integer.valueOf(this.salerType) == 0) {
            return "督导";
        } else if (Integer.valueOf(this.salerType) == 1) {
            return "店长";
        } else if (Integer.valueOf(this.salerType) == 2) {
            return "店员";
        }
        return null;
    }


    public Integer getActCountsCompute() {
        return actCountsCompute;
    }

    public void setActCountsCompute(Integer actCountsCompute) {
        this.actCountsCompute = actCountsCompute;
    }

    public Integer getActCounts() {
        return actCounts;
    }

    public void setActCounts(Integer actCounts) {
        this.actCounts = actCounts;
    }

    public void setSalerType(String salerType) {
        this.salerType = salerType;
    }

    public String getSalerNo() {
        return salerNo;
    }

    public void setSalerNo(String salerNo) {
        this.salerNo = salerNo;
    }

    public String getSalerName() {
        return salerName;
    }

    public void setSalerName(String salerName) {
        this.salerName = salerName;
    }

    public Integer getAppCounts() {
        return appCounts;
    }

    public void setAppCounts(Integer appCounts) {
        this.appCounts = appCounts;
    }

    public Integer getPhoneCounts() {
        return phoneCounts;
    }

    public void setPhoneCounts(Integer phoneCounts) {
        this.phoneCounts = phoneCounts;
    }

    public Integer getArriveCounts() {
        return arriveCounts;
    }

    public void setArriveCounts(Integer arriveCounts) {
        this.arriveCounts = arriveCounts;
    }

    public Integer getNiceCounts() {
        return niceCounts;
    }

    public void setNiceCounts(Integer niceCounts) {
        this.niceCounts = niceCounts;
    }

    public Integer getSaleCounts() {
        return saleCounts;
    }

    public void setSaleCounts(Integer saleCounts) {
        this.saleCounts = saleCounts;
    }

    public Double getNicePrice() {
        return nicePrice;
    }

    public void setNicePrice(Double nicePrice) {
        this.nicePrice = nicePrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getReward() {
        return reward;
    }

    public void setReward(Double reward) {
        this.reward = reward;
    }

    public Double getVaildMachine() {
        return vaildMachine;
    }

    public void setVaildMachine(Double vaildMachine) {
        this.vaildMachine = vaildMachine;
    }

    public Integer getArrCounts() {
        return arrCounts;
    }

    public void setArrCounts(Integer arrCounts) {
        this.arrCounts = arrCounts;
    }


}
