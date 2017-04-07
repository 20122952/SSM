package com.ssm.service;

import java.util.List;

import com.ssm.entity.system.Menu;

public interface MenuService {

	/**
	 * @param MENU_ID
	 * @return
	 * @throws Exception
	 */
	public List<Menu> listAllMenuQx(String MENU_ID) throws Exception;

}
