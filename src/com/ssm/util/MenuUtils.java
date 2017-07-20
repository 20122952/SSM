package com.ssm.util;

import java.util.ArrayList;
import java.util.List;

import com.ssm.entity.system.Menu;
import com.ssm.po.SysMenu;

/**
 * 菜单工具类
 * @author zhefeng.ning
 * @创建时间 2017年4月20日 上午11:00:29
 */
public class MenuUtils {

	public static List<Menu> sysMenuListToMentList(List<SysMenu> sysMenuList) {
		List<Menu> menuList = new ArrayList<Menu>();
		for (SysMenu sysMenu : sysMenuList) {
			Menu menu = new Menu();
			menu.setMENU_ID(sysMenu.getMenuId().toString());
			menu.setMENU_NAME(sysMenu.getMenuName());
			menu.setMENU_URL(sysMenu.getMenuUrl());
			menu.setPARENT_ID(sysMenu.getParentId());
			menu.setMENU_ORDER(sysMenu.getMenuOrder());
			menu.setMENU_ICON(sysMenu.getMenuIcon());
			menu.setMENU_TYPE(sysMenu.getMenuType());
			menu.setMENU_STATE(sysMenu.getMenuState().toString());
			menuList.add(menu);
		}
		return menuList;
	}

	
	public static PageData sysMenuToPd(SysMenu sysMenu) {
		PageData pd = new PageData();
		pd.put("MENU_ID", sysMenu.getMenuId());
		pd.put("MENU_NAME", sysMenu.getMenuName());
		pd.put("MENU_URL", sysMenu.getMenuUrl());
		pd.put("PARENT_ID", sysMenu.getParentId());
		pd.put("MENU_ORDER", sysMenu.getMenuOrder());
		pd.put("MENU_ICON", sysMenu.getMenuIcon());
		pd.put("MENU_TYPE", sysMenu.getMenuType());
		pd.put("MENU_STATE", sysMenu.getMenuState());
		return pd;
	}


	public static PageData sysMenuToNull() {
		PageData pd = new PageData();
		pd.put("MENU_ID",  null);
		pd.put("MENU_NAME", null);
		pd.put("MENU_URL", null);
		pd.put("PARENT_ID", null);
		pd.put("MENU_ORDER",null);
		pd.put("MENU_ICON", null);
		pd.put("MENU_TYPE", null);
		pd.put("MENU_STATE", null);
		return pd;
	}


	public static SysMenu menuToSysMenu(Menu menu) {
		SysMenu sysMenu = new SysMenu();
		sysMenu.setMenuIcon(menu.getMENU_ICON());
		sysMenu.setMenuId(Integer.parseInt(menu.getMENU_ID()));
		sysMenu.setMenuName(menu.getMENU_NAME());
		sysMenu.setMenuOrder(menu.getMENU_ORDER());
		sysMenu.setMenuState(Integer.parseInt(menu.getMENU_STATE()));
		sysMenu.setMenuType(menu.getMENU_TYPE());
		sysMenu.setMenuUrl(menu.getMENU_URL());
		sysMenu.setParentId(menu.getPARENT_ID());
		return sysMenu;
	}


}
