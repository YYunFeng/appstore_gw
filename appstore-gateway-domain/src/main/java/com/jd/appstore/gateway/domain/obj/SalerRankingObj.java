package com.jd.appstore.gateway.domain.obj;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-7-8
 * Time: 下午12:04
 * To change this template use File | Settings | File Templates.
 */
public class SalerRankingObj {
    private String saler; //促销员
    private Integer totalRanking; //促销员总排名
    private Integer totalInstallAppsTimes; // 促销员总的安装总量
    private Integer currentMonthRanking;  // 促销员当月排名
    private Integer currentInstallAppsTimes; // 促销员当月安装量

    public String getSaler() {
        return saler;
    }

    public void setSaler(String saler) {
        this.saler = saler;
    }

    public Integer getTotalRanking() {
        return totalRanking;
    }

    public void setTotalRanking(Integer totalRanking) {
        this.totalRanking = totalRanking;
    }

    public Integer getTotalInstallAppsTimes() {
        return totalInstallAppsTimes;
    }

    public void setTotalInstallAppsTimes(Integer totalInstallAppsTimes) {
        this.totalInstallAppsTimes = totalInstallAppsTimes;
    }

    public Integer getCurrentMonthRanking() {
        return currentMonthRanking;
    }

    public void setCurrentMonthRanking(Integer currentMonthRanking) {
        this.currentMonthRanking = currentMonthRanking;
    }

    public Integer getCurrentInstallAppsTimes() {
        return currentInstallAppsTimes;
    }

    public void setCurrentInstallAppsTimes(Integer currentInstallAppsTimes) {
        this.currentInstallAppsTimes = currentInstallAppsTimes;
    }
}
