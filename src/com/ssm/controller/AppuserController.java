package com.ssm.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.entity.Page;
import com.ssm.entity.system.Role;
import com.ssm.service.AppUserService;
import com.ssm.service.RoleService;
import com.ssm.util.Const;
import com.ssm.util.PageData;

@Controller
@RequestMapping("/happuser")
public class AppuserController extends BaseController{
	
	@Autowired
	private AppUserService appUserServiceImpl;
	@Autowired
	private RoleService roleServiceImpl;
	
	/**
	 * 会员的全部用户
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/listUsers")
	public ModelAndView listUsers(Page page)throws Exception{
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		HttpSession session = this.getRequest().getSession();
		String username = session.getAttribute("USERNAME").toString();
 		Map<String, String> map = (Map<String, String>) session.getAttribute(username + Const.SESSION_QX);
 		//edit=0, del=1,  add=1, cha=1, }
 		map.put("edit", "1");
 		map.put("del", "1");
 		map.put("add", "1");
 		map.put("cha", "1");
		pd = this.getPageData();
		String keywords = pd.getString("keywords");							//检索条件 关键词
		if(null != keywords && !"".equals(keywords)){
			pd.put("keywords", keywords.trim());
		}
		page.setPd(pd);
		List<PageData>	userList = appUserServiceImpl.listPdPageUser(page);
		pd.put("ROLE_ID", "2");
		List<Role> roleList = roleServiceImpl.listAllRolesByPId(pd);
		mv.setViewName("system/appuser/appuser_list");
		mv.addObject("userList", userList);
		mv.addObject("roleList", roleList);
		mv.addObject("pd", pd);
		mv.addObject("QX", map);
		
		return mv;
	}

}
