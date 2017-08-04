package com.hdu.web.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

/**
 * ʹ��servletAPI�ķ�ʽ
 *     1.ʹ��servletActionContext����   ���Ƽ�ʹ�ã�
 *     2.ʹ������ע��ķ�ʽ
 *         ʹ����������ע���
 */
import com.opensymphony.xwork2.ActionSupport;

public class Demo1Action extends ActionSupport implements ServletRequestAware, ServletResponseAware,ServletContextAware{
	 private HttpServletRequest request;
	 private HttpServletResponse response;
	 private ServletContext application;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		//HttpServletRequest request = ServletActionContext.getRequest();
		//HttpServletResponse response =  ServletActionContext.getResponse();
		//ServletContext application = ServletActionContext.getServletContext();
		HttpSession session = request.getSession();
		System.out.println(request);
		System.out.println(response);
		System.out.println(application);
		System.out.println(session);
		return NONE;
	}
	@Override
	public void setServletContext(ServletContext application) {
		// TODO Auto-generated method stub
		this.application = application;
		
	}
	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response = response;
	}
	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
	
}
