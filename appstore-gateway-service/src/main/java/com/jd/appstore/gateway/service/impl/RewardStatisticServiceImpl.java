package com.jd.appstore.gateway.service.impl;

import com.jd.appstore.gateway.domain.dao.parameter.RewardStatisticParameter;
import com.jd.appstore.gateway.domain.obj.ResultObj;
import com.jd.appstore.gateway.domain.obj.RewardStatisticObj;
import com.jd.appstore.gateway.domain.obj.SalerQueryObj;
import com.jd.appstore.gateway.domain.obj.SalerQueryObjNew;
import com.jd.appstore.gateway.domain.response.RewardStatisticRes;
import com.jd.appstore.gateway.domain.response.SalerQueryRes;
import com.jd.appstore.gateway.domain.util.RewardUtils;
import com.jd.appstore.gateway.manager.RewardStatisticManager;
import com.jd.appstore.gateway.service.RewardStatisticService;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by YUNFENG on 14-2-10.
 */
public class RewardStatisticServiceImpl implements RewardStatisticService {
    private RewardStatisticManager rewardStatisticManager;

    public RewardStatisticRes getRewardStatistic(String saler, String startTime, String endTime) {
        RewardStatisticRes rewardStatisticRes = new RewardStatisticRes();
        try {
            if (saler != null) {
                RewardStatisticParameter rewardStatisticParameter = new RewardStatisticParameter();
                rewardStatisticParameter.setSaler(saler);
                if (startTime != null && endTime != null) {
                    rewardStatisticParameter.setStartTime(startTime);
                    rewardStatisticParameter.setEndTime(endTime);
                }

                RewardStatisticObj rewardStatisticObj = rewardStatisticManager.getIncome(rewardStatisticParameter);
                if (rewardStatisticObj != null) {
                    if (rewardStatisticObj.getNiceCounts() != null && rewardStatisticObj.getSaleCounts() != null) {
                        double b = (double) (rewardStatisticObj.getNiceCounts() + rewardStatisticObj.getSaleCounts()) / RewardUtils.VAILDMACHINES;
                        BigDecimal a = new BigDecimal(b);
                        double f1 = a.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                        rewardStatisticObj.setVaildMachine(f1);
                    }
                    if (rewardStatisticObj.getNicePrice() != null && rewardStatisticObj.getSalePrice() != null) {
                        BigDecimal b1 = new BigDecimal(Double.toString(rewardStatisticObj.getNicePrice()));
                        BigDecimal b2 = new BigDecimal(Double.toString(rewardStatisticObj.getSalePrice()));
                        rewardStatisticObj.setReward(b1.add(b2).doubleValue());
                    }
                    rewardStatisticRes.setRewardStatisticObj(rewardStatisticObj);
                    rewardStatisticRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS, "success"));
                }
            } else {
                rewardStatisticRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "参数错误，促销员Id为空"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            rewardStatisticRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "系统异常，请重试"));
        }
        return rewardStatisticRes;
    }

    public SalerQueryRes salerQuery(String saler, String startTime, String endTime) {
        SalerQueryRes salerQueryRes = new SalerQueryRes();
        List<SalerQueryObj> salerQueryObjList = new ArrayList<SalerQueryObj>();
        try {
            if (saler != null) {
                RewardStatisticParameter rewardStatisticParameter = new RewardStatisticParameter();
                rewardStatisticParameter.setSaler(saler);
                if (startTime != null && endTime != null) {
                    rewardStatisticParameter.setStartTime(startTime);
                    rewardStatisticParameter.setEndTime(endTime);
                }

                RewardStatisticObj rewardStatisticObj = rewardStatisticManager.getIncome(rewardStatisticParameter);
                if (rewardStatisticObj != null) {
                    if (rewardStatisticObj.getNiceCounts() != null && rewardStatisticObj.getSaleCounts() != null) {
                        int b = (int) Math.round(rewardStatisticObj.getVaildMachine() * 100); //小数点后两位前移，并四舍五入
                        rewardStatisticObj.setVaildMachine((double) b / 100.00);
                    }
                    if (rewardStatisticObj.getNicePrice() != null && rewardStatisticObj.getSalePrice() != null) {
                        BigDecimal b1 = new BigDecimal(Double.toString(rewardStatisticObj.getNicePrice()));
                        BigDecimal b2 = new BigDecimal(Double.toString(rewardStatisticObj.getSalePrice()));
                        rewardStatisticObj.setReward(b1.add(b2).doubleValue());
                    }
                    DecimalFormat df = new DecimalFormat(".##");
                    SalerQueryObj salerQueryObj4 = new SalerQueryObj();
                    salerQueryObj4.setName("装机数");
                    salerQueryObj4.setCounts(String.valueOf(rewardStatisticObj.getVaildMachine() == null ? 0 : rewardStatisticObj.getVaildMachine()));
                    salerQueryObjList.add(salerQueryObj4);

                    SalerQueryObj salerQueryObj = new SalerQueryObj();
                    salerQueryObj.setName("精彩推荐应用安装数");
                    salerQueryObj.setCounts(String.valueOf(rewardStatisticObj.getNiceCounts() == null ? 0 : rewardStatisticObj.getNiceCounts()));
                    salerQueryObjList.add(salerQueryObj);

                    SalerQueryObj salerQueryObj1 = new SalerQueryObj();
                    salerQueryObj1.setName("精彩推荐应用奖励金额");

                    salerQueryObj1.setCounts(String.valueOf(rewardStatisticObj.getNicePrice() == null ? 0 : Double.valueOf(df.format(rewardStatisticObj.getNicePrice()))));
                    salerQueryObjList.add(salerQueryObj1);

                    SalerQueryObj salerQueryObj2 = new SalerQueryObj();
                    salerQueryObj2.setName("装机必备应用安装数");
                    salerQueryObj2.setCounts(String.valueOf(rewardStatisticObj.getSaleCounts() == null ? 0 : rewardStatisticObj.getSaleCounts()));
                    salerQueryObjList.add(salerQueryObj2);

                    SalerQueryObj salerQueryObj3 = new SalerQueryObj();
                    salerQueryObj3.setName("装机必备应用奖励金额");
                    salerQueryObj3.setCounts(String.valueOf(rewardStatisticObj.getSalePrice() == null ? 0 : Double.valueOf(df.format(rewardStatisticObj.getSalePrice()))));
                    salerQueryObjList.add(salerQueryObj3);

                    SalerQueryObj salerQueryObj6 = new SalerQueryObj();
                    salerQueryObj6.setName("应用到达数");
                    salerQueryObj6.setCounts(String.valueOf(rewardStatisticObj.getArrCounts() == null ? 0 : rewardStatisticObj.getArrCounts()));
                    salerQueryObjList.add(salerQueryObj6);


                    SalerQueryObj salerQueryObj5 = new SalerQueryObj();
                    salerQueryObj5.setName("总奖励金额");
                    salerQueryObj5.setCounts(String.valueOf(rewardStatisticObj.getReward() == null ? 0 : Double.valueOf(df.format(rewardStatisticObj.getReward()))));
                    salerQueryObjList.add(salerQueryObj5);

                    salerQueryRes.setSalerQueryObjList(salerQueryObjList);
                    salerQueryRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS, "success"));
                }
            } else {
                salerQueryRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "参数错误，促销员Id为空"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return salerQueryRes;
    }

    public SalerQueryRes salerQueryNew(String saler, String startTime, String endTime) {
        SalerQueryRes salerQueryRes = new SalerQueryRes();
        SalerQueryObjNew salerQueryObj = new SalerQueryObjNew();
        try {
            if (saler != null) {
                RewardStatisticParameter rewardStatisticParameter = new RewardStatisticParameter();
                rewardStatisticParameter.setSaler(saler);
                if (startTime != null && endTime != null) {
                    rewardStatisticParameter.setStartTime(startTime);
                    rewardStatisticParameter.setEndTime(endTime);
                }
                Integer salerType = rewardStatisticManager.salerType(saler);
                StringBuffer names = new StringBuffer();
                names.append("姓名");
                names.append(",");
                names.append("促销员类型");
                names.append(",");
                names.append("手机安装台数");
                names.append(",");
                names.append("应用安装数");
                names.append(",");
                names.append("有效安装数");
                salerQueryObj.setName(names.toString());

                List<String> counts = new ArrayList<String>();
                if (salerType != null) {
                    // 店员
                    if (salerType.intValue() == 2) {
                        RewardStatisticObj rewardStatisticObj = rewardStatisticManager.incomeNewSalerDetails(rewardStatisticParameter);
                        if (rewardStatisticObj != null) {
                            Integer arrCounts = rewardStatisticObj.getArriveCounts() + rewardStatisticObj.getActCounts() + rewardStatisticObj.getActCountsCompute();
                            counts.add(rewardStatisticObj.getSalerName() + "," + rewardStatisticObj.getSalerType() + "," + rewardStatisticObj.getPhoneCounts() + "," + rewardStatisticObj.getAppCounts() + "," + arrCounts);
                            salerQueryObj.setCounts(counts);
                        }
                        salerQueryRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS, "success"));
                        salerQueryRes.setSalerQueryObj(salerQueryObj);
                        // 督导或者店长
                    } else {
                        List<RewardStatisticObj> rewardStatisticObj = rewardStatisticManager.incomeNewSaler(rewardStatisticParameter);
                        if (rewardStatisticObj != null && rewardStatisticObj.size() > 0) {
                            for (int i = 0; i < rewardStatisticObj.size(); i++) {
                                Integer arrCounts = rewardStatisticObj.get(i).getArriveCounts() + rewardStatisticObj.get(i).getActCounts() + rewardStatisticObj.get(i).getActCountsCompute();
                                counts.add(rewardStatisticObj.get(i).getSalerName() + "," + rewardStatisticObj.get(i).getSalerType() + "," + rewardStatisticObj.get(i).getPhoneCounts() + "," + rewardStatisticObj.get(i).getAppCounts() + "," + arrCounts);
                            }
                            salerQueryObj.setCounts(counts);
                        }
                        salerQueryRes.setSalerQueryObj(salerQueryObj);
                        salerQueryRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_SUCCESS, "success"));
                    }
                }
            } else {
                salerQueryRes.setResultObj(new ResultObj(ResultObj.RESPONSE_CODE_ERROR, "参数错误，促销员Id为空"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return salerQueryRes;
    }

    public void setRewardStatisticManager(RewardStatisticManager rewardStatisticManager) {
        this.rewardStatisticManager = rewardStatisticManager;
    }


}
