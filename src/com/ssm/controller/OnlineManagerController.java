package com.ssm.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.util.Const;


@Controller
@RequestMapping("/onlinemanager")
public class OnlineManagerController extends BaseController{

	/**
	 * 跳转到在线用户的页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public ModelAndView list()throws Exception{
		logBefore(logger, "列表OnlineManager");
		HttpSession session = this.getRequest().getSession();
		String username = session.getAttribute("USERNAME").toString();
 		Map<String, String> map = (Map<String, String>) session.getAttribute(username + Const.SESSION_QX);
 		//edit=0, del=1,  add=1, cha=1, }
 		map.put("edit", "1");
 		map.put("del", "1");
 		map.put("add", "1");
 		map.put("cha", "1");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("system/onlinemanager/onlinemanager_list");
		mv.addObject("QX",map);	//按钮权限
		return mv;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format,true));
	}
	
}
