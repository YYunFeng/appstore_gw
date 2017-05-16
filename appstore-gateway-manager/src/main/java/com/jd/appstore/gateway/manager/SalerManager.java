package com.jd.appstore.gateway.manager;

import com.jd.appstore.gateway.domain.dao.PadChannel;
import com.jd.appstore.gateway.domain.dao.Saler;
import com.jd.appstore.gateway.domain.response.ProvinceRes;

import java.util.List;

/**
 * YYF on 2015/4/2.
 */
public interface SalerManager {

    /**
     * 验证促销员是否存在
     *
     * @param salerNo
     * @return
     */
    Integer verifySaler(String salerNo);

    /**
     * 创建促销员账号
     *
     * @param saler
     */
    void Register(Saler saler);

    /**
     * 促销员登录
     *
     * @param salerNo
     * @return
     */
    Saler login(String salerNo);


    /**
     * 渠道列表
     *
     * @return
     */
    List<PadChannel> padChannelList();

    /**
     * 督导和店长列表
     */
    List<Saler> salerList();




}
