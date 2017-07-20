package com.ssm.service;

import java.util.List;

import com.ssm.util.PageData;

public interface ButtonrightsService {

	/**
	 * 列出所有角色按钮关联数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	List<PageData> listAll(PageData pd) throws Exception;

}
