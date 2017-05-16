package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.ResultObj;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-19
 * Time: 下午12:28
 * To change this template use File | Settings | File Templates.
 */
public class BalanceRes {

    private ResultObj resultObj;
    private BigDecimal balance;
    private BigDecimal lockBalance;
    private Integer status;

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLockBalance() {
        return lockBalance;
    }

    public void setLockBalance(BigDecimal lockBalance) {
        this.lockBalance = lockBalance;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
