package com.ssm.controller;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.ssm.entity.Page;
import com.ssm.service.FhbuttonService;
import com.ssm.util.Const;
import com.ssm.util.PageData;

/**
 * button权限
 * @author zhefeng.ning
 * @创建时间 2017年4月18日 上午9:24:28
 */

@Controller
@RequestMapping("/fhbutton")
public class FhbuttonController extends BaseController{

	@Autowired
	private FhbuttonService fhbuttonServiceImpl;
	
	@RequestMapping("/list")
	public ModelAndView list(Page page) throws Exception{
		logBefore(logger, "列表Fhbutton");
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		HttpSession session = this.getRequest().getSession();
		String username = session.getAttribute("USERNAME").toString();
 		Map<String, String> map = (Map<String, String>) session.getAttribute(username + Const.SESSION_QX);
 		//edit=0, del=1,  add=1, cha=1, }
 		map.put("edit", "1");
 		map.put("del", "1");
 		map.put("add", "1");
 		map.put("cha", "1");
		String keywords = pd.getString("keywords");
		if(null != keywords && !"".equals(keywords)){
			pd.put("keywords", keywords.trim());
		}
		page.setPd(pd);
		List<PageData>	varList = fhbuttonServiceImpl.list(page);
		mv.setViewName("system/fhbutton/fhbutton_list");
		mv.addObject("varList", varList);
		mv.addObject("pd", pd);
		mv.addObject("QX",map);	//按钮权限
		return mv;
	}
	
	/**
	 * 跳转到修改页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/goEdit")
	public ModelAndView goEdit()throws Exception{
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd = fhbuttonServiceImpl.findById(pd);
		mv.setViewName("system/fhbutton/fhbutton_edit");
		mv.addObject("msg", "edit");
		mv.addObject("pd",pd);
		return mv;
	} 
	
	/**
	 * 跳转到添加页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/goAdd")
	public ModelAndView goAdd()throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		mv.setViewName("system/fhbutton/fhbutton_edit");
		mv.addObject("msg", "save");
		mv.addObject("pd", pd);
		return mv;
	}
	
	/**
	 * save按钮
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/save")
	public ModelAndView save() throws Exception{
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("FHBUTTON_ID", this.get32UUID());
		fhbuttonServiceImpl.save(pd);
		mv.setViewName("save_result");
		mv.addObject("msg","success");
		return mv;
	}
	
	/**
	 * delete button
	 * @param out
	 * @throws Exception
	 */
	@RequestMapping("/delete")
	public void delete(PrintWriter out) throws Exception{
		logBefore(logger, "删除Fhbutton");
		try {
			PageData pd = new PageData();
			pd = this.getPageData();
			fhbuttonServiceImpl.delete(pd);
			out.write("success");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			out.close();
		}
	}
	
	@RequestMapping("/edit")
	public ModelAndView edit()throws Exception{
		logBefore(logger, "修改Fhbutton");
		ModelAndView mv= new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		fhbuttonServiceImpl.edit(pd);
		mv.addObject("msg","success");
		mv.setViewName("save_result");
		return mv;
	}
	
	
	
	
	
	
	
	
}
