package com.hdu.web.action;

import com.hdu.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 动态参数封装，第三种情况：模型驱动
 *     要想使用模型驱动，必须数据模型与动作类分开写
 *    实现模型驱动的步骤
 *       1.实现一个ModelDriven的接口
 *       2.实现接口中的抽象方法getModel()
 *       3.在使用模型驱动时，数据模型必须由我们自己实例化
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
		System.out.println("使用模型驱动封装数据");
		System.out.println(user.getUserName()+":"+user.getAge());
		return NONE;
	}
}
