package com.ssm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.entity.Page;
import com.ssm.service.FhsmsService;
import com.ssm.util.AppUtil;
import com.ssm.util.Const;
import com.ssm.util.DateUtil;
import com.ssm.util.Jurisdiction;
import com.ssm.util.PageData;

/**
 * 站内信
 * @author zhefeng.ning
 * @创建时间 2017年4月14日 上午9:55:51
 */
@Controller
@RequestMapping("/fhsms")
public class FhsmsController extends BaseController{
	
	@Autowired
	private FhsmsService fhsmsServiceImpl;
	
	/**
	 * 调到站内短信页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/goAdd")
	public ModelAndView goAdd() throws Exception{
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		mv.setViewName("system/fhsms/fhsms_edit");
		mv.addObject("msg","save");
		mv.addObject("pd",pd);
		return mv;
	}
	
	/**
	 * 发送站内短信
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/save")
	@ResponseBody
	public Object save() throws Exception{
		//logBefore(logger, Jurisdiction.getUsername()+"发送站内信");
		ModelAndView mv = new ModelAndView();
		HttpSession session = this.getRequest().getSession();
		PageData pd = new PageData();
		pd = this.getPageData();
		Map<String,Object> map = new HashMap<String,Object>();
		List<PageData> pdList = new ArrayList<PageData>();
		String msg = "ok";
		int count = 0;
		int zcount = 0;
		String username = pd.getString("USERNAME");
		String fromUesrname = (String)session.getAttribute("USERNAME");
		if(username != null && !"".equals(username)){
			username = username.replaceAll("；", ";");
			username = username.replaceAll(" ", "");
			String[] arrUsername = username.split(";");
			zcount = arrUsername.length;
			try {
				pd.put("STATUS", "2");
				for (int i = 0; i < arrUsername.length; i++) {
					pd.put("SANME_ID", this.get32UUID());
					pd.put("SEND_TIME", DateUtil.getTime());
					pd.put("FHSMS_ID", this.get32UUID());
					pd.put("TYPE", "2");
					pd.put("FROM_USERNAME", fromUesrname);
					pd.put("TO_USERNAME", arrUsername[i]);
					fhsmsServiceImpl.save(pd);
					pd.put("FHSMS_ID", this.get32UUID());
					pd.put("TYPE", "1");
					pd.put("FROM_USERNAME", arrUsername[i]);
					pd.put("TO_USERNAME", fromUesrname);
					fhsmsServiceImpl.save(pd);
					count++;
				}
				msg = "ok";
			} catch (Exception e) {
				msg = "error";
			}
		}else{
			msg = "error";
		}
		pd.put("msg", msg);
		pd.put("count", count);
		pd.put("ecount", zcount-count);
		pdList.add(pd);
		map.put("list", pdList);
		return AppUtil.returnObject(pd, map);
	}
	
	/**
	 * 站内短信列表
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public ModelAndView list(Page page) throws Exception{
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		HttpSession session = this.getRequest().getSession();
		String username = session.getAttribute("USERNAME").toString();
 		Map<String, String> map = (Map<String, String>) session.getAttribute(username + Const.SESSION_QX);
 		//edit=0, del=1,  add=1, cha=1, }
 		map.put("edit", "0");
 		map.put("del", "1");
 		map.put("add", "1");
 		map.put("cha", "1");
 		
		String keywords = pd.getString("keywords");
		if(null != keywords && !"".equals(keywords)){
			pd.put("keywords", keywords.trim());
		}
		String lastLoginStart = pd.getString("lastLoginStart");	//开始时间
		String lastLoginEnd = pd.getString("lastLoginEnd");		//结束时间
		if(lastLoginStart != null && !"".equals(lastLoginStart)){
			pd.put("lastLoginStart", lastLoginStart+" 00:00:00");
		}
		if(lastLoginEnd != null && !"".equals(lastLoginEnd)){
			pd.put("lastLoginEnd", lastLoginEnd+" 00:00:00");
		}
		if(!"2".equals(pd.getString("TYPE"))){	//1：收信箱 2：发信箱
			pd.put("TYPE", 1);
		}
		pd.put("FROM_USERNAME", username);
		page.setPd(pd);
		List<PageData> varList =  fhsmsServiceImpl.list(page);
		
		mv.setViewName("system/fhsms/fhsms_list");
		mv.addObject("varList",varList);
		mv.addObject("pd",pd);
		mv.addObject("QX",map);
		return mv;
	}
	
	@RequestMapping("/goView")
	public ModelAndView goView() throws Exception{
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		if("1".equals(pd.getString("TYPE")) && "2".equals(pd.getString("STARUS"))){
			fhsmsServiceImpl.edit(pd);
		}
		pd = fhsmsServiceImpl.findById(pd);
		mv.setViewName("system/fhsms/fhsms_view");
		mv.addObject("pd",pd);
		return mv;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
