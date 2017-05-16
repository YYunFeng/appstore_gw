package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.dao.PadChannel;
import com.jd.appstore.gateway.domain.dao.Saler;
import com.jd.appstore.gateway.domain.obj.ProvinceObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.response.ProvinceRes;
import com.jd.appstore.gateway.domain.response.SalerRes;
import com.jd.appstore.gateway.manager.SalerManager;
import com.jd.appstore.gateway.service.SalerService;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * YYF on 2015/4/2.
 */
public class SalerServiceImpl implements SalerService {
    private SalerManager salerManager;

    /**
     * 验证促销员是否存在
     *
     * @param salerNo
     * @return
     */
    public SalerRes verifySaler(String salerNo) {
        SalerRes salerRes = new SalerRes();
        try {
            Integer counts = salerManager.verifySaler(salerNo);
            if (counts != null) {
                if (counts > 0) {
                    salerRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "该促销员已经存在"));
                } else {
                    salerRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS, "success"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            salerRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "系统异常,请重试！"));
        }
        return salerRes;
    }

    /**
     * 注册促销员
     *
     * @param salerNo
     * @param cid
     * @param salerName
     * @param channelType
     * @param salerType
     * @param parentId
     * @param shopName
     * @return
     */
    public SalerRes createSaler(String salerNo, Integer cid, String salerName, Integer channelType, Integer salerType, String parentId, String shopName) {
        SalerRes salerRes = new SalerRes();
        try {
            Integer counts = salerManager.verifySaler(salerNo);
            if (counts > 0) {
                salerRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "该促销员已经存在!"));
            } else if (counts == 0) {
                Saler saler = new Saler();
                saler.setSalerNo(salerNo);
                saler.setCid(cid);
                saler.setSalerName(salerName);
                saler.setChannelType(channelType);
                saler.setSalerType(salerType);
                saler.setParentId(parentId);
                saler.setShopName(shopName);
                if (channelType != null) {
                    if (channelType.intValue() == 0 && salerType == 1) {
                        salerRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "渠道类型为分销时，促销员类型不能为店长！"));
                    } else if (channelType.intValue() == 1 && salerType == 0) {
                        salerRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "渠道类型为零售时，促销员类型不能为督导！"));
                    } else {
                        salerManager.Register(saler);
                        salerRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS, "创建成功！"));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            salerRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "系统异常,请重试！"));
        }
        return salerRes;
    }

    public SalerRes login(String salerNo, String password) {
        SalerRes salerRes = new SalerRes();
        try {
            if (StringUtils.isNotBlank(password) || StringUtils.isNotBlank(salerNo)) {
                if (!password.equals("666666")) {
                    salerRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "密码错误"));
                } else {
                    Saler saler = salerManager.login(salerNo);
                    if (saler != null) {
                        salerRes.setSaler(saler);
                        salerRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS, "登录成功"));
                    } else {
                        salerRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "唯一号不存在"));
                    }
                }
            } else {
                salerRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "促销员唯一号和密码为空"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            salerRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "系统异常,请重试！"));
        }
        return salerRes;
    }

    public ProvinceRes salerList() {
        ProvinceRes provinceRes = new ProvinceRes();
        List<PadChannel> list = salerManager.padChannelList();
        //促销员列表
        List<Saler> salerList = salerManager.salerList();
        try {
            if (list != null && list.size() > 0) {
                List<ProvinceObj> provinceObjList = new ArrayList<ProvinceObj>();
                for (PadChannel padChannel : list) {
                    ProvinceObj provinceObj = new ProvinceObj();
                    provinceObj.setCid(padChannel.getId());
                    provinceObj.setCname(padChannel.getCname());
                    // 督导列表
                    List<Saler> leaderSalers = new ArrayList<Saler>();
                    // 店长列表
                    List<Saler> shopownerSalers = new ArrayList<Saler>();
                    for (Saler salerTmp : salerList) {
                        Saler saler = new Saler();
                        if (salerTmp.getCid().intValue() == padChannel.getId().intValue()) {
                            if (salerTmp.getSalerType() != null) {
                                if (salerTmp.getSalerType().intValue() == 0) {
                                    saler.setSalerName(salerTmp.getSalerName());
                                    saler.setSalerNo(salerTmp.getSalerNo());
                                    leaderSalers.add(saler);
                                } else if (salerTmp.getSalerType().intValue() == 1) {
                                    saler.setSalerName(salerTmp.getSalerName());
                                    saler.setSalerNo(salerTmp.getSalerNo());
                                    shopownerSalers.add(saler);
                                }
                            }
                        }
                    }
                    provinceObj.setLeaderList(leaderSalers);
                    provinceObj.setShopownerList(shopownerSalers);
                    provinceObjList.add(provinceObj);
                }
                provinceRes.setProvinceObjList(provinceObjList);
                provinceRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS));
            }
        } catch (Exception e) {
            provinceRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR));
            e.printStackTrace();
        }
        return provinceRes;
    }

    public SalerRes login(String salerNo) {
        return null;
    }


    public void setSalerManager(SalerManager salerManager) {
        this.salerManager = salerManager;
    }
}
