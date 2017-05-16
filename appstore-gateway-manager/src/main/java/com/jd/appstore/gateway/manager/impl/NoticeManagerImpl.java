package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.NoticeDao;
import com.jd.appstore.gateway.domain.dao.Notice;
import com.jd.appstore.gateway.manager.NoticeManager;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-8-28
 * Time: 下午4:27
 * To change this template use File | Settings | File Templates.
 */
public class NoticeManagerImpl implements NoticeManager{
    private NoticeDao noticeDao;

    public List<Notice> findWebSiteNotice() {
        return noticeDao.findWebSiteNotice();
    }

    public Notice findWebSiteNoticeById(int noticeId) {
        return noticeDao.findWebSiteNoticeById(noticeId);
    }

    public void setNoticeDao(NoticeDao noticeDao) {
        this.noticeDao = noticeDao;
    }
}
