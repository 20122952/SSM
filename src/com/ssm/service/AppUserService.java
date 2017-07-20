package com.ssm.service;

import java.util.List;

import com.ssm.entity.Page;
import com.ssm.util.PageData;

public interface AppUserService {

	/**
	 * 查询会员数
	 * @return
	 * @throws Exception
	 */
	public int getAppUserCount() throws Exception;

	/**
	 * 查询会员人
	 * @param page
	 * @return
	 */
	public List<PageData> listPdPageUser(Page page) throws Exception;
}
