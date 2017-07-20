package com.ssm.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.module.SimpleAbstractTypeResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.entity.Page;
import com.ssm.entity.system.Role;
import com.ssm.entity.system.User;
import com.ssm.mapper.SysRoleMapper;
import com.ssm.mapper.SysUserMapper;
import com.ssm.po.SysRole;
import com.ssm.po.SysUser;
import com.ssm.po.SysUserExample;
import com.ssm.po.SysUserExample.Criteria;
import com.ssm.service.UserService;
import com.ssm.util.PageData;
import com.ssm.util.RoleUtils;
import com.ssm.util.UserUtils;

/**
 * User的Service层
 * 
 * @author zhefeng.ning
 *
 */

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private SysUserMapper sysUserMapper;
	@Autowired
	private SysRoleMapper sysRoleMapper;

	@Override
	public PageData getUserByNameAndPwd(PageData pd) throws Exception {
		PageData result;
		SysUserExample example = new SysUserExample();
		Criteria criteria = example.createCriteria();
		String username = pd.get("USERNAME").toString();
		String password = pd.get("PASSWORD").toString();
		criteria.andUsernameEqualTo(username);
		// criteria.andPasswordEqualTo(password);
		List<SysUser> SysUserList = sysUserMapper.selectByExample(example);
		if (SysUserList != null) {
			SysUser sysUser = SysUserList.get(0);
			if (password.equals(sysUser.getPassword())) {
				result = UserUtils.ListSysUserToPd(pd, sysUser);
			} else {
				result = null;
			}
		} else {
			result = null;
		}
		return result;
	}

	/**
	 * 更新登录时间
	 */
	@Override
	public void updateLastLogin(PageData pd) throws Exception {
		// String LastLogin = pd.get("").toString();
		SysUserExample example = new SysUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(pd.get("USERNAME").toString());
		// sysUserMapper.selectByExample(example);
		SysUser user = new SysUser();
		user.setLastLogin(new Date().toString());
		sysUserMapper.updateByExampleSelective(user, example);
	}

	/**
	 * 通过用户ID获取用户信息和角色信息
	 * 
	 * @param USER_ID
	 * @return
	 * @throws Exception
	 */
	@Override
	public User getUserAndRoleById(String user_ID) throws Exception {
		SysUser sysUser = sysUserMapper.selectByPrimaryKey(user_ID);
		SysRole sysRole = sysRoleMapper.selectByPrimaryKey(sysUser.getRoleId());
		UserUtils userUtils = new UserUtils();
		RoleUtils roleUtils = new RoleUtils();
		Role role = new Role();
		role = roleUtils.sysRoleToUser(sysRole, role);
		User user = new User();
		user.setRole(role);
		user = userUtils.sysUserToUser(sysUser, user);
		return user;
	}

	/**
	 * 更新IP
	 */

	@Override
	public void saveIp(PageData pd) throws Exception {
		SysUserExample example = new SysUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(pd.get("USERNAME").toString());
		SysUser user = new SysUser();
		user.setIp(pd.get("IP").toString());
		sysUserMapper.updateByExampleSelective(user, example);
	}

	/**
	 * 获取用户数量
	 */
	@Override
	public int getUserCount() throws Exception {
		SysUserExample example = new SysUserExample();
		List<SysUser> sysUserList = sysUserMapper.selectByExample(example);
		int userNum = sysUserList.size();
		return userNum;
	}

	/**
	 * 获取角色信息
	 */
	@Override
	public String findByUsernameId(PageData pd) throws Exception {
		SysUserExample example = new SysUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(pd.get("USERNAME").toString());
		List<SysUser> list = sysUserMapper.selectByExample(example);
		String roleId = list.get(0).getRoleId();
		return roleId;
	}

	/**
	 * 用户列表
	 */
	@Override
	public List<PageData> listUsers(Page page) throws Exception {
		SysUserExample example = new SysUserExample();
		Criteria criteria = example.createCriteria();
		PageData pdOld = page.getPd();
		if (null != pdOld.getString("keywords") && !"".equals(pdOld.getString("keywords"))) {
			criteria.andNameEqualTo(pdOld.getString("keywords"));
		}

		String startLoginTime = pdOld.getString("lastLoginStart");
		String endLoginTime = pdOld.getString("lastLoginEnd");
		String roleIdInput = pdOld.getString("ROLE_ID");
		List<PageData> pdList = new ArrayList<PageData>();
		List<SysUser> userList = sysUserMapper.selectByExample(example);
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < userList.size(); i++) {
			PageData pd = new PageData();
			if ("admin".equals(userList.get(i).getUsername())) {
				userList.remove(i);
				i--;
				continue;
			} else if (null != startLoginTime && !"".equals(startLoginTime) && null != endLoginTime
					&& !"".equals(endLoginTime)) {
				long start = format.parse(startLoginTime).getTime();
				long end = format.parse(endLoginTime).getTime();
				long newTime = format.parse(userList.get(i).getLastLogin()).getTime();
				if (start <= newTime && start <= end && newTime <= end) {
					pd = UserUtils.ListSysUserToPd(pd, userList.get(i));
					String roleId = userList.get(i).getRoleId();
					String roleName = sysRoleMapper.selectByPrimaryKey(roleId).getRoleName();
					pd.put("ROLE_NAME", roleName);
					pdList.add(pd);
				} else {
					userList.remove(i);
					i--;
				}
			} else {
				pd = UserUtils.ListSysUserToPd(pd, userList.get(i));
				String roleId = userList.get(i).getRoleId();
				String roleName = sysRoleMapper.selectByPrimaryKey(roleId).getRoleName();
				pd.put("ROLE_NAME", roleName);
				pdList.add(pd);
			}
		}
		if (null != roleIdInput && !"".equals(roleIdInput)) {
			for (int j = 0; j < pdList.size(); j++) {
				if (roleIdInput.equals(pdList.get(j).getString("ROLE_ID"))) {

				} else {
					pdList.remove(j);
					j--;
				}
			}
		}
		return pdList;
	}

	/**
	 * 判断用户名是否存在
	 * 存在  --- true;
	 * 不存在 ---false;
	 */
	@Override
	public boolean findByUsername(PageData pd) throws Exception {
		String username = pd.getString("USERNAME");
		SysUserExample example = new SysUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<SysUser> sysUserList = sysUserMapper.selectByExample(example);
		if (sysUserList.size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * 判断邮箱是否存在
	 */
	@Override
	public boolean findByUserEmail(PageData pd) throws Exception {
		String email = pd.getString("EMAIL");
		SysUserExample example = new SysUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmailEqualTo(email);
		List<SysUser> sysUserList = sysUserMapper.selectByExample(example);
		if (sysUserList.size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * 判断编码是否存在
	 */
	@Override
	public boolean findByUserNum(PageData pd) throws Exception {
		String number = pd.getString("NUMBER");
		SysUserExample example = new SysUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andNumberEqualTo(number);
		List<SysUser> sysUserList = sysUserMapper.selectByExample(example);
		if (sysUserList.size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * 保存用户
	 */
	@Override
	public void saveU(PageData pd) throws Exception {
		SysUser user = new SysUser();
		SysUser userNew = UserUtils.pdToSysUser(pd,user);
		sysUserMapper.insert(userNew);
		
	}

	/**
	 *  根据ID读取获取当前一条数据
	 */
	@Override
	public PageData findById(PageData pd) throws Exception {
		SysUserExample example = new SysUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(pd.getString("USER_ID"));
		List<SysUser> userList = sysUserMapper.selectByExample(example);
		pd = UserUtils.ListSysUserToPd(pd, userList.get(0));
		return pd;
	}

	/**
	 *  修改edit用户的save
	 */
	@Override
	public void editU(PageData pd) throws Exception {
		SysUser user = new SysUser();
		SysUser userNew = UserUtils.pdToSysUser(pd,user);
		sysUserMapper.updateByPrimaryKey(userNew);
	}

	/**
	 * 删除用户
	 */
	@Override
	public void deleteU(PageData pd) throws Exception {
		sysUserMapper.deleteByPrimaryKey(pd.getString("USER_ID"));
	}

	/**
	 * 获取当前用户
	 */
	@Override
	public PageData listUsernamefindById(PageData pd) throws Exception {
		SysUserExample example = new SysUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(pd.getString("USERNAME"));
		List<SysUser> listUser = sysUserMapper.selectByExample(example);
		pd = UserUtils.ListSysUserToPd(pd, listUser.get(0));
		return pd;
	}

	/**
	 * 获取所有用户
	 */
	@Override
	public List<PageData> listAllUser(PageData pdOld) throws Exception {
		SysUserExample example = new SysUserExample();
		Criteria criteria = example.createCriteria();
		if (null != pdOld.getString("keywords") && !"".equals(pdOld.getString("keywords"))) {
			criteria.andNameEqualTo(pdOld.getString("keywords"));
		}

		String startLoginTime = pdOld.getString("lastLoginStart");
		String endLoginTime = pdOld.getString("lastLoginEnd");
		String roleIdInput = pdOld.getString("ROLE_ID");
		List<PageData> pdList = new ArrayList<PageData>();
		//以条件keywords查询出来的list
		List<SysUser> userList = sysUserMapper.selectByExample(example);
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < userList.size(); i++) {
			PageData pd = new PageData();
			if ("admin".equals(userList.get(i).getUsername())) {
				userList.remove(i);
				i--;
				continue;
			} else if (null != startLoginTime && !"".equals(startLoginTime) && null != endLoginTime
					&& !"".equals(endLoginTime)) {
				long start = format.parse(startLoginTime).getTime();
				long end = format.parse(endLoginTime).getTime();
				long newTime = format.parse(userList.get(i).getLastLogin()).getTime();
				if (start <= newTime && start <= end && newTime <= end) {
					pd = UserUtils.ListSysUserToPd(pd, userList.get(i));
					String roleId = userList.get(i).getRoleId();
					String roleName = sysRoleMapper.selectByPrimaryKey(roleId).getRoleName();
					pd.put("ROLE_NAME", roleName);
					pdList.add(pd);
				} else {
					userList.remove(i);
					i--;
				}
			} else {
				pd = UserUtils.ListSysUserToPd(pd, userList.get(i));
				String roleId = userList.get(i).getRoleId();
				String roleName = sysRoleMapper.selectByPrimaryKey(roleId).getRoleName();
				pd.put("ROLE_NAME", roleName);
				pdList.add(pd);
			}
		}
		if (null != roleIdInput && !"".equals(roleIdInput)) {
			for (int j = 0; j < pdList.size(); j++) {
				if (roleIdInput.equals(pdList.get(j).getString("ROLE_ID"))) {

				} else {
					pdList.remove(j);
					j--;
				}
			}
		}
		return pdList;
	}

	/**
	 * 判断邮箱是否存在
	 */
	@Override
	public PageData findByUE(PageData pd) throws Exception {
		SysUserExample example = new SysUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmailEqualTo(pd.getString("EMAIL"));
		List<SysUser> userList = sysUserMapper.selectByExample(example);
		if(userList.size() == 0){
			pd = null;
		}else{
			pd = UserUtils.ListSysUserToPd(pd, userList.get(0));
		}
		return pd;
	}

	/**
	 * 通过编号获取数据
	 */
	@Override
	public PageData findByUN(PageData pd) throws Exception {
		SysUserExample example = new SysUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(pd.getString("NUMBER"));
		List<SysUser> userList = sysUserMapper.selectByExample(example);
		if(userList.size() == 0){
			pd = null;
		}else{
			pd = UserUtils.ListSysUserToPd(pd, userList.get(0));
		}
		return pd;
	}

	/**
	 * 查询用户
	 */
	@Override
	public PageData findByUsernameList(PageData pd) throws Exception {
		SysUserExample example = new SysUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(pd.getString("USERNAME"));
		List<SysUser> userList = sysUserMapper.selectByExample(example);
		pd = UserUtils.ListSysUserToPd(pd, userList.get(0));
		return pd;
	}

	
	
}
