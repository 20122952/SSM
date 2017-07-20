package com.ssm.util;

import java.util.ArrayList;
import java.util.List;

import com.ssm.po.SysRoleFhbutton;

public class RoleFhbuttonUtils {

	
	
	public static List<PageData> RoleFhbuttonListToPdList(List<SysRoleFhbutton> roleFhbuttonList) {
		List<PageData> pdList = new ArrayList<PageData>();
		for (int i = 0; i < roleFhbuttonList.size(); i++) {
			PageData pd = new PageData();
			pd.put("BUTTON_ID", roleFhbuttonList.get(i).getButtonId());
			pd.put("RB_ID", roleFhbuttonList.get(i).getRbId());
			pd.put("ROLE_ID", roleFhbuttonList.get(i).getRoleId());
			pdList.add(pd);
		}
		return pdList;
	}

}
