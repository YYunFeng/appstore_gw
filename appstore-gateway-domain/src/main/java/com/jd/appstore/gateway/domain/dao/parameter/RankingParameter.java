package com.jd.appstore.gateway.domain.dao.parameter;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-12
 * Time: 下午5:02
 * To change this template use File | Settings | File Templates.
 */
public class RankingParameter {
    private Integer rankingStyle;
    private Integer rankingType;
    private Integer offset;
    private Integer limit;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getRankingStyle() {
        return rankingStyle;
    }

    public void setRankingStyle(Integer rankingStyle) {
        this.rankingStyle = rankingStyle;
    }

    public Integer getRankingType() {
        return rankingType;
    }

    public void setRankingType(Integer rankingType) {
        this.rankingType = rankingType;
    }
}
