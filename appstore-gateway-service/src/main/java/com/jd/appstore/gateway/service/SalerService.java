package com.jd.appstore.gateway.service;

import com.jd.appstore.gateway.domain.response.ProvinceRes;
import com.jd.appstore.gateway.domain.response.SalerRes;

/**
 * YYF on 2015/4/2.
 */
public interface SalerService {
    /**
     * 验证促销员是否存在
     *
     * @param salerNo
     * @return
     */
    SalerRes verifySaler(String salerNo);

    /**
     * 注册
     *
     * @param salerNo
     * @param cid
     * @param salerName
     * @param channelType
     * @param salerType
     * @param parentId
     * @param shopName
     * @return
     */
    SalerRes createSaler(String salerNo, Integer cid, String salerName, Integer channelType, Integer salerType, String parentId, String shopName);


    /**
     * 促销员登录
     *
     * @param salerNo
     * @return
     */
    SalerRes login(String salerNo, String password);



    ProvinceRes salerList();
}
