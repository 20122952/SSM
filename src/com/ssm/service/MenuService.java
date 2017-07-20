package com.ssm.service;

import java.util.List;

import com.ssm.entity.system.Menu;
import com.ssm.util.PageData;

public interface MenuService {

	/**
	 * @param MENU_ID
	 * @return
	 * @throws Exception
	 */
	public List<Menu> listAllMenuQx(String MENU_ID) throws Exception;

	/**
	 * 查询菜单
	 * @param string
	 * @return
	 * @throws Exception
	 */
	public List<Menu> listAllMenu(String MENU_ID) throws Exception;

	/**
	 * 通过id获取他的父节点
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData getMenuById(PageData pd) throws Exception;

	/**
	 * 通过MenuId获取ParentId的list
	 * @param menuId
	 * @return
	 * @throws Exception
	 */
	public List<Menu> listSubMenuByParentId(String menuId) throws Exception;

	/**
	 * 更换图标
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData editicon(PageData pd)throws Exception;

	/**
	 * 修改图标
	 * @param menu
	 */
	public void edit(Menu menu) throws Exception;

	/**
	 * 获取id最大的值
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findMaxId(PageData pd) throws Exception;

	/**
	 * 保存菜单
	 * @param menu
	 * @throws Exception
	 */
	public void saveMenu(Menu menu) throws Exception;

	/**
	 * 删除菜单
	 * @param menuId
	 * @throws Exception
	 */
	public void deleteMenuById(String menuId) throws Exception;

}
