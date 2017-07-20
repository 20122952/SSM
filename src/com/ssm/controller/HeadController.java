package com.ssm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.service.FhsmsService;
import com.ssm.service.UserService;
import com.ssm.util.AppUtil;
import com.ssm.util.Const;
import com.ssm.util.PageData;
import com.ssm.util.Tools;

@Controller
@RequestMapping("/head")
public class HeadController extends BaseController{
	
	@Autowired
	private UserService userServiceImpl;
	@Autowired
	private FhsmsService fhsmsServiceImpl;
	/**
	 * 获取头部信息
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getList")
	@ResponseBody
	public Object getList() throws Exception{
		PageData pd = new PageData();
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			pd = this.getPageData();
			List<PageData> pdList = new ArrayList<PageData>();
			HttpSession session = this.getRequest().getSession();
			PageData pds = new PageData();
			pds = (PageData) session.getAttribute(Const.SESSION_userpds);
			if(null == pds){
				pd.put("USERNAME", session.getAttribute("USERNAME"));
				pds = userServiceImpl.findByUsernameList(pd);
				session.setAttribute(Const.SESSION_userpds, pds);
			}
			pdList.add(pds);
			map.put("list", pdList);
			map.put("fhsmsCount",fhsmsServiceImpl.findFhsmsCount(session.getAttribute("USERNAME").toString()).size()+"");//站内信未读总数
			String strWEBSOCKET = Tools.readTxtFile(Const.WEBSOCKET);//读取WEBSOCKET配置
			if(null != strWEBSOCKET && !"".equals(strWEBSOCKET)){
				String strIW[] = strWEBSOCKET.split(",fh,");
				if(strIW.length == 5){
					map.put("wimadress", strIW[0]+":"+strIW[1]);	//即时聊天服务器IP和端口
					map.put("oladress", strIW[2]+":"+strIW[3]);		//在线管理和站内信服务器IP和端口
					map.put("FHsmsSound", strIW[4]);				//站内信提示音效配置
				}
			}
			
		} catch (Exception e) {
			logger.error(e.toString(), e);
		}finally {
			logAfter(logger);
		}
		return AppUtil.returnObject(pd, map);
		
	}
	
	
	
	
	
	
	

}
