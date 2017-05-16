package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.NoticeInfoRes;
import com.jd.appstore.gateway.domain.response.NoticeListRes;
import com.jd.appstore.gateway.service.NoticeService;
import com.jd.common.struts.action.BaseAction;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-24
 * Time: 下午10:33
 * To change this template use File | Settings | File Templates.
 */

public class NoticeAction extends BaseAction {

    private Integer nid;

    private NoticeListRes noticeListRes;
    private NoticeInfoRes noticeInfoRes;

    private NoticeService noticeService;

    public String List() {
        noticeListRes = noticeService.getNoticeList();
        return "list";
    }

    public String Info() {
        noticeInfoRes = noticeService.getNoticeInfo(nid);
        return "info";
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public NoticeListRes getNoticeListRes() {
        return noticeListRes;
    }

    public void setNoticeListRes(NoticeListRes noticeListRes) {
        this.noticeListRes = noticeListRes;
    }

    public NoticeInfoRes getNoticeInfoRes() {
        return noticeInfoRes;
    }

    public void setNoticeInfoRes(NoticeInfoRes noticeInfoRes) {
        this.noticeInfoRes = noticeInfoRes;
    }

    public void setNoticeService(NoticeService noticeService) {
        this.noticeService = noticeService;
    }
}
