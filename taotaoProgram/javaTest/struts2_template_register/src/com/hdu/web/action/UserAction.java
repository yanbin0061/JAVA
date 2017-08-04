package com.hdu.web.action;

import com.hdu.domain.User;
import com.hdu.service.IUserService;
import com.hdu.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {
	private IUserService service = new UserServiceImpl();
	//����һ���û����������ͣ�����ʹ����ģ�����������Ǳ����Լ�ʵ��������
	private User user= new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		System.out.println("����û�����:"+user.getUsername());
		return user;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String register(){
		System.out.println("����û�����:"+user.getUsername());
		User dbUser = service.findUserByUsername(user.getUsername());
		System.out.println("�����ϢdbUser:"+dbUser);
		//1.�����û�����ȡ���ݿ���û�����
		//2.�ж϶����Ƿ����
		if (dbUser!=null) {
			System.out.println("�û��Ѿ�����");
			return "exists";
		}
		     //2.1������ڣ�����exists�����ͼ
		     //2.2��������ڣ������û���Ϣ
		int result = service.register(user); 
		//����������0���򱣴�ɹ�
		if (result>0) {
			System.out.println("ע��ɹ�");
			return SUCCESS;
		}
		System.out.println("ע��ʧ��");
		return NONE;
		//�����򱣴�ʧ��
	}
}
