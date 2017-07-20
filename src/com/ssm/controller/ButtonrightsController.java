package com.ssm.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.entity.system.Role;
import com.ssm.service.ButtonrightsService;
import com.ssm.service.FhbuttonService;
import com.ssm.service.RoleService;
import com.ssm.util.Const;
import com.ssm.util.PageData;

@Controller
@RequestMapping("/buttonrights")
public class ButtonrightsController extends BaseController{

	@Autowired
	private RoleService roleServiceImpl;
	@Autowired
	private FhbuttonService fhbuttonServiceImpl;
	@Autowired
	private ButtonrightsService buttonrightsServiceImpl;
	/**
	 * 跳转到按钮权限页面
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/list")
	public ModelAndView list() throws Exception{
		HttpSession session = this.getRequest().getSession();
		String username = session.getAttribute("USERNAME").toString();
 		Map<String, String> map = (Map<String, String>) session.getAttribute(username + Const.SESSION_QX);
 		//edit=0, del=1,  add=1, cha=1, }
 		map.put("edit", "1");
 		map.put("del", "1");
 		map.put("add", "1");
 		map.put("cha", "1");
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		if(pd.getString("ROLE_ID") == null || "".equals(pd.getString("ROLE_ID").trim())){
			pd.put("ROLE_ID", "1");
		}
		PageData fpd = new PageData();
		fpd.put("ROLE_ID", "0");
		List<Role> roleList = roleServiceImpl.listAllRolesByPId(fpd);
		List<Role> roleList_z = roleServiceImpl.listAllRolesByPId(pd);
		List<PageData> buttonlist = fhbuttonServiceImpl.listAllButton(pd);
		List<PageData> roleFhbuttonlist = buttonrightsServiceImpl.listAll(pd);
		pd = roleServiceImpl.findObjectById(pd);
		
		mv.addObject("pd", pd);
		mv.addObject("roleList", roleList);
		mv.addObject("roleList_z", roleList_z);
		mv.addObject("buttonlist", buttonlist);
		mv.addObject("roleFhbuttonlist", roleFhbuttonlist);
		mv.addObject("QX",map);	//按钮权限
		mv.setViewName("system/buttonrights/buttonrights_list");
		return mv;
	}
}
