package com.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.SysRoleFhbuttonMapper;
import com.ssm.mapper.SysRoleMapper;
import com.ssm.po.SysRole;
import com.ssm.po.SysRoleFhbutton;
import com.ssm.po.SysRoleFhbuttonExample;
import com.ssm.po.SysRoleFhbuttonExample.Criteria;
import com.ssm.service.ButtonrightsService;
import com.ssm.util.PageData;
import com.ssm.util.RoleFhbuttonUtils;
import com.ssm.util.RoleUtils;

@Service
public class ButtonrightsServiceImpl implements ButtonrightsService{

	@Autowired
	private SysRoleFhbuttonMapper roleFhbuttonMapper;
	@Autowired
	private SysRoleMapper roleMapper;
	
	/**
	 *  列出所有角色按钮关联数据
	 */
	@Override
	public List<PageData> listAll(PageData pd) throws Exception {
		SysRoleFhbuttonExample example = new SysRoleFhbuttonExample();
		List<SysRoleFhbutton> roleFhbuttonList = roleFhbuttonMapper.selectByExample(example);
		List<PageData> pdList = RoleFhbuttonUtils.RoleFhbuttonListToPdList(roleFhbuttonList);
		
		
		
		/*
		 * 		
		 Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(pd.getString("ROLE_ID"));
		List<SysRoleFhbutton> roleFhbuttonList = roleFhbuttonMapper.selectByExample(example);
		List<SysRole> roleList = new ArrayList<SysRole>();
		for (SysRoleFhbutton sysRoleFhbutton : roleFhbuttonList) {
			SysRole role = roleMapper.selectByPrimaryKey(sysRoleFhbutton.getButtonId());
			roleList.add(role);
		}
		List<PageData> pdList = RoleUtils.sysRoleListToPdList(roleList);*/
		return pdList;
	}

}
