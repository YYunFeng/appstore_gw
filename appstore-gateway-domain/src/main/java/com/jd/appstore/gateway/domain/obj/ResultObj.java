package com.jd.appstore.gateway.domain.obj;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-18
 * Time: 下午8:24
 * To change this template use File | Settings | File Templates.
 */
public class ResultObj {

    public static final int RESPONSE_CODE_SUCCESS = 0;
    public static final int RESPONSE_CODE_ERROR = -1;
    public static final String RESPONSE_MSG_SUCCESS = "success";
    public static final String RESPONSE_MSG_ERROR = "error";
    public static final int RESPONSE_CODE_NOT_LOGIN = -2;
    public static final String RESPONSE_MSG_NOT_LOGIN = "not login";

    /**
     * 返回状态码
     */
    private int resultCode;

    /**
     * 返回信息
     */
    private String resultMsg;

    public ResultObj(int code){
        this.resultCode = code;
        if(code==RESPONSE_CODE_SUCCESS){
            this.resultMsg = RESPONSE_MSG_SUCCESS;
        }
        if(code==RESPONSE_CODE_ERROR){
            this.resultMsg = RESPONSE_MSG_ERROR;
        }
        if(code==RESPONSE_CODE_NOT_LOGIN){
            this.resultMsg = RESPONSE_MSG_NOT_LOGIN;
        }
    }

    public ResultObj(int code, String msg){
        this.resultCode = code;
        this.resultMsg = msg;
    }

    public ResultObj() {
        //To change body of created methods use File | Settings | File Templates.
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }


    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

}
