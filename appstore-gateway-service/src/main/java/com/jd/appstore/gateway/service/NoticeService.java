package com.jd.appstore.gateway.service;

import com.jd.appstore.gateway.domain.response.NoticeInfoRes;
import com.jd.appstore.gateway.domain.response.NoticeListRes;

/**
 * Created by IntelliJ IDEA.
 * User: xietieyun
 * Date: 12-8-28
 * Time: 下午4:29
 * To change this template use File | Settings | File Templates.
 */
public interface NoticeService {
    NoticeListRes getNoticeList();
    NoticeInfoRes getNoticeInfo(Integer NoticeId);
}
