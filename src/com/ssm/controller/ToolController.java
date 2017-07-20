package com.ssm.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.util.AppUtil;
import com.ssm.util.Const;
import com.ssm.util.FileUtil;
import com.ssm.util.PageData;
import com.ssm.util.PathUtil;
import com.ssm.util.TwoDimensionCode;

/**
 * ToolController 系统工具
 * @author zhefeng.ning
 * @创建时间 2017年4月19日 上午8:57:45
 */

@Controller
@RequestMapping("/tool")
public class ToolController extends BaseController{

	
	/**
	 * 跳转到二维码页面
	 * @return
	 */
	
	@RequestMapping("/goTwoDimensionCode")
	public ModelAndView goTwoDimensionCode(){
		ModelAndView mv= new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		mv.setViewName("system/tools/twoDimensionCode");
		mv.addObject("pd",pd);
		return mv;
	}
	
	/**
	 * 生成二维码
	 * @return
	 */
	@RequestMapping("/createTwoDimensionCode")
	@ResponseBody
	public Object createTwoDimensionCode(){
		Map<String,String> map = new HashMap<String,String>();
		PageData pd = new PageData();
		pd = this.getPageData();
		String errInfo = "success";
		String encoderImgId = this.get32UUID()+".png";
		String encoderContent = pd.getString("encoderContent");
		if(encoderContent == null){
			errInfo = "error";
		}else{
			try {
				String fileName = PathUtil.getClasspath() + Const.FILEPATHTWODIMENSIONCODE;
				Boolean fileExist = TwoDimensionCode.CreateFolder(fileName);
				if(fileExist){
					String filePath = fileName +encoderImgId;
					TwoDimensionCode.encoderQRCode(encoderContent, filePath, "png");
				}else{
					errInfo = "error";
				}
			} catch (Exception e) {
				errInfo = "error";
			}
		}
		map.put("result", errInfo);
		map.put("encoderImgId", encoderImgId);
		return AppUtil.returnObject(new PageData(), map);
		
	}
	
	/**
	 * 识别二维码
	 * @return
	 */
	@RequestMapping("/readTwoDimensionCode")
	@ResponseBody
	public Object readTwoDimensionCode(){
		Map<String,String> map = new HashMap<String,String>();
		PageData pd = new PageData();
		pd = this.getPageData();
		String errInfo = "success";
		String readContent = "";
		
		String imgId = pd.getString("imgId");
		if(imgId != null){
			try {
				String filePath = PathUtil.getClasspath() + Const.FILEPATHTWODIMENSIONCODE + imgId;
				readContent = TwoDimensionCode.decoderQRCode(filePath);
			} catch (Exception e) {
				errInfo = "error";
			}
		}else{
			errInfo = "error";
		}
		map.put("result", errInfo);
		map.put("readContent", readContent);
		return AppUtil.returnObject(new PageData(), map);
	}
	
	
	
	
	
	
	
	
	
	
}
