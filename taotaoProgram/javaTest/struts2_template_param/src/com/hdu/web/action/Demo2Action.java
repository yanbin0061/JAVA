package com.hdu.web.action;

import com.opensymphony.xwork2.ActionSupport;
/**
 * ��̬���ݷ�װ�ĵ�һ����ʽ
 *     ������ģ�ͺͶ�����������һ��
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
		System.out.println("��̬���ݷ�װ�ĵ�һ����ʽ");
		System.out.println(userName+":"+age);
		return NONE;
	}
}
