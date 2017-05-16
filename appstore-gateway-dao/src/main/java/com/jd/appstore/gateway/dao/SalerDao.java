package com.jd.appstore.gateway.dao;

import com.jd.appstore.gateway.domain.dao.PadChannel;
import com.jd.appstore.gateway.domain.dao.Saler;

import java.util.List;

/**
 * YYF on 2015/4/1.
 */
public interface SalerDao {

    /**
     * 验证促销员是否存在
     *
     * @param salerNo
     * @return
     */
    Integer verifySaler(String salerNo);

    /**
     * 创建促销员
     *
     * @param saler
     * @return
     */
    Integer createSaler(Saler saler);

    /**
     * 当促销员类型为督导或者店长时，parent_id为自身的ID
     *
     * @param saler
     */
    void updateSaler(Saler saler);

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
