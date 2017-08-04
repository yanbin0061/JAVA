package com.hdu.web.action;

import com.hdu.domain.User;
import com.hdu.service.IUserService;
import com.hdu.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {
	private IUserService service = new UserServiceImpl();
	//定义一个用户的数据类型，由于使用了模型驱动，我们必须自己实例化对象
	private User user= new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		System.out.println("输出用户姓名:"+user.getUsername());
		return user;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String register(){
		System.out.println("输出用户姓名:"+user.getUsername());
		User dbUser = service.findUserByUsername(user.getUsername());
		System.out.println("输出信息dbUser:"+dbUser);
		//1.根据用户名获取数据库的用户对象
		//2.判断对象是否存在
		if (dbUser!=null) {
			System.out.println("用户已经存在");
			return "exists";
		}
		     //2.1如果存在，返回exists结果视图
		     //2.2如果不存在，保存用户信息
		int result = service.register(user); 
		//如果结果大于0，则保存成功
		if (result>0) {
			System.out.println("注册成功");
			return SUCCESS;
		}
		System.out.println("注册失败");
		return NONE;
		//否则，则保存失败
	}
}
