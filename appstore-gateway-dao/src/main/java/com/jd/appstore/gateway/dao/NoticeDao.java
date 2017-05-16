package com.jd.appstore.gateway.dao;

import com.jd.appstore.gateway.domain.dao.Notice;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-8-28
 * Time: 下午4:23
 * To change this template use File | Settings | File Templates.
 */
public interface NoticeDao {
    List<Notice> findWebSiteNotice();
    Notice findWebSiteNoticeById(int noticeId);
}
