package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.NoticeInfoObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-20
 * Time: 下午2:56
 * To change this template use File | Settings | File Templates.
 */
public class NoticeInfoRes {
    private ResultObj resultObj;
    private NoticeInfoObj noticeInfoObj;

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

    public NoticeInfoObj getNoticeInfoObj() {
        return noticeInfoObj;
    }

    public void setNoticeInfoObj(NoticeInfoObj noticeInfoObj) {
        this.noticeInfoObj = noticeInfoObj;
    }
}
