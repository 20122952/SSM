package com.ssm.service;

import java.util.List;

import com.ssm.entity.Page;
import com.ssm.util.PageData;

/**
 * 图片管理接口
 * @author zhefeng.ning
 *
 */
public interface PicturesService {

	/**
	 * 查询图片
	 * @param page
	 * @throws Exception
	 */
	public List<PageData> list(Page page) throws Exception;

	/**
	 * 保存图片
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd) throws Exception;

	/**
	 * 删除文件
	 * @param pd
	 * @return
	 */
	public Boolean delete(PageData pd) throws Exception;

	/**
	 * 修改文件
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd) throws Exception;

	/**
	 * 跳转编辑页面
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	
	public PageData findById(PageData pd) throws Exception;

	/**
	 * 修改页面删除图片
	 * @param pd
	 * @throws Exception
	 */
	public Boolean delTp(PageData pd) throws Exception;

}
