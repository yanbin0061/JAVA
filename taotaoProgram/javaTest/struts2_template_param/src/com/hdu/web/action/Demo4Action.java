package com.hdu.web.action;

import com.hdu.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * ��̬������װ�������������ģ������
 *     Ҫ��ʹ��ģ����������������ģ���붯����ֿ�д
 *    ʵ��ģ�������Ĳ���
 *       1.ʵ��һ��ModelDriven�Ľӿ�
 *       2.ʵ�ֽӿ��еĳ��󷽷�getModel()
 *       3.��ʹ��ģ������ʱ������ģ�ͱ����������Լ�ʵ����
 * @author Administrator
 *
 */
public class Demo4Action extends ActionSupport implements ModelDriven<User>{
	private User user = new User();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	public String  addUser(){
		System.out.println("ʹ��ģ��������װ����");
		System.out.println(user.getUserName()+":"+user.getAge());
		return NONE;
	}
}
