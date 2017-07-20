package com.ssm.util;

import java.util.ArrayList;
import java.util.List;

import com.ssm.entity.system.Role;
import com.ssm.po.SysRole;

public class RoleUtils {

	public Role sysRoleToUser(SysRole sysRole, Role role) {
		role.setADD_QX(sysRole.getAddQx());
		role.setCHA_QX(sysRole.getChaQx());
		role.setDEL_QX(sysRole.getDelQx());
		role.setEDIT_QX(sysRole.getEditQx());
		role.setPARENT_ID(sysRole.getParentId());
		role.setRIGHTS(sysRole.getRights());
		role.setROLE_ID(sysRole.getRoleId());
		role.setROLE_NAME(sysRole.getRoleName());
		return role;
	}

	public PageData sysRoleToPd(SysRole roleList, PageData pd) {
		pd.put("ADD_QX", roleList.getAddQx());
		pd.put("CHA_QX", roleList.getChaQx());
		pd.put("DEL_QX", roleList.getDelQx());
		pd.put("EDIT_QX", roleList.getEditQx());
		pd.put("PARENT_ID", roleList.getParentId());
		pd.put("RIGHTS", roleList.getRights());
		pd.put("ROLE_NAME", roleList.getRoleName());
		return pd;
	}

	public static List<Role> sysRoleToListRole(SysRole sysRoleList, List<Role> roleList) {
		Role role = new Role(); 
		role.setADD_QX(sysRoleList.getAddQx());
		role.setCHA_QX(sysRoleList.getChaQx());
		role.setDEL_QX(sysRoleList.getDelQx());
		role.setEDIT_QX(sysRoleList.getEditQx());
		role.setPARENT_ID(sysRoleList.getParentId());
		role.setRIGHTS(sysRoleList.getRights());
		role.setROLE_ID(sysRoleList.getRoleId());
		role.setROLE_NAME(sysRoleList.getRoleName());
		roleList.add(role);
		return roleList;
	}

	public static List<PageData> sysRoleListToPdList(List<SysRole> roleList) {
		List<PageData> pdList = new ArrayList<PageData>();
		for (int i = 0; i < roleList.size(); i++) {
			PageData pd = new PageData();
			pd.put("ROLE_ID", roleList.get(i).getRoleId());
			pd.put("ROLE_NAME", roleList.get(i).getRoleName());
			pd.put("RIGHTS", roleList.get(i).getRights());
			pd.put("PARENT_ID", roleList.get(i).getParentId());
			pd.put("ADD_QX", roleList.get(i).getAddQx());
			pd.put("DEL_QX", roleList.get(i).getDelQx());
			pd.put("EDIT_QX", roleList.get(i).getEditQx());
			pd.put("CHA_QX", roleList.get(i).getChaQx());
			pdList.add(pd);
		}
		return pdList;
	}


}
