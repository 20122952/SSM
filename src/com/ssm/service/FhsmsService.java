package com.ssm.service;

import java.util.List;

import com.ssm.entity.Page;
import com.ssm.po.SysFhsms;
import com.ssm.util.PageData;

/**
 * 站内短信接口
 * @author zhefeng.ning
 * @创建时间 2017年4月14日 上午10:28:44
 */
public interface FhsmsService {

	/**
	 * save站内信息
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd) throws Exception;

	/**
	 * 查看短信列表
	 * @param page
	 * @return
	 * @throws Exception
	 */
	public List<PageData> list(Page page) throws Exception;

	/**
	 * 根据id查询信息表
	 * @param pd
	 */
	public PageData findById(PageData pd) throws Exception;

	/**
	 * 修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception;

	

	/**
	 * 站内没读短信条数
	 * @param attribute
	 * @return
	 * @throws Exception
	 */
	public List<SysFhsms> findFhsmsCount(String username) throws Exception;
}
