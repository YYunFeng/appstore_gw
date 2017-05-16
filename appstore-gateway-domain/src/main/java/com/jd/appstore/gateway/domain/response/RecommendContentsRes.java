package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.ImageLinkObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-20
 * Time: 下午2:54
 * To change this template use File | Settings | File Templates.
 */
public class RecommendContentsRes {
    
    private ResultObj resultObj;
    private List<ImageLinkObj> imageLinkObjs ;

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

    public List<ImageLinkObj> getImageLinkObjs() {
        return imageLinkObjs;
    }

    public void setImageLinkObjs(List<ImageLinkObj> imageLinkObjs) {
        this.imageLinkObjs = imageLinkObjs;
    }
}
