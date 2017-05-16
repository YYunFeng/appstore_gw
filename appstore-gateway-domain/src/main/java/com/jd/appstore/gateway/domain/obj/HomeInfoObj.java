package com.jd.appstore.gateway.domain.obj;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-28
 * Time: 下午9:41
 * To change this template use File | Settings | File Templates.
 */
public class HomeInfoObj {

    private Integer areaType;
    private List<ImageLinkObj> imageLinkObjs;

    public Integer getAreaType() {
        return areaType;
    }

    public void setAreaType(Integer areaType) {
        this.areaType = areaType;
    }

    public List<ImageLinkObj> getImageLinkObjs() {
        return imageLinkObjs;
    }

    public void setImageLinkObjs(List<ImageLinkObj> imageLinkObjs) {
        this.imageLinkObjs = imageLinkObjs;
    }
}
