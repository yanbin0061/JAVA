package com.hdu.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class Login1Action extends ActionSupport {
	private String username;
	public String login1(){
		System.out.println(username);
		return SUCCESS;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
