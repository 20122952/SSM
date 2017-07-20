package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.entity.Page;
import com.ssm.mapper.SysAppUserMapper;
import com.ssm.po.SysAppUser;
import com.ssm.po.SysAppUserExample;
import com.ssm.po.SysAppUserExample.Criteria;
import com.ssm.service.AppUserService;
import com.ssm.util.AppUserUtils;
import com.ssm.util.PageData;
/**
 * 会员人
 * @author admin
 *
 */

@Service
public class AppUserServiceImpl implements AppUserService{

	@Autowired
	private SysAppUserMapper sysAppUserMapper;
	
	/**
	 * 查询会员数
	 */
	@Override
	public int getAppUserCount() throws Exception {
		SysAppUserExample example = new SysAppUserExample();
		List<SysAppUser> sysAppUserList = sysAppUserMapper.selectByExample(example);
		int appUserNum = sysAppUserList.size();
		return appUserNum;
	}

	/**
	 * 查询会员人
	 */
	@Override
	public List<PageData> listPdPageUser(Page page) throws Exception {
		SysAppUserExample example = new SysAppUserExample();
		Criteria criteria = example.createCriteria();
		if(null != page.getPd().getString("keywords") && !"".equals(page.getPd().getString("keywords"))){
			criteria.andNameEqualTo(page.getPd().getString("keywords"));
		}
		List<SysAppUser> sysAppUserList = sysAppUserMapper.selectByExample(example);
		List<PageData> pdList = AppUserUtils.appUserListToPdList(sysAppUserList);
		return pdList;
	}

}
