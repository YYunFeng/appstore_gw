package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.SalerDao;
import com.jd.appstore.gateway.domain.dao.PadChannel;
import com.jd.appstore.gateway.domain.dao.Saler;
import com.jd.common.dao.BaseDao;

import java.util.List;

/**
 * YYF on 2015/4/2.
 */
public class SalerDaoImpl extends BaseDao implements SalerDao {

    /**
     * 验证促销员是否存在
     *
     * @param salerNo
     * @return
     */
    public Integer verifySaler(String salerNo) {
        return (Integer) queryForObject("Saler.verifySaler", salerNo);
    }

    /**
     * 创建促销员账号
     *
     * @param saler
     * @return
     */
    public Integer createSaler(Saler saler) {
        return (Integer) insert("Saler.createSaler", saler);
    }

    /**
     * 当促销员类型为督导或者店长时，parent_id为自身的ID
     *
     * @param saler
     */
    public void updateSaler(Saler saler) {
        update("Saler.updateSaler", saler);
    }

    /**
     * 促销员登录
     *
     * @param salerNo
     * @return
     */
    public Saler login(String salerNo) {
        return (Saler) queryForObject("Saler.login", salerNo);
    }

    public List<PadChannel> padChannelList() {
        return queryForList("Saler.channelList");
    }

    public List<Saler> salerList() {
        return queryForList("Saler.salerList");
    }
}
