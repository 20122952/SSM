package com.ssm.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.entity.WebSocketUser;
import com.ssm.util.AppUtil;
import com.ssm.util.PageData;

@Controller
public class ChatController extends BaseController{
	
	
	@RequestMapping("/webSocket")
	@ResponseBody
	public Object webSocket(){
		Map<String,String> map = new HashMap<String,String>();
		WebSocketUser loginUser = new WebSocketUser();
		//判断，如果没有session，则跳到登录页面
		HttpSession session = this.getRequest().getSession();
		// 判断是否是一个已经登录的用户，没有则登录
		if (null != session.getAttribute("loginUser")) {
			// 清除旧的用户
			session.removeAttribute("loginUser");
		}
		if(null == session.getAttribute("loginUser")){
			// 随机生成一个用户
			String id = UUID.randomUUID().toString();
			String username = session.getAttribute("USERNAME").toString();
			loginUser.setId(id);
			loginUser.setNickname(username);
			session.setAttribute("id", id);
			session.setAttribute("username", username);
			session.setAttribute("loginUser", loginUser);
			map.put("id", id);
			map.put("username", username);
			// 将登录信息放入数据库，便于协查跟踪聊天者
			System.out.println("用户：" + loginUser);
		}
		return AppUtil.returnObject(new PageData(), map);
	}
	
	

}
