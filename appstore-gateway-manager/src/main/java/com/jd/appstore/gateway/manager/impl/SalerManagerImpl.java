package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.SalerDao;
import com.jd.appstore.gateway.domain.dao.PadChannel;
import com.jd.appstore.gateway.domain.dao.Saler;
import com.jd.appstore.gateway.domain.obj.ProvinceObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.ProvinceRes;
import com.jd.appstore.gateway.manager.SalerManager;
import com.jd.common.manager.BaseManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * YYF on 2015/4/2.
 */
public class SalerManagerImpl extends BaseManager implements SalerManager {
    private SalerDao salerDao;

    /**
     * 验证促销员是否存在
     *
     * @param salerNo
     * @return
     */
    public Integer verifySaler(String salerNo) {
        return salerDao.verifySaler(salerNo);
    }

    /**
     * 创建促销员账号
     *
     * @param saler
     */
    public void Register(final Saler saler) {
        TransactionTemplate template = getDataSourceTransactionManager();
        template.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                try {
                    if (saler != null) {
                        salerDao.createSaler(saler);
                        // 当促销员为督导或者为店长时候，parent_id为自身的ID
                        if (saler.getSalerType().intValue() == 0 || saler.getSalerType().intValue() == 1) {
                            saler.setParentId(saler.getSalerNo());
                            salerDao.updateSaler(saler);
                        }
                    }
                } catch (Exception e) {
                    status.setRollbackOnly();
                    throw new RuntimeException("创建促销员账号失败!", e);
                }
            }
        });
    }

    public Saler login(String salerNo) {
        return salerDao.login(salerNo);
    }

    public List<PadChannel> padChannelList() {
        return salerDao.padChannelList();
    }


    /**
     * 督导和店长列表
     *
     * @return
     */
    public List<Saler> salerList() {
        return salerDao.salerList();
    }


    public void setSalerDao(SalerDao salerDao) {
        this.salerDao = salerDao;
    }
}
