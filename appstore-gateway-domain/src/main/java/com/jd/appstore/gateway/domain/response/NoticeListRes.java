package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.NoticeInfoObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-20
 * Time: 下午2:56
 * To change this template use File | Settings | File Templates.
 */
public class NoticeListRes {
    private ResultObj resultObj;
    private List<NoticeInfoObj> noticeInfoObjs ;

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

    public List<NoticeInfoObj> getNoticeInfoObjs() {
        return noticeInfoObjs;
    }

    public void setNoticeInfoObjs(List<NoticeInfoObj> noticeInfoObjs) {
        this.noticeInfoObjs = noticeInfoObjs;
    }
}
