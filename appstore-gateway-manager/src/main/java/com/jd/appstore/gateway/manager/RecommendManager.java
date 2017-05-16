package com.jd.appstore.gateway.manager;

import com.jd.appstore.gateway.domain.dao.Recommend;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-12
 * Time: 上午11:27
 * To change this template use File | Settings | File Templates.
 */
public interface RecommendManager {
    List<Recommend> findRecommendContents(Integer ct,Integer mid,Integer aid);
}
