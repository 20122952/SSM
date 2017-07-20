package com.ssm.service;

import java.util.List;

import com.ssm.util.PageData;

/**
 * role-fhbutton接口
 * @author zhefeng.ning
 *
 */
public interface RoleFhbuttonService {

	/**
	 * 通过表sys_role_fhbutton 查询该该用户拥有的button权限
	 * @param pd
	 * @return
	 */
	List<String> listAllBrAndQxname(PageData pd) throws Exception;

}
