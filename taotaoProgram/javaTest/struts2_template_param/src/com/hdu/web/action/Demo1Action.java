package com.hdu.web.action;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 静态参数的封装
 * @author Administrator
 *
 */
public class Demo1Action extends ActionSupport {
	private String userName;
	private int age;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String addUser(){
		System.out.println(userName+":"+age);
		return null;
	}
}
