package com.hdu.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class Demo1Action extends ActionSupport{
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("执行了execute方法");
		return SUCCESS;
	}
}
