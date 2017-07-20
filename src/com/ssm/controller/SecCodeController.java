package com.ssm.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.util.Const;

/**
 * 登陆的验证码
 * @author zhefeng.ning
 *
 */
@Controller
@RequestMapping("/code")
public class SecCodeController {
	
	/*@RequestMapping
	public void generate(HttpServletResponse response){
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		String code = drawImg(output);
		
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		session.setAttribute(Const.SESSION_SECURITY_CODE, code);
		try {
			ServletOutputStream out = response.getOutputStream();
			output.writeTo(out);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}*/
	/**
	 * 生成验证码图片
	 * @param output
	 * @return
	 */
	
	
	/*private String drawImg(ByteArrayOutputStream output) {

		String code ="";
		for (int i = 0; i < 4; i++) {
			code += randomChar();
		}
		int width = 70;
		int height = 25;
		BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
		Font font = new Font("Times New Roman",Font.PLAIN,20);
		Graphics2D g = bi.createGraphics();
		g.setFont(font);
		Color color = new Color(66,2,82);
		g.setColor(color);
		g.setBackground(new Color(226,226,240));
		g.clearRect(0, 0, width, height);
		FontRenderContext context = g.getFontRenderContext();
		Rectangle2D bounds = font.getStringBounds(code, context);
		double x = (width - bounds.getWidth())/2;
		double y = (height - bounds.getHeight())/2;
		double ascent = bounds.getY();
		double baseY = y - ascent;
		g.drawString(code, (int)x, (int)baseY);
		g.dispose();
		try {
			ImageIO.write(bi, "ipg", output);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return code;
	}*/


	/**
	 * 生成一个随机数
	 * @return
	 */
	/*private char randomChar() {
		Random random = new Random();
		String randomNew = "ABCDEFGHJKLMNPRSTUVWXYZ0123456789";
		char charNew = randomNew.charAt(random.nextInt(randomNew.length()));
		return charNew;
	}*/
	
	
	
	
}
