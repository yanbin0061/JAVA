package com.hdu.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	public String addUser(){
		System.out.println("������û�");
		return SUCCESS;
	}
	public String deleteUser(){
		System.out.println("ɾ���û�");
		return SUCCESS;
	}
	public String updateUser(){
		System.out.println("�޸��û�");
		return SUCCESS;
	}
	public String findUser(){
		System.out.println("�����û�");
		return SUCCESS;
	}
}
