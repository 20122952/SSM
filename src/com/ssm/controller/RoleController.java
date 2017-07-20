package com.ssm.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.entity.system.Role;
import com.ssm.service.RoleService;
import com.ssm.util.Const;
import com.ssm.util.PageData;

/**
 * RoleController 角色权限管理
 * @author zhefeng.ning
 * @创建时间 2017年4月19日 上午11:23:43
 */
@Controller
@RequestMapping("/role")
public class RoleController extends BaseController{
	
	@Autowired
	private RoleService roleServiceImpl;
	
	/**
	 * 展示按钮权限页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping
	public ModelAndView list()throws Exception{
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		try {
			HttpSession session = this.getRequest().getSession();
			String username = session.getAttribute("USERNAME").toString();
	 		Map<String, String> map = (Map<String, String>) session.getAttribute(username + Const.SESSION_QX);
	 		//edit=0, del=1,  add=1, cha=1, }
	 		map.put("edit", "1");
	 		map.put("del", "1");
	 		map.put("add", "1");
	 		map.put("cha", "1");
			pd = this.getPageData();
			if(pd.getString("ROLE_ID") == null || "".equals(pd.getString("ROLE_ID").trim())){
				pd.put("ROLE_ID", "1");
			}
			PageData fpd = new PageData();
			fpd.put("ROLE_ID", "0");
			List<Role> roleList = roleServiceImpl.listAllRolesByPId(fpd);
			List<Role> roleList_z = roleServiceImpl.listAllRolesByPId(pd);
			pd = roleServiceImpl.findObjectById(pd);
			mv.addObject("pd", pd);
			mv.addObject("roleList", roleList);
			mv.addObject("roleList_z", roleList_z);
			mv.addObject("QX",map);	//按钮权限
			mv.setViewName("system/role/role_list");
			
		} catch (Exception e) {
			logger.error(e.toString(), e);
		}
		
		return  mv;
	}

	/**
	 * 跳转到新增页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toAdd")
	public ModelAndView toAdd() throws Exception{
		ModelAndView mv= new ModelAndView();
		PageData pd = new PageData();
		try{
			pd = this.getPageData();
			mv.addObject("msg", "add");
			mv.setViewName("system/role/role_edit");
			mv.addObject("pd", pd);
		} catch(Exception e){
			logger.error(e.toString(), e);
		}
		return mv;
	}
	
	
	/**请求编辑
	 * @param ROLE_ID
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/toEdit")
	public ModelAndView toEdit( String ROLE_ID )throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		try{
			pd = this.getPageData();
			pd.put("ROLE_ID", ROLE_ID);
			pd = roleServiceImpl.findObjectById(pd);
			mv.addObject("msg", "edit");
			mv.addObject("pd", pd);
			mv.setViewName("system/role/role_edit");
		} catch(Exception e){
			logger.error(e.toString(), e);
		}
		return mv;
	}
	
}
