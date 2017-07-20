package com.ssm.service;

import java.util.List;

import com.ssm.entity.Page;
import com.ssm.util.PageData;

public interface FhbuttonService {
	/**
	 * 
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<String> listAll(PageData pd) throws Exception;

	/**
	 * 列出所有的按钮
	 * @param page
	 * @return
	 */
	public List<PageData> list(Page page) throws Exception;

	/**
	 * 通过Id获取当前用户
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception;

	/**
	 * 保存按钮
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception;

	/**
	 * 删除button
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd) throws Exception;

	/**
	 * 修改button
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd) throws Exception;

	/**
	 * 列出所有按钮
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> listAllButton(PageData pd) throws Exception;
}
