package com.ssm.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.ssm.entity.system.User;
import com.ssm.util.Const;
import com.ssm.util.Jurisdiction;

/**
 * 类名称 
 * 类描述 登录过滤，权限验证
 * @Description TODO
 * @author zhefeng.ning
 * @time 2017年4月16日 下午4:02:08
 */

public class LoginHandlerInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception{
		
		String path = request.getServletPath();
		if(path.matches(Const.NO_INTERCEPTOR_PATH)){
			return true;
		}else{
			User user = (User)Jurisdiction.getSession().getAttribute(Const.SESSION_USER);
			if(user != null){
				path = path.substring(1, path.length());
				boolean b = Jurisdiction.hasJurisdiction(path);
				if(!b){
					response.sendRedirect(request.getContextPath() + Const.LOGIN);
				}
				return b;
			}else{
				response.sendRedirect(request.getContextPath() + Const.LOGIN);
				return false;
			}
		}
	}
}
