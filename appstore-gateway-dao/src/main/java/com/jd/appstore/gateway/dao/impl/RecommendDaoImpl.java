package com.jd.appstore.gateway.dao.impl;

import com.jd.appstore.gateway.dao.RecommendDao;
import com.jd.appstore.gateway.domain.dao.Recommend;
import com.jd.common.dao.BaseDao;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-12
 * Time: 上午11:30
 * To change this template use File | Settings | File Templates.
 */
public class RecommendDaoImpl extends BaseDao implements RecommendDao{

    public List<Recommend> findRecommendContents(Recommend recommend) {
        return queryForList("Recommend.findRecommend",recommend);
    }
}
