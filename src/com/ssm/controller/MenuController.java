package com.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.entity.system.Menu;
import com.ssm.service.MenuService;
import com.ssm.util.AppUtil;
import com.ssm.util.Const;
import com.ssm.util.PageData;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("/menu")
public class MenuController extends BaseController{
	
	@Autowired
	private MenuService menuServiceImpl;
	
	/**
	 * 调到菜单主页面
	 * @param model
	 * @param MENU_ID
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/listAllMenu")
	public ModelAndView listAllMenu(Model model,String MENU_ID) throws Exception{
		ModelAndView mv = new ModelAndView();
		try {
			JSONArray arr = JSONArray.fromObject(menuServiceImpl.listAllMenu("0"));
			String json = arr.toString();
			json = json.replaceAll("MENU_ID", "id").replaceAll("PARENT_ID", "pId").replaceAll("MENU_NAME", "name").replaceAll("subMenu", "nodes").replaceAll("hasMenu", "checked").replaceAll("MENU_URL", "url");
			model.addAttribute("zTreeNodes", json);
			mv.addObject("MENU_ID",MENU_ID);
			mv.setViewName("system/menu/menu_ztree");
		} catch (Exception e) {
			logger.error(e.toString(), e);
		}
		return mv;
	}
	
	/**
	 * 显示菜单列表
	 * @return
	 * @throws Exception
	 */
	@RequestMapping
	public ModelAndView list() throws Exception{
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		try {
			HttpSession session = this.getRequest().getSession();
			String username = session.getAttribute("USERNAME").toString();
	 		Map<String, String> map = (Map<String, String>) session.getAttribute(username + Const.SESSION_QX);
	 		//edit=0, del=1,  add=1, cha=1, }
	 		map.put("edit", "1");
	 		map.put("del", "1");
	 		map.put("add", "1");
	 		map.put("cha", "1");
			String menuId = "";
			if(null == pd.get("MENU_ID") || "".equals(pd.getString("MENU_ID"))){
				menuId = "0";
			}else{
				menuId = pd.getString("MENU_ID");
			}
			List<Menu> menuList = menuServiceImpl.listSubMenuByParentId(menuId);
			mv.addObject("pd", menuServiceImpl.getMenuById(pd));	//传入父菜单所有信息
			mv.addObject("MENU_ID", menuId);
			mv.addObject("MSG", null == pd.get("MSG")?"list":pd.get("MSG").toString()); //MSG=change 则为编辑或删除后跳转过来的
			mv.addObject("menuList", menuList);
			mv.addObject("QX",map);	//按钮权限
			mv.setViewName("system/menu/menu_list");
		} catch (Exception e) {
			logger.error(e.toString(), e);
		}
		return mv;
	}
	
	/**
	 * 请求编辑菜单图标页面
	 * @param MENU_ID
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toEditicon")
	public ModelAndView toEditicon(String MENU_ID) throws Exception{
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		try {
			pd = this.getPageData();
			pd.put("MENU_ID", MENU_ID);
			mv.addObject("pd",pd);
			mv.setViewName("system/menu/menu_icon");
		} catch (Exception e) {
			logger.error(e.toString(), e);
		}
		return mv;
	}
	
	/**
	 * 修改图标
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editicon")
	public ModelAndView editicon() throws Exception{
		logBefore(logger, "修改菜单图标");
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		try {
			pd = this.getPageData();
			pd = menuServiceImpl.editicon(pd);
			mv.addObject("msg","success");
		} catch (Exception e) {
			logger.error(e.toString(), e);
			mv.addObject("msg","failed");
		}
		
		mv.setViewName("save_result");
		return mv;
	}
	
	/**
	 * 修改图标信息
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toEdit")
	public ModelAndView toEdit(String id) throws Exception{
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		try {
			HttpSession session = this.getRequest().getSession();
			String username = session.getAttribute("USERNAME").toString();
	 		Map<String, String> map = (Map<String, String>) session.getAttribute(username + Const.SESSION_QX);
	 		map.put("edit", "1");
	 		map.put("del", "1");
	 		map.put("add", "1");
	 		map.put("cha", "1");
			pd = this.getPageData();
			pd.put("MENU_ID", id);
			pd = menuServiceImpl.getMenuById(pd);
			mv.addObject("pd",pd);
			pd.put("MENU_ID", pd.getString("PARENT_ID"));
			mv.addObject("pds",menuServiceImpl.getMenuById(pd));
			mv.addObject("MENU_ID", pd.get("PARENT_ID").toString());	//传入父菜单ID，作为子菜单的父菜单ID用
			mv.addObject("MSG", "edit");
			pd.put("MENU_ID",id);			//复原本菜单ID
			mv.addObject("QX",map);			//按钮权限
			mv.setViewName("system/menu/menu_edit");
		} catch (Exception e) {
			logger.error(e.toString(), e);
		}
		return mv;
	}
	
	/**
	 * 修改
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(Menu menu) throws Exception{
		logBefore(logger, "修改菜单");
		ModelAndView mv= this.getModelAndView();
		try {
			menuServiceImpl.edit(menu);
		} catch (Exception e) {
			logger.error(e.toString(), e);
		}
		mv.setViewName("redirect:?MSG='change'&MENU_ID="+menu.getPARENT_ID());
		return mv;
	}
	
	/**
	 * 跳转到添加页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toAdd")
	public ModelAndView toAdd() throws Exception{
		ModelAndView mv = new ModelAndView();
		try {
			PageData pd = new PageData();
			pd = this.getPageData();
			String menuId = "";
			if(null == pd.get("MENU_ID") || "".equals(pd.getString("MENU_ID"))){
				menuId = "0";
			}else{
				menuId = pd.getString("MENU_ID");
			}
			pd.put("MENU_ID",menuId);
			mv.addObject("pds", menuServiceImpl.getMenuById(pd));	//传入父菜单所有信息
			mv.addObject("MENU_ID", menuId);					//传入菜单ID，作为子菜单的父菜单ID用
			mv.addObject("MSG", "add");							//执行状态 add 为添加
			mv.setViewName("system/menu/menu_edit");
		} catch (Exception e) {
			logger.error(e.toString(), e);
		}
		return mv;
	}
	
	/**
	 * 添加
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/add")
	public ModelAndView add(Menu menu) throws Exception{
		logBefore(logger, "保存菜单");
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData(); 
		pd = this.getPageData();		
		try {
			menu.setMENU_ID(String.valueOf(Integer.parseInt(menuServiceImpl.findMaxId(pd).get("MID").toString())+1));
			menu.setMENU_ICON("menu-icon fa fa-leaf black");//默认菜单图标
			menuServiceImpl.saveMenu(menu); //保存菜单
		} catch (Exception e) {
			logger.error(e.toString(), e);
			mv.addObject("msg","failed");
		}
		mv.setViewName("redirect:?MSG='change'&MENU_ID="+menu.getPARENT_ID()); //保存成功跳转到列表页面
		return mv;
	}
	
	/**
	 * 删除菜单
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delete")
	public Object delete(@RequestParam String menuId) throws Exception{
		logBefore(logger, "删除菜单");
		Map<String,String> map = new HashMap<String, String>();
		String errinfo = "";
		try {
			if(menuServiceImpl.listSubMenuByParentId(menuId).size() > 0){
				errinfo = "false";
			}else{
				menuServiceImpl.deleteMenuById(menuId);
				errinfo = "success";
			}
		} catch (Exception e) {
			logger.error(e.toString(), e);
		}
		
		map.put("result", errinfo);
		
		return AppUtil.returnObject(new PageData(), map);
		
	}
	
	
	
	
	
	
	
	
	
}
