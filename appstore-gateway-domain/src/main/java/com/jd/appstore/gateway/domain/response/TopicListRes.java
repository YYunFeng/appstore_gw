package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.AppBaseInfoObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.obj.TopicInfoObj;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-20
 * Time: 下午2:54
 * To change this template use File | Settings | File Templates.
 */
public class TopicListRes {

    private ResultObj resultObj;
    private Integer ttn;
    private Integer tp;
    private Integer tn;
    private List<TopicInfoObj> topicInfoObjs;

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

    public Integer getTtn() {
        return ttn;
    }

    public void setTtn(Integer ttn) {
        this.ttn = ttn;
    }

    public Integer getTp() {
        return tp;
    }

    public void setTp(Integer tp) {
        this.tp = tp;
    }

    public Integer getTn() {
        return tn;
    }

    public void setTn(Integer tn) {
        this.tn = tn;
    }

    public List<TopicInfoObj> getTopicInfoObjs() {
        return topicInfoObjs;
    }

    public void setTopicInfoObjs(List<TopicInfoObj> topicInfoObjs) {
        this.topicInfoObjs = topicInfoObjs;
    }
}
