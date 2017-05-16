package com.jd.appstore.gateway.dao;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-21
 * Time: 下午7:17
 * To change this template use File | Settings | File Templates.
 */
public interface SearchDao {
    List<String> findSearchHotKeyword();
}
