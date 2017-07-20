package com.ssm.controller;

import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.entity.Page;
import com.ssm.service.PicturesService;
import com.ssm.util.AppUtil;
import com.ssm.util.Const;
import com.ssm.util.DateUtil;
import com.ssm.util.DelAllFile;
import com.ssm.util.FileUpload;
import com.ssm.util.PageData;
import com.ssm.util.PathUtil;
import com.ssm.util.Tools;
import com.ssm.util.Watermark;

/**
 *  图片管理action
 * @author zhefeng.ning
 *
 */
@Controller
@RequestMapping("/pictures")
public class PicturesController extends BaseController{

	@Autowired
	private PicturesService picturesServiceImpl;
	
	/**
	 * 图片列表
	 * @param page
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public ModelAndView list(Page page) throws Exception{
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		HttpSession session = this.getRequest().getSession();
		String username = session.getAttribute("USERNAME").toString();
		Map<String,String> map = (Map<String, String>) session.getAttribute(username + Const.SESSION_QX);
 		//edit=1, del=1,  add=1, cha=1, }
 		map.put("edit", "1");
 		map.put("del", "1");
 		map.put("add", "1");
 		map.put("cha", "1");
		String keyword = pd.getString("keyword");		
		if(keyword != null && "".equals(keyword)){
			pd.put("keyword", keyword.trim());
		}
		page.setPd(pd);
		List<PageData> varList = picturesServiceImpl.list(page);
		mv.setViewName("information/pictures/pictures_list");
		mv.addObject("pd",pd);
		mv.addObject("varList",varList);
		mv.addObject("QX",map);
		return mv;
	}
	
	/**
	 * 跳转添加图片页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/goAdd")
	public ModelAndView goAdd()throws Exception{
		logBefore(logger, "去新增Pictures页面");
		ModelAndView mv = new  ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		mv.setViewName("information/pictures/pictures_add");
		mv.addObject("pd",pd);
		return mv;
	}
	
	/**
	 * 添加图片
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/save")
	@ResponseBody
	public Object save(MultipartFile file) throws Exception{
		logBefore(logger, "新增图片");
		Map<String,String> map = new HashMap<String, String>();
		String ffile = DateUtil.getDays();
		String fileName = "";
		PageData pd = new PageData();
		if(null != file && !file.isEmpty()){
			String filePath = PathUtil.getClasspath() + Const.FILEPATHIMG + ffile;
			fileName = FileUpload.fileUp(file, filePath, this.get32UUID());
		}else{
			System.out.println("上传失败");
		}
		pd.put("PICTURES_ID", this.get32UUID());			//主键
		pd.put("TITLE", "图片");								//标题
		pd.put("NAME", fileName);							//文件名
		pd.put("PATH", ffile + "/" + fileName);				//路径
		pd.put("CREATETIME", Tools.date2Str(new Date()));	//创建时间
		pd.put("MASTER_ID", "1");							//附属与
		pd.put("BZ", "图片管理处上传");		
		Watermark.setWatemark(PathUtil.getClasspath() + Const.FILEPATHIMG + ffile + "/" + fileName);//加水印
		picturesServiceImpl.save(pd);
		
		map.put("result", "ok");
		return AppUtil.returnObject(pd, map);
	}
	
	/**
	 * 删除图片
	 * @param out
	 * @throws Exception
	 */
	@RequestMapping("/delete")
	public void delete(PrintWriter out) throws Exception{
		logBefore(logger,"删除图片");
		PageData pd = new PageData();
		pd = this.getPageData();
		DelAllFile.delAllFile(PathUtil.getClasspath() + Const.FILEPATHIMG + pd.getString("PATH"));
		try {
			Boolean result =  picturesServiceImpl.delete(pd);
			if(result){
				out.write("success");
			}else{
				out.write("failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			out.close();
		}
		
	}
	/**
	 * 修改图片
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(
			HttpServletRequest request,
			@RequestParam(value="tp",required=false) MultipartFile file,
			@RequestParam(value="tpz",required=false) String tpz,
			@RequestParam(value="PICTURES_ID",required=false) String PICTURES_ID, 
			@RequestParam(value="TITLE",required=false) String TITLE,
			@RequestParam(value="MASTER_ID",required=false) String MASTER_ID,
			@RequestParam(value="BZ",required=false) String BZ
			) throws Exception{
		logBefore(logger, "修改图片");
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("PICTURES_ID", PICTURES_ID);		//图片ID
		pd.put("TITLE", TITLE);					//标题
		pd.put("MASTER_ID", MASTER_ID);			//属于ID
		pd.put("BZ", BZ);						//备注
		if(null == tpz){
			tpz = "";
		}
		String ffile = DateUtil.getDays();
		String fileName = "";
		if(null != file && !file.isEmpty()){
			String filePath = PathUtil.getClasspath() + Const.FILEPATHIMG + ffile;
			fileName = FileUpload.fileUp(file, filePath, this.get32UUID());
			pd.put("PATH", ffile + "/" + fileName);									//路径
			pd.put("NAME", fileName);
			Watermark.setWatemark(PathUtil.getClasspath() + Const.FILEPATHIMG + ffile + "/" + fileName);//加水印
		}else{
			pd.put("PATH", tpz);
		}
		picturesServiceImpl.edit(pd);
		mv.setViewName("save_result");
		mv.addObject("msg","success");
		return mv;
	}
	
	/**
	 * 跳转编辑页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/goEdit")
	public ModelAndView goEdit()throws Exception{
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd = picturesServiceImpl.findById(pd);
		mv.setViewName("information/pictures/pictures_edit");
		mv.addObject("msg","edit");
		mv.addObject("pd",pd);
		return mv;
	}
	
	/**
	 * 修改里删除图片
	 * @throws Exception
	 */
	/*@RequestMapping("/deltp")
	public void deltp(PrintWriter out)throws Exception{
		logBefore(logger, "删除图片");
		try {
			Boolean delTp = false;
			PageData pd = new PageData();
			pd = this.getPageData();
			String path = pd.getString("PATH");
			DelAllFile.delFolder(PathUtil.getClasspath() + Const.FILEPATHIMG + path);
			if(path != null){
				delTp = picturesServiceImpl.delTp(pd);
			}
			if(delTp){
				out.write("success");
			}else{
				out.write("falied");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			out.close();
		}
	}*/
}
