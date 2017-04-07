package com.ssm.util;

import com.ssm.entity.system.User;
import com.ssm.po.SysUser;

public class UserUtils {

	public User sysUserToUser(SysUser sysUser, User user){
		user.setUSER_ID(sysUser.getUserId());
		user.setUSERNAME(sysUser.getUsername());
		user.setPASSWORD(sysUser.getPassword());
		user.setNAME(sysUser.getName());
		user.setRIGHTS(sysUser.getRights());
		user.setROLE_ID(sysUser.getRoleId());
		user.setLAST_LOGIN(sysUser.getLastLogin());
		user.setIP(sysUser.getIp());
		user.setSTATUS(sysUser.getStatus());
		return user;
	}

	/**
	 * 把sysUser里的数据抛到pd集合里
	 * @param pd
	 * @param sysUser
	 * @return
	 */
	public static PageData ListSysUserToPd(PageData pd, SysUser sysUser) {
		pd.put("USER_ID", sysUser.getUserId());
		pd.put("NAME", sysUser.getName());
		pd.put("RIGHTS", sysUser.getRights());
		pd.put("ROLE_ID", sysUser.getRoleId());
		pd.put("LAST_LOGIN", sysUser.getLastLogin());
		pd.put("IP", sysUser.getIp());
		pd.put("STATUS", sysUser.getStatus());
		return pd;
	}

}
