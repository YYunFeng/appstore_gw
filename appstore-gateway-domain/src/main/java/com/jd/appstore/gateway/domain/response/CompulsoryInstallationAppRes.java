package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.CompulsoryInstallationAppObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;

import java.util.List;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class CompulsoryInstallationAppRes {
    private ResultObj resultObj;
    private List<CompulsoryInstallationAppObj> compulsoryInstallationAppObjList;

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

    public List<CompulsoryInstallationAppObj> getCompulsoryInstallationAppObjList() {
        return compulsoryInstallationAppObjList;
    }

    public void setCompulsoryInstallationAppObjList(List<CompulsoryInstallationAppObj> compulsoryInstallationAppObjList) {
        this.compulsoryInstallationAppObjList = compulsoryInstallationAppObjList;
    }
}
