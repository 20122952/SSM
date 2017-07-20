package com.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.SysFhbuttonMapper;
import com.ssm.mapper.SysRoleFhbuttonMapper;
import com.ssm.po.SysFhbutton;
import com.ssm.po.SysRoleFhbutton;
import com.ssm.po.SysRoleFhbuttonExample;
import com.ssm.po.SysRoleFhbuttonExample.Criteria;
import com.ssm.service.RoleFhbuttonService;
import com.ssm.util.PageData;

/**
 * role-fhbutton  Servie
 * @author zhefeng.ning
 *
 */

@Service
public class RoleFhbuttonServiceImpl implements RoleFhbuttonService {

	@Autowired
	private SysRoleFhbuttonMapper roleFhbuttonMapper;
	@Autowired
	private SysFhbuttonMapper fhbuttonMapper;
	
	
	/**
	 * 通过表sys_role_fhbutton 查询该该用户拥有的button权限
	 */
	@Override
	public List<String> listAllBrAndQxname(PageData pd) throws Exception {
		List<String> list = new ArrayList<String>();
		String roleId = pd.getString("ROLE_ID");
		SysRoleFhbuttonExample example = new SysRoleFhbuttonExample();
		Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(roleId);
		List<SysRoleFhbutton> roleButtonList = roleFhbuttonMapper.selectByExample(example);
		for (SysRoleFhbutton sysRoleFhbutton : roleButtonList) {
			String qxName = fhbuttonMapper.selectByPrimaryKey(sysRoleFhbutton.getButtonId()).getQxName();
			list.add(qxName);
			
		}	
		return list;
	}

}
