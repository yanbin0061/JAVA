package com.hdu.web.action;

public class Demo1Action {
	public String saveUser(){
		System.out.println("用户信息被保存了");
		return "success";
	}
	public String saveUser1(){
		System.out.println("user information saved!");
		return "success";
	}
}
