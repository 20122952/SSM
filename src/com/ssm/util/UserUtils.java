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
		pd.put("USERNAME", sysUser.getUsername());
		pd.put("PASSWORD", sysUser.getPassword());
		pd.put("NAME", sysUser.getName());
		pd.put("RIGHTS", sysUser.getRights());
		pd.put("ROLE_ID", sysUser.getRoleId());
		pd.put("LAST_LOGIN", sysUser.getLastLogin());
		pd.put("IP", sysUser.getIp());
		pd.put("STATUS", sysUser.getStatus());
		pd.put("BZ", sysUser.getBz());
		pd.put("SKIN", sysUser.getSkin());
		pd.put("EMAIL", sysUser.getEmail());
		pd.put("NUMBER", sysUser.getNumber());
		pd.put("PHONE", sysUser.getPhone());
		return pd;
	}

	/**
	 * pd集合里的数据存到sysUser里
	 * @param pd
	 * @param user
	 * @return
	 */
	public static SysUser pdToSysUser(PageData pd, SysUser user) {
		
		user.setUserId(pd.getString("USER_ID"));
		user.setUsername(pd.getString("USERNAME"));
		user.setPassword(pd.getString("PASSWORD"));
		user.setRights(pd.getString("RIGHTS"));
		user.setRoleId(pd.getString("ROLE_ID"));
		user.setLastLogin(pd.getString("LAST_LOGIN"));
		user.setIp(pd.getString("IP"));
		user.setStatus(pd.getString("STATUS"));
		user.setSkin(pd.getString("SKIN"));
		user.setBz(pd.getString("BZ"));
		user.setEmail(pd.getString("EMAIL"));
		user.setNumber(pd.getString("NUMBER"));
		user.setPhone(pd.getString("PHONE"));
		user.setName(pd.getString("NAME"));
		
		return user;
		
	}



}
