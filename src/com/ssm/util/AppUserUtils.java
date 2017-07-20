package com.ssm.util;

import java.util.ArrayList;
import java.util.List;

import com.ssm.po.SysAppUser;

/**
 * 会员用户的工具类
 * @author zhefeng.ning
 * @创建时间 2017年4月18日 上午10:42:22
 */
public class AppUserUtils {

	/**
	 * appUserListToPdList
	 * @param sysAppUserList
	 * @return
	 */
	public static List<PageData> appUserListToPdList(List<SysAppUser> sysAppUserList) {
		List<PageData> pdList = new ArrayList<PageData>();
		for (int i = 0; i < sysAppUserList.size(); i++) {
			PageData pd = new PageData();
			pd.put("BZ", sysAppUserList.get(i).getBz());
			pd.put("EMAIL", sysAppUserList.get(i).getEmail());
			pd.put("END_TIME", sysAppUserList.get(i).getEndTime());
			pd.put("IP", sysAppUserList.get(i).getIp());
			pd.put("LAST_LOGIN", sysAppUserList.get(i).getLastLogin());
			pd.put("NAME", sysAppUserList.get(i).getName());
			pd.put("NUMBER", sysAppUserList.get(i).getNumber());
			pd.put("PASSWORD", sysAppUserList.get(i).getPassword());
			pd.put("PHONE", sysAppUserList.get(i).getPhone());
			pd.put("RIGHTS", sysAppUserList.get(i).getRights());
			pd.put("ROLE_ID", sysAppUserList.get(i).getRoleId());
			pd.put("SFID", sysAppUserList.get(i).getSfid());
			pd.put("START_TIME", sysAppUserList.get(i).getStartTime());
			pd.put("STATUS", sysAppUserList.get(i).getStatus());
			pd.put("USER_ID", sysAppUserList.get(i).getUserId());
			pd.put("USERNAME", sysAppUserList.get(i).getUsername());
			pd.put("YEARS", sysAppUserList.get(i).getYears());
			pdList.add(pd);
		}
		return pdList;
	}

}
