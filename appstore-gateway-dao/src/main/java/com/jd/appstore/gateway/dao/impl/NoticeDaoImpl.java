package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.NoticeDao;
import com.jd.appstore.gateway.domain.dao.Notice;
import com.jd.common.dao.BaseDao;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-8-28
 * Time: 下午4:24
 * To change this template use File | Settings | File Templates.
 */
public class NoticeDaoImpl extends BaseDao implements NoticeDao{
    public List<Notice> findWebSiteNotice() {
        return queryForList("Notice.findNotice");
    }

    public Notice findWebSiteNoticeById(int noticeId) {
        return (Notice) queryForObject("Notice.findNoticeById",noticeId);
    }
}
