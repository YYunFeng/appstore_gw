package com.jd.appstore.gateway.domain.obj;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-8
 * Time: 下午6:44
 * To change this template use File | Settings | File Templates.
 */
public class CommentSummaryInfoObj {

    private Integer veryLike;
    private Integer inGeneral;
    private Integer notLike;
    private Integer star;

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Integer getVeryLike() {
        return veryLike;
    }

    public void setVeryLike(Integer veryLike) {
        this.veryLike = veryLike;
    }

    public Integer getInGeneral() {
        return inGeneral;
    }

    public void setInGeneral(Integer inGeneral) {
        this.inGeneral = inGeneral;
    }

    public Integer getNotLike() {
        return notLike;
    }

    public void setNotLike(Integer notLike) {
        this.notLike = notLike;
    }
}
