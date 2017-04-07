package com.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.entity.system.Menu;
import com.ssm.mapper.SysMenuMapper;
import com.ssm.po.SysMenu;
import com.ssm.po.SysMenuExample;
import com.ssm.po.SysMenuExample.Criteria;
import com.ssm.service.MenuService;
/**
 * 菜单
 * @author zhefeng.ning
 *
 */
@Service
public class MenuServiceImpl implements MenuService{

	@Autowired
	private SysMenuMapper sysMenuMapper;
	
	
	
	
	/**
	 * 获取所有菜单并填充每个菜单的子菜单列表(菜单管理)(递归处理)
	 * @param MENU_ID
	 * @return
	 * @throws Exception
	 */
	
	@Override
	public List<Menu> listAllMenuQx(String MENU_ID) throws Exception {
		
		SysMenuExample example = new SysMenuExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(MENU_ID);
		List<SysMenu> menuList = sysMenuMapper.selectByExample(example);
		List<Menu> menus = new ArrayList<Menu>();
		for (int i = 0; i < menuList.size(); i++) {
			Menu menu = new Menu();
			menu.setMENU_ID(menuList.get(i).getMenuId().toString());
			menu.setMENU_NAME(menuList.get(i).getMenuName());
			menu.setMENU_URL(menuList.get(i).getMenuUrl());
			menu.setPARENT_ID(MENU_ID);
			menu.setMENU_ORDER(menuList.get(i).getMenuOrder());
			menu.setMENU_ICON(menuList.get(i).getMenuIcon());
			menu.setMENU_TYPE(menuList.get(i).getMenuType());
			menu.setMENU_STATE(menuList.get(i).getMenuState().toString());
			menus.add(menu);
		}
		
		for (Menu menu : menus) {
			menu.setSubMenu(this.listAllMenuQx(menu.getMENU_ID()));
			menu.setTarget("treeFrame");
		}
		return menus;
	}

}
