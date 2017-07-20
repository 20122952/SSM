package com.ssm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.entity.system.Menu;
import com.ssm.entity.system.Role;
import com.ssm.entity.system.User;
import com.ssm.service.AppUserService;
import com.ssm.service.FhbuttonService;
import com.ssm.service.MenuService;
import com.ssm.service.RoleFhbuttonService;
import com.ssm.service.RoleService;
import com.ssm.service.UserService;
import com.ssm.util.AppUtil;
import com.ssm.util.Const;
import com.ssm.util.DateUtil;
import com.ssm.util.PageData;
import com.ssm.util.RightsHelper;
import com.ssm.util.Tools;
/**
 * 登陆
 * @author zhefeng.ning
 *
 */

@Controller
public class LoginController extends BaseController{

	@Autowired
	private UserService userServiceImpl;
	@Autowired
	private MenuService menuServiceImpl;
	@Autowired
	private AppUserService appUserServiceImpl;
	@Autowired 
	private RoleService roleServiceImpl;
	@Autowired
	private FhbuttonService fhbuttonServiceImpl;
	@Autowired
	private RoleFhbuttonService roleFhbuttonServiceImpl;
	
	/**
	 * 进入登陆页面
	 * @return
	 * @throws Exception
	 */
	
	@RequestMapping("/login_toLogin")
	public ModelAndView toLogin()throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("SYSNAME", Tools.readTxtFile(Const.SYSNAME));
		mv.setViewName("system/index/login");
		mv.addObject("pd",pd);
		return mv;
	}
	
	/**
	 * 登陆
	 * @param session 用户名密码传入session
	 * @return
	 * @throws Exception
	 */
	
	@RequestMapping("/login_login")
	@ResponseBody
	public Object login() throws Exception{
		HttpSession session = this.getRequest().getSession();
		Map<String,String> map = new HashMap<String,String>();
		PageData pd = new PageData();
		pd = this.getPageData();
		String errInfo = "";
		String KEYDATA[] = pd.getString("KEYDATA").split("@:");
		if( null != KEYDATA && KEYDATA.length == 3){
			/*由于没用shiro，所以没做验证，过一阵自己再写
			 * String CODE = KEYDATA[3];
			 * */
			String USERNAME = KEYDATA[0];
			String PASSWORD = KEYDATA[1];
			pd.put("USERNAME", USERNAME);
			String passwd = new SimpleHash("SHA-1", USERNAME, PASSWORD).toString();
			pd.put("PASSWORD", passwd);
			pd = userServiceImpl.getUserByNameAndPwd(pd);
			if(pd != null){
				pd.put("LAST_LOGIN", DateUtil.getTime().toString());
				userServiceImpl.updateLastLogin(pd);
				User user = new User();
				user.setUSER_ID(pd.getString("USER_ID"));
				user.setUSERNAME(pd.getString("USERNAME"));
				user.setPASSWORD(pd.getString("PASSWORD"));
				user.setNAME(pd.getString("NAME"));
				user.setRIGHTS(pd.getString("RIGHTS"));
				user.setROLE_ID(pd.getString("ROLE_ID"));
				user.setLAST_LOGIN(pd.getString("LAST_LOGIN"));
				user.setIP(pd.getString("IP"));
				user.setSTATUS(pd.getString("STATUS"));
				session.setAttribute(Const.SESSION_USER, user);			//把用户信息放session中
				session.removeAttribute(Const.SESSION_SECURITY_CODE);	//清除登录验证码的session
			}else{
				errInfo = "usererror"; 				//用户名或密码有误
				logBefore(logger, USERNAME+"登录系统密码或用户名错误");
			}
			if(Tools.isEmpty(errInfo)){
				errInfo = "success";					//验证成功
				logBefore(logger, USERNAME+"登录系统");
			}
		}else{
			errInfo = "error";	//缺少参数
		}
		
		map.put("result", errInfo);
		return AppUtil.returnObject(new PageData(), map);
	}
	
	
	/**访问系统首页
	 * @param changeMenu：切换菜单参数
	 * @return
	 */
	@RequestMapping("/main/{changeMenu}")
	@SuppressWarnings("unchecked")
	public ModelAndView login_index(@PathVariable("changeMenu") String changeMenu)throws Exception{
		HttpSession session = this.getRequest().getSession();
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		try {
			User user = (User) session.getAttribute(Const.SESSION_USER);
			if(user != null){
				User userr = (User) session.getAttribute(Const.SESSION_USERROL);
				if(userr == null){
					user = userServiceImpl.getUserAndRoleById(user.getUSER_ID());
					session.setAttribute(Const.SESSION_USERROL, user);
				}else{
					user = userr;
				}
				String USERNAME = user.getUSERNAME();
				Role role = user.getRole();													//获取用户角色
				String roleRights = "";
				if(role != null){
					roleRights = role.getRIGHTS();
				}
				session.setAttribute(USERNAME + Const.SESSION_ROLE_RIGHTS, roleRights);		//将角色权限存入session
				session.setAttribute(Const.SESSION_USERNAME, USERNAME);						//放入用户名到session
				List<Menu> allmenuList = new ArrayList<Menu>();
				if(null == session.getAttribute(USERNAME + Const.SESSION_allmenuList)){
					allmenuList = menuServiceImpl.listAllMenuQx("0");						//获取所有菜单
					if(Tools.isEmpty(roleRights)){
						allmenuList = this.readMenu(allmenuList, roleRights);		//根据角色权限获取本权限的菜单列表
					}
					session.setAttribute(USERNAME + Const.SESSION_allmenuList, allmenuList);//菜单权限放入session中
				}else{
					allmenuList = (List<Menu>)session.getAttribute(USERNAME + Const.SESSION_allmenuList);
				}
				//切换菜单处理----start
				List<Menu> menuList = new ArrayList<Menu>();
				/*if(null == session.getAttribute(USERNAME + Const.SESSION_menuList) || "yes".equals(changeMenu)){*/
				List<Menu> menuList1 = new ArrayList<Menu>();  //type ==1的菜单
				List<Menu> menuList2 = new ArrayList<Menu>();  //type ==2的菜单
				
				for (int i = 0; i < allmenuList.size(); i++) {
					Menu menu = allmenuList.get(i);
					if("1".equals(menu.getMENU_TYPE())){
						menuList1.add(menu);
					}else{
						menuList2.add(menu);
					}
				}
				session.removeAttribute(USERNAME + Const.SESSION_menuList);
				if("2".equals(session.getAttribute("changeMenu"))){
					session.setAttribute(USERNAME + Const.SESSION_menuList, menuList1);
					session.removeAttribute("changeMenu");
					session.setAttribute("changeMenu", "1");
					menuList = menuList1;
				}else{
					session.setAttribute(USERNAME + Const.SESSION_menuList, menuList2);
					session.removeAttribute("changeMenu");
					session.setAttribute("changeMenu", "2");
					menuList = menuList2;
				}
					
				/*}else{
					menuList = (List<Menu>)session.getAttribute(USERNAME + Const.SESSION_menuList);
				}*/
				//切换菜单处理----end
				
				if(null == session.getAttribute(USERNAME + Const.SESSION_QX)){
					Map<String, String> uqx = this.getUQX(USERNAME);
					session.setAttribute(USERNAME + Const.SESSION_QX, uqx);	//按钮权限放到session中
				}
				this.getRemortIP(USERNAME);						//更新登录IP
				mv.setViewName("system/index/main");
				mv.addObject("menuList", menuList);
				mv.addObject("user", user);
				
			}else{
				mv.setViewName("system/index/login");			//session失效后跳转登录页面
			}
		} catch (Exception e) {
			mv.setViewName("system/index/login");
			logger.error(e.getMessage(), e);
		}
		pd.put("SYSNAME", Tools.readTxtFile(Const.SYSNAME)); //读取系统名称
		mv.addObject("pd",pd);
		return mv;
		
	}
	
	/**
	 * 更新登录用户的IP
	 * @param USERNAME
	 */

	private void getRemortIP(String USERNAME) throws Exception{
		PageData pd = new PageData();
		HttpServletRequest request = this.getRequest();
		String ip = "";
		if (request.getHeader("x-forwarded-for") == null) {  
			ip = request.getRemoteAddr();  
	    }else{
	    	ip = request.getHeader("x-forwarded-for");  
	    }
		pd.put("USERNAME", USERNAME);
		pd.put("IP", ip);
		userServiceImpl.saveIp(pd);
	}

	/**获取用户权限
	 * @param session
	 * @return
	 */
	public Map<String, String> getUQX(String USERNAME) {
		PageData pd = new PageData();
		Map<String,String> map = new HashMap<String,String>();
		try {
			pd.put(Const.SESSION_USERNAME, USERNAME);
			pd.put("ROLE_ID", userServiceImpl.findByUsernameId(pd)); //获取角色ID
			pd = roleServiceImpl.findObjectById(pd);		//获取角色信息
			map.put("adds", pd.getString("ADD_QX"));	//增
			map.put("dels", pd.getString("DEL_QX"));	//删
			map.put("edits", pd.getString("EDIT_QX"));	//改
			map.put("chas", pd.getString("CHA_QX"));	//查
			List<String> buttonQXnamelist = new ArrayList<String>();
			if("admin".equals(USERNAME)){
				//管理员查询全部信息
				buttonQXnamelist = fhbuttonServiceImpl.listAll(pd);
			}else{
				//其他员查询全部信息
				buttonQXnamelist = roleFhbuttonServiceImpl.listAllBrAndQxname(pd);
			}
			for (int i = 0; i < buttonQXnamelist.size(); i++) {
				map.put(buttonQXnamelist.get(i),"1");
			}
			
		} catch (Exception e) {
			logger.error(e.toString(), e);
		}
		
		return map;
	}

	/**
	 * 根据角色权限获取本权限的菜单列表
	 * @param allmenuList 传入的总菜单
	 * @param roleRights 加密的权限字符串
	 */
	private List<Menu> readMenu(List<Menu> allmenuList, String roleRights) {
		for (int i = 0; i < allmenuList.size(); i++) {
			allmenuList.get(i).setHasMenu(RightsHelper.testRights(roleRights, allmenuList.get(i).getMENU_ID()));
			if(allmenuList.get(i).isHasMenu()){
				readMenu(allmenuList.get(i).getSubMenu(),roleRights);
			}else{
				allmenuList.remove(i);
				i--;
			}
		}
		return allmenuList;
	}
	
	/**
	 * 进入tab标签
	 * @return
	 */
	@RequestMapping("/tab")
	public String tab(){
		return "system/index/tab";
	}
	
	/**
	 * 进入首页后的默认页面
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/login_default")
	public ModelAndView defaultPage() throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("userCount", userServiceImpl.getUserCount());         			//系统用户数
		pd.put("appUserCount", appUserServiceImpl.getAppUserCount());   	   //会员数
		mv.addObject("pd",pd);
		mv.setViewName("system/index/default");
		return mv;
	}
	
	
}
