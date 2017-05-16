package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.CommentInfoObj;
import com.jd.appstore.gateway.domain.obj.ResultObj;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-8-23
 * Time: 下午5:08
 * To change this template use File | Settings | File Templates.
 */
public class CommentListRes {
    
    private ResultObj resultObj;
    private List<CommentInfoObj> commentInfoObjList;


    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

    public List<CommentInfoObj> getCommentInfoObjList() {
        return commentInfoObjList;
    }

    public void setCommentInfoObjList(List<CommentInfoObj> commentInfoObjList) {
        this.commentInfoObjList = commentInfoObjList;
    }
}
