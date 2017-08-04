package com.hdu.web.action.result;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.StrutsResultSupport;

import com.opensymphony.xwork2.ActionInvocation;

import cn.dsna.util.images.ValidateCode;

/**
 * 自定义结果类型
 *   第一步：
 *   编写一个普通的java类，继承StrutsResultSupport类，并重写doExecute方法
 * @author Administrator
 *
 */
public class CAPTCHAResult extends StrutsResultSupport {
    private int width;
    private int height;
	@Override
	protected void doExecute(String arg0, ActionInvocation arg1) throws Exception {
		
		
		// TODO Auto-generated method stub
		/**
		 * 使用第三方生成验证码的jar包
		 *    1.拷贝ValidateCode.jar包
		 *    2.创建ValidateCode对象
		 *    3.获取响应对象输出流
		 *    4.输出到浏览器
		 */
		//参数：1.图像宽度，2.图像高度，3.数字格式，4.干扰线条数
		ValidateCode code = new ValidateCode(width,height, 4, 10);
		//获取响应对象
		HttpServletResponse response = ServletActionContext.getResponse();
		//输出到浏览器
		code.write(response.getOutputStream());
			
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}






