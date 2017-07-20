package com.ssm.service;

import java.util.List;

import com.ssm.entity.Page;
import com.ssm.entity.system.Role;
import com.ssm.entity.system.User;
import com.ssm.po.SysUser;
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
	/**
	 * 通过角色id获取角色
	 * @param user_ID
	 * @return
	 * @throws Exception
	 */

	public User getUserAndRoleById(String user_ID) throws Exception;

	/**
	 * 保存登陆的IP
	 * @param pd
	 * @throws Exception
	 */
	public void saveIp(PageData pd) throws Exception;

	/**
	 * 获取用户的数量
	 * @return
	 * @throws Exception
	 */
	public int getUserCount() throws Exception;
	/**
	 * 获取传来的用户的角色信息
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public String findByUsernameId(PageData pd) throws Exception;

	/**
	 * 用户列表
	 * @param page
	 * @return
	 * @throws Exception
	 */
	public List<PageData> listUsers(Page page) throws Exception;

	/**
	 * 判断用户名是否存在
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public boolean findByUsername(PageData pd) throws Exception;
	/**
	 * 判断邮箱是否存在
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public boolean findByUserEmail(PageData pd) throws Exception;

	/**
	 * 判断编码是否存在
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public boolean findByUserNum(PageData pd) throws Exception;

	/**
	 * 保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveU(PageData pd) throws Exception;

	/**
	 * 根据ID读取获取当前一条数据
	 * @param pd
	 * @return
	 */
	public PageData findById(PageData pd) throws Exception;

	/**
	 * 修改edit用户的save
	 * @param pd
	 */
	public void editU(PageData pd) throws Exception;

	/**
	 * 删除用户
	 * @param pd
	 */
	public void deleteU(PageData pd) throws Exception;

	/**
	 * 获取当前用户
	 * @param pd
	 * @return
	 */
	public PageData listUsernamefindById(PageData pd) throws Exception;

	/**
	 * 获取所有用户
	 * @param pd
	 * @return
	 */
	public List<PageData> listAllUser(PageData pd) throws Exception;

	/**
	 * 判断邮箱是否存在
	 * @param pd
	 * @return
	 */
	public PageData findByUE(PageData pd) throws Exception;

	/**
	 * 编号获取数据是否存在
	 * @param pd
	 * @return
	 */
	public PageData findByUN(PageData pd) throws Exception;

	/**
	 * 查询用户
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUsernameList(PageData pd) throws Exception;

}
