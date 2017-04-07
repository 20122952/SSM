package com.ssm.service;

import java.util.List;

import com.ssm.entity.system.Menu;
import com.ssm.entity.system.User;
import com.ssm.util.PageData;

public interface UserService {

	/**
	 * 密码审核
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData getUserByNameAndPwd(PageData pd) throws Exception;

	/**
	 * 更新登陆time
	 * @param pd
	 * @throws Exception
	 */
	
	public void updateLastLogin(PageData pd) throws Exception;


	public User getUserAndRoleById(String user_ID) throws Exception;

	public void saveIp(PageData pd) throws Exception;
	
}
