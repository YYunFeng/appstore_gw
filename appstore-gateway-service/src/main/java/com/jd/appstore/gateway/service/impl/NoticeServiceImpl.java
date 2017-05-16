package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.dao.Notice;
import com.jd.appstore.gateway.domain.obj.NoticeInfoObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.NoticeInfoRes;
import com.jd.appstore.gateway.domain.response.NoticeListRes;
import com.jd.appstore.gateway.manager.NoticeManager;
import com.jd.appstore.gateway.service.NoticeService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Time: 下午4:40
 * To change this template use File | Settings | File Templates.
 */
public class NoticeServiceImpl implements NoticeService {

    private NoticeManager noticeManager;

    public NoticeListRes getNoticeList() {
        NoticeListRes noticeListRes = new NoticeListRes();
        try {
            List<Notice> noticeList = noticeManager.findWebSiteNotice();
            List<NoticeInfoObj> noticeInfoObjList = new ArrayList<NoticeInfoObj>();
            for (Notice notice : noticeList) {
                NoticeInfoObj noticeInfoObj = new NoticeInfoObj();
                noticeInfoObj.setId(notice.getId());
                noticeInfoObj.setSubject(notice.getSubject());
                noticeInfoObj.setContent(notice.getContent());
                noticeInfoObj.setPubTime(notice.getPubTime());
                noticeInfoObjList.add(noticeInfoObj);
            }
            noticeListRes.setNoticeInfoObjs(noticeInfoObjList);
            noticeListRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
        } catch (Exception e) {
            noticeListRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return noticeListRes;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public NoticeInfoRes getNoticeInfo(Integer noticeId) {
        NoticeInfoRes noticeInfoRes = new NoticeInfoRes();
        try {
            Notice notice = noticeManager.findWebSiteNoticeById(noticeId);
            NoticeInfoObj noticeInfoObj = new NoticeInfoObj();
            if (notice != null) {
                noticeInfoObj.setId(notice.getId());
                noticeInfoObj.setSubject(notice.getSubject());
                noticeInfoObj.setContent(notice.getContent());
                noticeInfoObj.setPubTime(notice.getPubTime());
            }
            noticeInfoRes.setNoticeInfoObj(noticeInfoObj);
            noticeInfoRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
        } catch (Exception e) {
            noticeInfoRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return noticeInfoRes;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setNoticeManager(NoticeManager noticeManager) {
        this.noticeManager = noticeManager;
    }
}
