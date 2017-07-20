package com.ssm.util;

import java.util.Date;

import com.ssm.po.SysFhsms;

public class FhsmsUtils {

	/**
	 * pd转成fhsms实体类
	 * @param pd 
	 * @param fhsms
	 * @return
	 */
	public static SysFhsms pdTofhsms(PageData pd, SysFhsms fhsms) {
		fhsms.setFhsmsId(pd.getString("FHSMS_ID"));
		fhsms.setContent(pd.getString("CONTENT"));
		fhsms.setType(pd.getString("TYPE"));
		fhsms.setToUsername(pd.getString("TO_USERNAME"));
		fhsms.setFromUsername(pd.getString("FROM_USERNAME"));
		fhsms.setSendTime(pd.getString("SEND_TIME"));
		fhsms.setStatus(pd.getString("STATUS"));
		fhsms.setSanmeId(pd.getString("SANME_ID"));
		return fhsms;
	}

	/**
	 * sysFhsms To PageData
	 * @param sysFhsms
	 * @return
	 */
	public static PageData fhsmsToPd(SysFhsms sysFhsms) {
		PageData pd = new PageData();
		pd.put("FHSMS_ID", sysFhsms.getFhsmsId());
		pd.put("CONTENT", sysFhsms.getContent());
		pd.put("TYPE", sysFhsms.getType());
		pd.put("TO_USERNAME", sysFhsms.getToUsername());
		pd.put("FROM_USERNAME", sysFhsms.getFromUsername());
		pd.put("SEND_TIME", sysFhsms.getSendTime());
		pd.put("STATUS", sysFhsms.getStatus());
		pd.put("SANME_ID", sysFhsms.getSanmeId());
		return pd;
	}

}
