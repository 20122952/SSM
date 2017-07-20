package com.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.entity.Page;
import com.ssm.mapper.SysFhbuttonMapper;
import com.ssm.po.SysFhbutton;
import com.ssm.po.SysFhbuttonExample;
import com.ssm.po.SysFhbuttonExample.Criteria;
import com.ssm.service.FhbuttonService;
import com.ssm.util.FhbuttonUtils;
import com.ssm.util.PageData;

/**
 * 当前点击按钮的权限
 * @author admin
 *
 */
@Service
public class FhbuttonServiceImpl implements FhbuttonService{

	@Autowired
	private SysFhbuttonMapper sysFhbuttonMapper;
	
	
	@Override
	public List<String> listAll(PageData pd) throws Exception {
		SysFhbuttonExample example = new SysFhbuttonExample();
		List<SysFhbutton> fhbuttonList = sysFhbuttonMapper.selectByExample(example);
		/*FhbuttonUtils fhbuttonUtils = new FhbuttonUtils();
		List<String> ListPd = fhbuttonUtils.ListSysToListPd(fhbuttonList,pd);*/
		
		List<String> pdList = new ArrayList<String>();
		for (int i = 0; i < fhbuttonList.size(); i++) {
			pdList.add(fhbuttonList.get(i).getQxName().toString());
		}
		return pdList;
	}


	/**
	 * 列出所有的按钮
	 */
	@Override
	public List<PageData> list(Page page) throws Exception {
		SysFhbuttonExample example = new SysFhbuttonExample();
		PageData pd = page.getPd();
		String keywords = pd.getString("keywords");
		if(null != keywords && !"".equals(keywords)){
			Criteria criteria = example.createCriteria();
			criteria.andNameEqualTo(keywords);
		}
		List<SysFhbutton> fhbuttonList = sysFhbuttonMapper.selectByExample(example);
		List<PageData> pdList = FhbuttonUtils.buttonListToPdList(fhbuttonList);
		return pdList;
	}
	
	/**
	 * 列出所有的按钮
	 */
	@Override
	public List<PageData> listAllButton(PageData pd) throws Exception {
		SysFhbuttonExample example = new SysFhbuttonExample();
		String keywords = pd.getString("keywords");
		if(null != keywords && !"".equals(keywords)){
			Criteria criteria = example.createCriteria();
			criteria.andNameEqualTo(keywords);
		}
		List<SysFhbutton> fhbuttonList = sysFhbuttonMapper.selectByExample(example);
		List<PageData> pdList = FhbuttonUtils.buttonListToPdList(fhbuttonList);
		return pdList;
	}


	/**
	 * 通过Id获取当前用户
	 */
	@Override
	public PageData findById(PageData pd) throws Exception {
		SysFhbutton fhbutton = sysFhbuttonMapper.selectByPrimaryKey(pd.getString("FHBUTTON_ID"));
		pd = FhbuttonUtils.fhbuttonToPd(fhbutton);
		return pd;
	}


	/**
	 * 保存按钮
	 */
	@Override
	public void save(PageData pd) throws Exception {
		SysFhbutton fhbutton = FhbuttonUtils.pdTofhbutton(pd);
		sysFhbuttonMapper.insert(fhbutton);
	}


	/**
	 *  删除button
	 */
	@Override
	public void delete(PageData pd) throws Exception {
		sysFhbuttonMapper.deleteByPrimaryKey(pd.getString("FHBUTTON_ID"));
	}


	/**
	 * 修改button
	 */
	@Override
	public void edit(PageData pd) throws Exception {
		SysFhbutton fhbutton = FhbuttonUtils.pdTofhbutton(pd);
		sysFhbuttonMapper.updateByPrimaryKey(fhbutton);
		
	}

}
