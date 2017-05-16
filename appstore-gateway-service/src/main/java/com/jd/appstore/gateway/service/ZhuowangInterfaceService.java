package com.jd.appstore.gateway.service;

import com.jd.appstore.gateway.domain.zhuowangobj.xmlbean.OrderRelationReq;
import com.jd.appstore.gateway.domain.zhuowangobj.xmlbean.OrderRelationRes;
import com.jd.appstore.gateway.domain.zhuowangobj.xmlbean.ZhuowangUserLoginReq;
import com.jd.appstore.gateway.domain.zhuowangobj.xmlbean.ZhuowangUserLoginRes;

/**
 * User: gaoyang
 * Date: 13-3-12
 * Time: 下午10:57
 * To change this template use File | Settings | File Templates.
 */
public interface ZhuowangInterfaceService {
    /**
     * 通过卓望接口登陆
     *
     * @param zhuowangUserLoginReq
     * @return
     */
    ZhuowangUserLoginRes zhuowangLogin(ZhuowangUserLoginReq zhuowangUserLoginReq);

    /**
     * 通过卓望获取应用下载短地址
     *
     * @return
     */
    OrderRelationRes zhuowangAppDownload(OrderRelationReq orderRelationReq);

}
