package com.hdu.web.action;

import com.hdu.domain.User;
import com.opensymphony.xwork2.ActionSupport;
/**
 * ��̬���ݲ����ķ�װ�ڶ�����ʽ
 * ����ģ���붯�������ֿ�
 * @author Administrator
 *
 */
public class Demo3Action extends ActionSupport {
	//��������ģ�Ͷ���
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String addUser(){
		System.out.println("������̬���ݲ�����װ�ĵڶ��ַ�ʽ");
		System.out.println(user.getUserName()+":"+user.getAge());
		return NONE;
	}
}
