package com.ssm.service;

import java.util.List;

import com.ssm.entity.system.Role;
import com.ssm.util.PageData;

/**
 * 
 * @author zhefeng.ning
 *
 */
public interface RoleService {

	/**
	 * ROLE_ID
	 * 通过角色id查看角色信息
	 */
	public PageData findObjectById(PageData pd) throws Exception;

	/**
	 * 列出所有系统用户角色
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<Role> listAllRolesByPId(PageData pd) throws Exception;


}
