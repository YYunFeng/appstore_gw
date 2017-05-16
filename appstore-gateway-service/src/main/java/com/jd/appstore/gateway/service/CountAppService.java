package com.jd.appstore.gateway.service;

import com.jd.appstore.gateway.domain.obj.ReportCount;
import com.jd.appstore.gateway.domain.response.CountAppRes;
import com.jd.appstore.gateway.domain.response.LogStatusRes;

/**
 * Created by YUNFENG on 14-2-11.
 */
public interface CountAppService {
    
    CountAppRes createCountApp(String phoneImei, String appid);


    LogStatusRes reportCount(ReportCount reportCount);
}
