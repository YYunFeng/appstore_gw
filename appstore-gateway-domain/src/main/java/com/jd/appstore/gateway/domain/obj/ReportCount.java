package com.jd.appstore.gateway.domain.obj;

import java.util.List;

/**
 * Created by YYF on 14-5-27.
 */
public class ReportCount {
    private String phoneImei;
    private List<String> pckList;


    public String getPhoneImei() {
        return phoneImei;
    }

    public void setPhoneImei(String phoneImei) {
        this.phoneImei = phoneImei;
    }

    public List<String> getPckList() {
        return pckList;
    }

    public void setPckList(List<String> pckList) {
        this.pckList = pckList;
    }
}
