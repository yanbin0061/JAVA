package com.hdu.domain;

import java.io.Serializable;

/**
 * 数据模型
 * @author Administrator
 *
 */
public class User implements Serializable{
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
	
}
