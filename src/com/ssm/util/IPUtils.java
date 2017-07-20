package com.ssm.util;

import javax.servlet.http.HttpServletRequest;

import com.ssm.controller.BaseController;

/**
 * ip工具类
 * @author zhefeng.ning
 * @创建时间
 */
public class IPUtils extends BaseController{
	
	/**
	 * 生成IP
	 * @return
	 */
	public String produceIP(){
		HttpServletRequest request = this.getRequest();
		String ip = "";
		if (request.getHeader("x-forwarded-for") == null) {  
			ip = request.getRemoteAddr();  
	    }else{
	    	ip = request.getHeader("x-forwarded-for");  
	    }
		return ip;

	}
}
