package com.ssm.util;

import java.util.ArrayList;
import java.util.List;

import com.ssm.po.SysFhbutton;

public class FhbuttonUtils {

	/**
	 * buttonListToPdList
	 * @param fhbuttonList
	 * @return
	 */
	public static List<PageData> buttonListToPdList(List<SysFhbutton> fhbuttonList) {
		List<PageData> pdList = new ArrayList<PageData>();
		for (int i = 0; i < fhbuttonList.size(); i++) {
			PageData pd = new PageData();
			pd.put("BZ", fhbuttonList.get(i).getBz());
			pd.put("FHBUTTON_ID", fhbuttonList.get(i).getFhbuttonId());
			pd.put("NAME", fhbuttonList.get(i).getName());
			pd.put("QX_NAME", fhbuttonList.get(i).getQxName());
			pdList.add(pd);
		}
		return pdList;
	}

	/**
	 * fhbuttonToPd
	 * @param fhbutton
	 * @return
	 */
	public static PageData fhbuttonToPd(SysFhbutton fhbutton) {
		PageData pd = new PageData();
		pd.put("BZ", fhbutton.getBz());
		pd.put("FHBUTTON_ID", fhbutton.getFhbuttonId());
		pd.put("NAME", fhbutton.getName());
		pd.put("QX_NAME", fhbutton.getQxName());
		return pd;
	}

	/**
	 * pdTofhbutton
	 * @param pd
	 * @return
	 */
	public static SysFhbutton pdTofhbutton(PageData pd) {
		SysFhbutton fhbutton = new SysFhbutton();
		fhbutton.setBz(pd.getString("BZ"));
		fhbutton.setFhbuttonId(pd.getString("FHBUTTON_ID"));
		fhbutton.setName(pd.getString("NAME"));
		fhbutton.setQxName(pd.getString("QX_NAME"));
		return fhbutton;
	}

	/*public List<String> ListSysToListPd(List<SysFhbutton> fhbuttonList, PageData pd) {
		
		return pdList;
	}*/

}
