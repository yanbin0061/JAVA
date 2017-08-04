package com.hdu.web.action;

import com.hdu.domain.User;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 动态数据参数的封装第二种形式
 * 数据模型与动作方法分开
 * @author Administrator
 *
 */
public class Demo3Action extends ActionSupport {
	//创建数据模型对象
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String addUser(){
		System.out.println("创建动态数据参数封装的第二种方式");
		System.out.println(user.getUserName()+":"+user.getAge());
		return NONE;
	}
}
