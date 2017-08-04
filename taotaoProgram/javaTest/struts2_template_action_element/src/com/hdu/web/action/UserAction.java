package com.hdu.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	public String addUser(){
		System.out.println("添加新用户");
		return SUCCESS;
	}
	public String deleteUser(){
		System.out.println("删除用户");
		return SUCCESS;
	}
	public String updateUser(){
		System.out.println("修改用户");
		return SUCCESS;
	}
	public String findUser(){
		System.out.println("查找用户");
		return SUCCESS;
	}
}
