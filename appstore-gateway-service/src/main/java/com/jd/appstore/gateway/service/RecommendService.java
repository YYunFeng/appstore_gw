package com.jd.appstore.gateway.service;


import com.jd.appstore.gateway.domain.response.RecommendContentsRes;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-12
 * Time: 上午11:26
 * To change this template use File | Settings | File Templates.
 */
public interface RecommendService {
    RecommendContentsRes findRecommendContents(Integer ct,Integer mid,Integer aid);
}
