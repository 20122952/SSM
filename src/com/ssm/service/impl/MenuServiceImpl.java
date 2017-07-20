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
import com.ssm.util.MenuUtils;
import com.ssm.util.PageData;
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
			//不知道怎么判断hashmenu的状态
			menu.setHasMenu(true);
			menus.add(menu);
		}
		
		for (Menu menu : menus) {
			menu.setSubMenu(this.listAllMenuQx(menu.getMENU_ID()));
			menu.setTarget("treeFrame");
		}
		return menus;
	}

	/**
	 * 查询菜单
	 */
	@Override
	public List<Menu> listAllMenu(String MENU_ID) throws Exception {
		SysMenuExample example = new SysMenuExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(MENU_ID);
		List<SysMenu> sysMenuList = sysMenuMapper.selectByExample(example);
		List<Menu> menuList = MenuUtils.sysMenuListToMentList(sysMenuList);
		return menuList;
	}

	/**
	 * 通过id获取他的父节点
	 */
	@Override
	public PageData getMenuById(PageData pd) throws Exception {
		if("0".equals(pd.getString("MENU_ID"))){
			pd = MenuUtils.sysMenuToNull();
		}
		if(pd.getString("MENU_ID") != null && !"".equals(pd.getString("MENU_ID").trim())){
			SysMenu sysMenu = sysMenuMapper.selectByPrimaryKey(Integer.parseInt(pd.getString("MENU_ID")));
			pd = MenuUtils.sysMenuToPd(sysMenu);
		}else{
			pd = MenuUtils.sysMenuToNull();
		}
		return pd;
	}

	/**
	 * 通过MenuId获取ParentId的list
	 */
	@Override
	public List<Menu> listSubMenuByParentId(String menuId) throws Exception {
		SysMenuExample example = new SysMenuExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(menuId);
		List<SysMenu> sysMenuList = sysMenuMapper.selectByExample(example);
		List<Menu> menuList = MenuUtils.sysMenuListToMentList(sysMenuList);
		return menuList;
	}

	/**
	 * 更换图标
	 */
	@Override
	public PageData editicon(PageData pd) throws Exception {
		SysMenu sysMenu = sysMenuMapper.selectByPrimaryKey(Integer.parseInt(pd.getString("MENU_ID")));
		sysMenu.setMenuIcon(pd.getString("MENU_ICON"));
		sysMenu.setMenuId(Integer.parseInt(pd.getString("MENU_ID")));
		sysMenuMapper.updateByPrimaryKeySelective(sysMenu);
		pd = MenuUtils.sysMenuToPd(sysMenu);
		return pd;
	}

	/**
	 * 修改图标
	 */
	@Override
	public void edit(Menu menu) throws Exception {
		SysMenu sysMenu = MenuUtils.menuToSysMenu(menu);
		sysMenuMapper.updateByPrimaryKey(sysMenu);
	}

	/**
	 * 获取id最大的值
	 */
	@Override
	public PageData findMaxId(PageData pd) throws Exception {
		SysMenuExample example = new SysMenuExample();
		List<SysMenu> sysMenuList = sysMenuMapper.selectByExample(example);
		int menuIdMax = 0;
		for (SysMenu sysMenu : sysMenuList) {
			if(sysMenu.getMenuId() > menuIdMax){
				menuIdMax = sysMenu.getMenuId();
			}
		}
		pd.put("MID", menuIdMax);
		return pd;
	}

	/**
	 * 保存菜单
	 */
	@Override
	public void saveMenu(Menu menu) throws Exception {
		SysMenu sysMenu = MenuUtils.menuToSysMenu(menu);
		sysMenuMapper.insert(sysMenu);
	}

	/**
	 * 删除菜单
	 */
	@Override
	public void deleteMenuById(String menuId) throws Exception {
		sysMenuMapper.deleteByPrimaryKey(Integer.parseInt(menuId));
		
	}

}
