package com.jd.appstore.gateway.domain.obj;

import java.util.List;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class SalerQueryObjNew {
    private String name;
    private List<String> counts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCounts() {
        return counts;
    }

    public void setCounts(List<String> counts) {
        this.counts = counts;
    }
}
