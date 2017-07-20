package com.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.entity.system.Role;
import com.ssm.mapper.SysRoleMapper;
import com.ssm.mapper.SysUserMapper;
import com.ssm.po.SysRole;
import com.ssm.po.SysRoleExample;
import com.ssm.po.SysRoleExample.Criteria;
import com.ssm.po.SysUser;
import com.ssm.po.SysUserExample;
import com.ssm.service.RoleService;
import com.ssm.util.PageData;
import com.ssm.util.RoleUtils;
/**
 * 角色
 * @author zhefeng.ning
 *
 */

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	private SysRoleMapper sysRoleMapper;
 	
	/**
	 * ROLE_ID
	 * 通过角色id查看角色信息
	 */
	@Override
	public PageData findObjectById(PageData pd) throws Exception {
		SysRole roleList = sysRoleMapper.selectByPrimaryKey(pd.getString("ROLE_ID").toString());
		RoleUtils roleUtils = new RoleUtils();
		pd = roleUtils.sysRoleToPd(roleList, pd);
		return pd;
	}

	/**
	 * 列出所有系统用户角色
	 */
	@Override
	public List<Role> listAllRolesByPId(PageData pd) throws Exception {
		SysRoleExample example = new SysRoleExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(pd.getString("ROLE_ID"));
		List<SysRole> sysRoleList = sysRoleMapper.selectByExample(example);
		List<Role> roleList = new ArrayList<Role>();
		for (int i = 0; i < sysRoleList.size(); i++) {
			roleList = RoleUtils.sysRoleToListRole(sysRoleList.get(i),roleList);
		}
		return roleList;
	}
	
	
	
	
	
	/*public List<Role> listAllRolesByPId(PageData pd) throws Exception {
		SysRoleExample example = new SysRoleExample();
		Criteria criteria = example.createCriteria();
		String roleId = pd.getString("ROLE_ID");
		String rights = sysRoleMapper.selectByPrimaryKey(roleId).getRights();
		criteria.andRightsEqualTo(rights);
		List<SysRole> sysRoleList = sysRoleMapper.selectByExample(example);
		List<Role> roleList = new ArrayList<Role>();
		for (int i = 0; i < sysRoleList.size(); i++) {
			roleList = RoleUtils.sysRoleToListRole(sysRoleList.get(i),roleList);
		}
		return roleList;
	}*/

	

	
	

}
