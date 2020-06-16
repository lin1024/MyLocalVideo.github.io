package com.mvo.interceptor;



import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author: CalcYu
 * Date: 2019/8/8
 */
public class AuthInterceptor extends HandlerInterceptorAdapter {

    /**
     *  在调用控制层方法之前先调用preHandler方法
     *  返回 true|false 来控制是否继续调用
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandler被执行了");
//        User user = (User) request.getSession().getAttribute(LoginController.USER_INFO);
//        if(user!=null){
//            user//更细粒度的判断角色权限等
//            return true;
//        }else{
//            response.sendRedirect("/login.html");
            return false;
//        }
    }

    /**
     * 控制层方法执行完成之后执行的方法
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle被执行了");
    }

    /**
     * servlet执行完成之后调用的方法
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion被执行了");
    }
}
