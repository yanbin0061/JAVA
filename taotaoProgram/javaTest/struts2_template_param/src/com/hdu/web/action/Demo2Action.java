package com.hdu.web.action;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 动态数据封装的第一种形式
 *     将数据模型和动作方法放在一起
 * @author Administrator
 *
 */
public class Demo2Action extends ActionSupport {
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
		System.out.println("动态数据封装的第一种形式");
		System.out.println(userName+":"+age);
		return NONE;
	}
}
