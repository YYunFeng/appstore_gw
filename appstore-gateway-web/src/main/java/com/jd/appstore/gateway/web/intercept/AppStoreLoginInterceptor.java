/*
package com.jd.appstore.gateway.web.intercept;

import com.jd.common.util.StringUtils;
import com.jd.digital.common.util.tool.WebHelper;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.log4j.Logger;
import org.apache.struts2.StrutsStatics;

import javax.servlet.http.HttpServletRequest;

*/
/**
 * appstore登录拦截器
 * Created by IntelliJ IDEA.
 * User: john
 * Date: 12-8-29
 * Time: 下午7:02
 * To change this template use File | Settings | File Templates.
 *//*

public class AppStoreLoginInterceptor extends MethodFilterInterceptor {
    private Logger logger = Logger.getLogger(this.getClass());

    public String doIntercept(ActionInvocation invocation) throws Exception {
        ActionContext actionContext = invocation.getInvocationContext();
        HttpServletRequest request = (HttpServletRequest) actionContext.get(StrutsStatics.HTTP_REQUEST);
        logger.info(request.getRequestURI());
        String pin = WebHelper.getPin();
        if (StringUtils.isBlank(pin)) {
            //如果没登陆，返回-2。客户端提示用户需要先登陆
            return "notLoginRedirect";
        }
        return invocation.invoke();
    }


}
*/
