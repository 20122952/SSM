package com.ssm.service.impl;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.entity.system.User;
import com.ssm.mapper.SysUserMapper;
import com.ssm.po.SysUser;
import com.ssm.po.SysUserExample;
import com.ssm.po.SysUserExample.Criteria;
import com.ssm.service.UserService;
import com.ssm.util.PageData;
import com.ssm.util.UserUtils;
/**
 * User的Service层
 * @author zhefeng.ning
 *
 */

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public PageData getUserByNameAndPwd(PageData pd) throws Exception {
		PageData result;
		SysUserExample example = new SysUserExample();
		Criteria criteria = example.createCriteria();
		String username = pd.get("USERNAME").toString();
		String password = pd.get("PASSWORD").toString();
		criteria.andUsernameEqualTo(username);
		//criteria.andPasswordEqualTo(password);
		List<SysUser> SysUserList = sysUserMapper.selectByExample(example);
		if(SysUserList != null){
			SysUser sysUser = SysUserList.get(0);
			if(password.equals(sysUser.getPassword())){
				result = UserUtils.ListSysUserToPd(pd,sysUser);
			}else{
				result = null;
			}
		}else{
			result = null;
		}
		return result;
	}

	/**
	 * 更新登录时间
	 */
	@Override
	public void updateLastLogin(PageData pd) throws Exception {
		//String LastLogin = pd.get("").toString();
		SysUserExample example = new SysUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(pd.get("USERNAME").toString());
		//sysUserMapper.selectByExample(example);
		SysUser user = new SysUser();
		user.setLastLogin(new Date().toString());
		sysUserMapper.updateByExampleSelective(user, example);
	}

	/**通过用户ID获取用户信息和角色信息
	 * @param USER_ID
	 * @return
	 * @throws Exception
	 */
	@Override
	public User getUserAndRoleById(String user_ID) throws Exception{
		SysUser sysUser = sysUserMapper.selectByPrimaryKey(user_ID);
		User user = new User();
		UserUtils userUtils = new UserUtils();
		user = userUtils.sysUserToUser(sysUser, user);
		return user;
	}
	
	

	/**
	 * 更新IP
	 */
	 
	@Override
	public void saveIp(PageData pd) throws Exception{
		SysUserExample example = new SysUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(pd.get("USERNAME").toString());
		SysUser user = new SysUser();
		user.setIp(pd.get("IP").toString());
		sysUserMapper.updateByExampleSelective(user, example);
	}

	
}
