package com.jd.appstore.gateway.dao;

import com.jd.appstore.gateway.domain.dao.Recommend;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-12
 * Time: 上午11:30
 * To change this template use File | Settings | File Templates.
 */
public interface RecommendDao {
    List<Recommend> findRecommendContents(Recommend recommend);

}
