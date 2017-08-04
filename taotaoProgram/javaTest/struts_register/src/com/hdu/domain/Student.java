package com.hdu.domain;

import java.io.Serializable;

public class Student implements Serializable {
	private String username;//不能为空字符串或null，要去空格
	private int age;//整数，介于18-100之间
	private String email;//按照邮箱的格式输入
	private String password;//密码：长度是3-8位
	private String repassword;//确认密码
	private int score;//成绩，必须是自然数
	private String url;//个人主页，必须符合url地址
	private String gender;//性别
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
