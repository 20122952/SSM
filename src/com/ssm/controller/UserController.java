package com.ssm.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.runners.Parameterized.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.entity.Page;
import com.ssm.entity.system.Role;
import com.ssm.entity.system.User;
import com.ssm.service.FhbuttonService;
import com.ssm.service.RoleService;
import com.ssm.service.UserService;
import com.ssm.util.AppUtil;
import com.ssm.util.Const;
import com.ssm.util.FileDownload;
import com.ssm.util.FileUpload;
import com.ssm.util.GetPinyin;
import com.ssm.util.ObjectExcelRead;
import com.ssm.util.ObjectExcelView;
import com.ssm.util.PageData;
import com.ssm.util.PathUtil;
import com.ssm.util.Tools;


/**
 * UserController - 用户管理类
 * @author zhefeng.ning
 *
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController{
	
	String menuUrl = "listUsers.do";
	@Autowired
	private UserService userServiceImpl;
	@Autowired
	private RoleService roleServiceImpl;
	
	@RequestMapping("/listUsers")
	public ModelAndView listUsers(Page page) throws Exception{
		ModelAndView mv = new ModelAndView();
		HttpSession session = this.getRequest().getSession();
		PageData pd = new PageData();
		pd = this.getPageData();
		//关键词检索条件
		String keywords = pd.getString("keywords");
		if(!"".equals(keywords) && null != keywords){
			pd.put("keywords", keywords.trim());
		}
		//开始时间
		String lastLoginStart = pd.getString("lastLoginStart");
		//结束时间
		String lastLoginEnd = pd.getString("lastLoginEnd");
		if(!"".equals(lastLoginStart) && null != lastLoginStart){
			pd.put("lastLoginStart", lastLoginStart+" 00:00:00");
		}
		if(!"".equals(lastLoginEnd) && null != lastLoginEnd){
			pd.put("lastLoginEnd", lastLoginEnd+" 00:00:00");
		}
		
		page.setPd(pd);
		List<PageData> userList = userServiceImpl.listUsers(page);
		pd.put("ROLE_ID", "1");
		
		List<Role> roleList = roleServiceImpl.listAllRolesByPId(pd);
		
		User user = (User) session.getAttribute(Const.SESSION_USER);
		String username = user.getUSERNAME();
				//+ 
		Map<String, String> map = (Map<String, String>)session.getAttribute(username + Const.SESSION_QX);
		
		mv.setViewName("system/user/user_list");
		mv.addObject("userList",userList);
		mv.addObject("roleList",roleList);
		mv.addObject("pd",pd);
		mv.addObject("QX",map);
		return mv;
		
	}
	/**
	 * 新增用户
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/goAddU")
	public ModelAndView goAddU() throws Exception{
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("ROLE_ID", "1");
		List<Role> roleList = roleServiceImpl.listAllRolesByPId(pd);
		mv.setViewName("system/user/user_edit");
		mv.addObject("msg", "saveU");
		mv.addObject("pd", pd);
		mv.addObject("roleList", roleList);		
		return mv;
	}
	
	/**
	 * 判断用户名是否存在
	 * @return
	 */
	@RequestMapping("/hasU")
	@ResponseBody
	public Object hasU(){
		Map<String,String> map = new HashMap<String,String>();
		String errInfo = "success";
		PageData pd = new PageData();
		try {
			pd = this.getPageData();
			if(userServiceImpl.findByUsername(pd)){
				errInfo = "error";
			}
		} catch (Exception e) {
			logger.error(e.toString(), e);
		}
		map.put("result", errInfo);
		return AppUtil.returnObject(new PageData(), map);
	}
	

	/**
	 * 判断邮箱是否存在
	 * @return
	 */
	@RequestMapping("/hasE")
	@ResponseBody
	public Object hasE(){
		Map<String,String> map = new HashMap<String,String>();
		String errInfo = "success";
		PageData pd = new PageData();
		try {
			pd = this.getPageData();
			if(userServiceImpl.findByUserEmail(pd)){
				errInfo = "error";
			}
		} catch (Exception e) {
			logger.error(e.toString(), e);
		}
		map.put("result", errInfo);
		return AppUtil.returnObject(new PageData(), map);
	}
	
	
	/**
	 * 判断编码是否存在
	 * @return
	 */
	@RequestMapping("/hasN")
	@ResponseBody
	public Object hasN(){
		Map<String,String> map = new HashMap<String,String>();
		String errInfo = "success";
		PageData pd = new PageData();
		try {
			pd = this.getPageData();
			if(userServiceImpl.findByUserNum(pd)){
				errInfo = "error";
			}
		} catch (Exception e) {
			logger.error(e.toString(), e);
		}
		map.put("result", errInfo);
		return AppUtil.returnObject(new PageData(), map);
	}
	
	
	/**保存用户
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveU")
	public ModelAndView saveU() throws Exception{
		HttpServletRequest request = this.getRequest();
		HttpSession session = request.getSession();
		logBefore(logger, session.getAttribute("USERNAME")+"新增user");
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("USER_ID", this.get32UUID());
		pd.put("LAST_LOGIN", "");
		pd.put("IP", "");
		pd.put("STATUS", "0");
		pd.put("SKIN", "default");
		pd.put("RIGHTS", "");
		pd.put("PASSWORD", new SimpleHash("SHA-1", pd.getString("USERNAME"),pd.getString("PASSWORD")).toString()); //密码加密
		if(!userServiceImpl.findByUsername(pd)){
			userServiceImpl.saveU(pd);
			mv.addObject("msg","success");
		}else{
			mv.addObject("msg","failed");
		}
		mv.setViewName("save_result");
		return mv;
	}
	
	/**
	 * 修改返显的
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/goEditU")
	public ModelAndView goEditU() throws Exception{
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		String fx = pd.getString("fx");
		if("head".equals(fx)){
			mv.addObject("fx","head");
		}else{
			mv.addObject("fx","user");
		}
		pd.put("ROLE_ID", "1");
		//列出所有系统用户角色
		List<Role> roleList = roleServiceImpl.listAllRolesByPId(pd);
		//根据ID读取
		pd = userServiceImpl.findById(pd);
		mv.setViewName("system/user/user_edit");
		mv.addObject("msg", "editU");
		mv.addObject("pd", pd);
		mv.addObject("roleList", roleList);
		return mv;
	}
	
	/**
	 * 修改edit的save
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editU")
	public ModelAndView editU() throws Exception{
		HttpServletRequest request = this.getRequest();
		HttpSession session = request.getSession();
		logBefore(logger, session.getAttribute("USERNAME")+"修改user");
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		if(pd.getString("PASSWORD") != null && !"".equals(pd.getString("PASSWORD"))){
			pd.put("PASSWORD", new SimpleHash("SHA-1", pd.getString("USERNAME"), pd.getString("PASSWORD")).toString());
		}
		userServiceImpl.editU(pd);	//执行修改
		mv.addObject("msg","success");
		mv.setViewName("save_result");
		return mv;
	}
	
	/**
	 * 删除用户
	 * @param out
	 * @throws Exception
	 */
	@RequestMapping("/deleteU")
	public void deleteU(PrintWriter out) throws Exception{
		HttpSession session = this.getRequest().getSession();
		logBefore(logger, session.getAttribute("USERNAME") +"删除user");
		PageData pd = new PageData();
		pd = this.getPageData();
		userServiceImpl.deleteU(pd);
		out.write("success");
		out.close();
	}
	
	/**
	 * 显示当前用户的信息
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/view")
	public ModelAndView view() throws Exception{
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("ROLE_ID", "1");
		List<Role> rolesList = roleServiceImpl.listAllRolesByPId(pd);
		pd = userServiceImpl.listUsernamefindById(pd);
		mv.setViewName("system/user/user_view");
		mv.addObject("msg", "editU");
		mv.addObject("pd", pd);
		mv.addObject("roleList", rolesList);
		
		return mv;
	}
	
	@RequestMapping(value="/excel")
	public ModelAndView excel()throws Exception{
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		try {
			//关键词检索条件
			String keywords = pd.getString("keywords");
			if(!"".equals(keywords) && null != keywords){
				pd.put("keywords", keywords.trim());
			}
			//开始时间
			String lastLoginStart = pd.getString("lastLoginStart");
			//结束时间
			String lastLoginEnd = pd.getString("lastLoginEnd");
			if(!"".equals(lastLoginStart) && null != lastLoginStart){
				pd.put("lastLoginStart", lastLoginStart+" 00:00:00");
			}
			if(!"".equals(lastLoginEnd) && null != lastLoginEnd){
				pd.put("lastLoginEnd", lastLoginEnd+" 00:00:00");
			}
			
			Map<String,Object> dataMap = new HashMap<String,Object>();
			List<String> titles = new ArrayList<String>();
			titles.add("用户名"); 		//1
			titles.add("编号");  			//2
			titles.add("姓名");			//3
			titles.add("职位");			//4
			titles.add("手机");			//5
			titles.add("邮箱");			//6
			titles.add("最近登录");		//7
			titles.add("上次登录IP");		//8
			dataMap.put("titles", titles);
			List<PageData> userList =  userServiceImpl.listAllUser(pd);
			List<PageData> varList = new ArrayList<PageData>();
			for (int i = 0; i < userList.size(); i++) {
				PageData vpd = new PageData();
				vpd.put("var1", userList.get(i).getString("USERNAME"));		//1
				vpd.put("var2", userList.get(i).getString("NUMBER"));		//2
				vpd.put("var3", userList.get(i).getString("NAME"));			//3
				vpd.put("var4", userList.get(i).getString("ROLE_NAME"));	//4
				vpd.put("var5", userList.get(i).getString("PHONE"));		//5
				vpd.put("var6", userList.get(i).getString("EMAIL"));		//6
				vpd.put("var7", userList.get(i).getString("LAST_LOGIN"));	//7
				vpd.put("var8", userList.get(i).getString("IP"));			//8
				varList.add(vpd);
			}
			ObjectExcelView oev = new ObjectExcelView();
			dataMap.put("varList", varList);
			mv = new ModelAndView(oev,dataMap);
			
		} catch (Exception e) {
			logger.error(e.toString(), e);
		}
		return mv;
	}
	
	/**
	 * excel上传
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/goUploadExcel")
	public ModelAndView goUploadExcel() throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("system/user/uploadexcel");
		return mv;
	}
	
	/**
	 * 下载模板
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/downExcel")
	public void downExcel(HttpServletResponse response) throws Exception{
		FileDownload.fileDownload(response, PathUtil.getClasspath() + Const.FILEPATHFILE + "Users.xls", "Users.xls");
	}
	
	
	@RequestMapping("/readExcel")
	public ModelAndView readExcel(@RequestParam(value="excel",required=false) MultipartFile file) throws Exception{
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		if(null != file && !file.isEmpty()){
			String filePath = PathUtil.getClasspath() + Const.FILEPATHFILE;
			String fileName = FileUpload.fileUp(file,filePath,"userexcel");
			List<PageData> listPd = (List)ObjectExcelRead.readExcel(filePath, fileName, 2, 0, 0);
			//存入数据库操作
			pd.put("RIGHTS", "");					//权限
			pd.put("LAST_LOGIN", "");				//最后登录时间
			pd.put("IP", "");						//IP
			pd.put("STATUS", "0");					//状态
			pd.put("SKIN", "default");				//默认皮肤
			pd.put("ROLE_ID", "1");
			List<Role> roleList = roleServiceImpl.listAllRolesByPId(pd);
			pd.put("ROLE_ID", roleList.get(0).getROLE_ID());		//设置角色ID为随便第一个
			/**
			 * var0 :编号
			 * var1 :姓名
			 * var2 :手机
			 * var3 :邮箱
			 * var4 :备注
			 */
			for (int i = 0; i < listPd.size(); i++) {
				pd.put("USER_ID", this.get32UUID());										//ID
				pd.put("NAME", listPd.get(i).getString("var1"));							//姓名
				
				String USERNAME = GetPinyin.getPingYin(listPd.get(i).getString("var1"));	//根据姓名汉字生成全拼
				pd.put("USERNAME", USERNAME);	
				if(userServiceImpl.findByUsername(pd)){									//判断用户名是否重复
					USERNAME = GetPinyin.getPingYin(listPd.get(i).getString("var1"))+Tools.getRandomNum();
					pd.put("USERNAME", USERNAME);
				}
				pd.put("BZ", listPd.get(i).getString("var4"));								//备注
				if(Tools.checkEmail(listPd.get(i).getString("var3"))){						//邮箱格式不对就跳过
					pd.put("EMAIL", listPd.get(i).getString("var3"));						
					if(userServiceImpl.findByUE(pd) != null){									//邮箱已存在就跳过
						continue;
					}
				}else{
					continue;
				}
				pd.put("NUMBER", listPd.get(i).getString("var0"));							//编号已存在就跳过
				pd.put("PHONE", listPd.get(i).getString("var2"));							//手机号
				
				pd.put("PASSWORD", new SimpleHash("SHA-1", USERNAME, "1").toString());	//默认密码123
				if(userServiceImpl.findByUN(pd) != null){
					continue;
				}
				userServiceImpl.saveU(pd);
			}
			
			/*存入数据库操作======================================*/
			mv.addObject("msg","success");
		}
		mv.setViewName("save_result");
		return mv;
		
	}
	
}
