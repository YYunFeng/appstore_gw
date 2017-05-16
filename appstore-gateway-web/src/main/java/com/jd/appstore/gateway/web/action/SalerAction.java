package com.jd.appstore.gateway.web.action;

import com.jd.appstore.gateway.domain.response.ProvinceRes;
import com.jd.appstore.gateway.domain.response.SalerRes;
import com.jd.appstore.gateway.service.SalerService;
import com.jd.common.struts.action.BaseAction;

/**
 * User: gaoyang
 * Date: 12-7-18
 * Time: 下午9:08
 * To change this template use File | Settings | File Templates.
 */
public class SalerAction extends BaseAction {

    private String salerNo;
    private Integer cid;
    private String salerName;
    private Integer channelType;
    private Integer salerType;
    private String parentId;
    private String shopName;
    private SalerRes salerRes;
    private String password;
    private SalerService salerService;

    private ProvinceRes provinceRes;

    /**
     * 验证促销员是否存在
     *
     * @return
     */
    public String VerifySaler() {
        salerRes = salerService.verifySaler(salerNo);
        return "verifySaler";
    }


    /**
     * 用户注册
     *
     * @return
     * @throws Exception
     */
    public String Register() throws Exception {
        salerRes = salerService.createSaler(salerNo, cid, salerName, channelType, salerType, parentId, shopName);
        return "register";
    }

    /**
     * 用户登陆
     *
     * @return
     * @throws Exception
     */

    public String Login() throws Exception {
        salerRes = salerService.login(salerNo, password);
        return "login";
    }

    /**
     * 各省份督导和店长列表
     *
     * @return
     */
    public String List() {
        provinceRes = salerService.salerList();
        return "salerList";
    }


    public String getSalerNo() {
        return salerNo;
    }

    public void setSalerNo(String salerNo) {
        this.salerNo = salerNo;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }


    public String getSalerName() {
        return salerName;
    }

    public void setSalerName(String salerName) {
        this.salerName = salerName;
    }

    public Integer getChannelType() {
        return channelType;
    }

    public void setChannelType(Integer channelType) {
        this.channelType = channelType;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }


    public SalerRes getSalerRes() {
        return salerRes;
    }

    public void setSalerRes(SalerRes salerRes) {
        this.salerRes = salerRes;
    }

    public void setSalerService(SalerService salerService) {
        this.salerService = salerService;
    }

    public Integer getSalerType() {
        return salerType;
    }

    public void setSalerType(Integer salerType) {
        this.salerType = salerType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ProvinceRes getProvinceRes() {
        return provinceRes;
    }

    public void setProvinceRes(ProvinceRes provinceRes) {
        this.provinceRes = provinceRes;
    }
}
