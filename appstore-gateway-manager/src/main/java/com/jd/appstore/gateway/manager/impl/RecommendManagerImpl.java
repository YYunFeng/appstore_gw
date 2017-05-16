package com.jd.appstore.gateway.manager.impl;

import com.jd.appstore.gateway.dao.RecommendDao;
import com.jd.appstore.gateway.domain.dao.Recommend;
import com.jd.appstore.gateway.manager.RecommendManager;
import com.jd.common.manager.BaseManager;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-12
 * Time: 上午11:29
 * To change this template use File | Settings | File Templates.
 */
public class RecommendManagerImpl extends BaseManager implements RecommendManager {
    private RecommendDao recommendDao;

    public List<Recommend> findRecommendContents(Integer ct, Integer mid, Integer aid) {
        Recommend recommend = new Recommend();
        recommend.setClientType(ct);
        recommend.setModuleId(mid);
        recommend.setAreaId(aid);
        return recommendDao.findRecommendContents(recommend);
    }

    public void setRecommendDao(RecommendDao recommendDao) {
        this.recommendDao = recommendDao;
    }
}
