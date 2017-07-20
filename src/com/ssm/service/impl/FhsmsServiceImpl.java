package com.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.entity.Page;
import com.ssm.mapper.SysFhsmsMapper;
import com.ssm.po.SysFhsms;
import com.ssm.po.SysFhsmsExample;
import com.ssm.po.SysFhsmsExample.Criteria;
import com.ssm.service.FhsmsService;
import com.ssm.util.FhsmsUtils;
import com.ssm.util.PageData;

/**
 * 站内短信service
 * @author zhefeng.ning
 * @创建时间 2017年4月14日 上午10:30:30
 */
@Service
public class FhsmsServiceImpl implements FhsmsService {

	@Autowired
	private SysFhsmsMapper fhsmsMapper;
	
	/**
	 * save站内信息
	 */
	@Override
	public void save(PageData pd) throws Exception {
		SysFhsms fhsms = new SysFhsms();
		fhsms = FhsmsUtils.pdTofhsms(pd,fhsms);
		fhsmsMapper.insert(fhsms);

	}

	/**
	 * 查看短信列表
	 */
	@Override
	public List<PageData> list(Page page) throws Exception {
		PageData pd = page.getPd();
		SysFhsmsExample example = new SysFhsmsExample();
		Criteria criteria = example.createCriteria();
		criteria.andFromUsernameEqualTo(pd.getString("FROM_USERNAME"));
		if(null != pd.getString("STATUS") && !"".equals(pd.getString("STATUS"))){
			criteria.andStatusEqualTo(pd.getString("STATUS"));
		}
		List<SysFhsms> fhsmsList = fhsmsMapper.selectByExample(example);
		List<PageData> pdList = new ArrayList<PageData>();
		for (int i = 0; i < fhsmsList.size(); i++) {
			PageData fhsmsToPd = FhsmsUtils.fhsmsToPd(fhsmsList.get(i));
			pdList.add(fhsmsToPd);
		}
		return pdList;
	}

	/**
	 * 根据id查询信息表
	 */
	@Override
	public PageData findById(PageData pd) throws Exception {
		String fhsmsId = pd.getString("FHSMS_ID");
		SysFhsmsExample example = new SysFhsmsExample();
		Criteria criteria = example.createCriteria();
		criteria.andFhsmsIdEqualTo(fhsmsId);
		List<SysFhsms> fhsmsList = fhsmsMapper.selectByExample(example);
		pd = FhsmsUtils.fhsmsToPd(fhsmsList.get(0));
		return pd;
	}

	/**
	 * 修改
	 */
	@Override
	public void edit(PageData pd) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 站内没读短信条数
	 */
	@Override
	public List<SysFhsms> findFhsmsCount(String username) throws Exception {
		SysFhsmsExample example = new SysFhsmsExample();
		Criteria criteria = example.createCriteria();
		criteria.andFromUsernameEqualTo(username);
		criteria.andStatusEqualTo("2");
		List<SysFhsms> fhsmsList = fhsmsMapper.selectByExample(example);
		
		return fhsmsList;
	}

}
