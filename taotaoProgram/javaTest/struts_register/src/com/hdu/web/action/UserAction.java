package com.hdu.web.action;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.validation.SkipValidation;

import com.hdu.domain.User;
import com.hdu.service.IUserService;
import com.hdu.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * �û���صĲ�����
 * @author Administrator
 *
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {
	private IUserService service = new UserServiceImpl();
	//����һ���û�������ģ��
	private User user = new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String register(){
		User dbUser = service.findUserByUsername(user.getUsername());
		System.out.println("�û�����"+user.getUsername()+"����:"+user.getPassword()+"����:"+user.getBirthday()
		+"����:"+user.getHobby()+"�ѻ�"+user.isMarried());
		if (dbUser!=null) {
			return "exists";
		}
		int res = service.register(user);
		if (res>0) {
			return SUCCESS;
		}
		return NONE;
	}
	/**
	 * ��struts2�Ŀ���У����ṩ��һ��Map<�������ֶ�����������Ϣ>
	 * ����Ҫ���ģ���map�д�Ŵ�����Ϣ
	 * 
	 * ���ʽ��֤
	 * 1.���������̳�ActionSupport
	 * 2.��дvalidate����
	 * validate�����ڶ�������ִ��֮ǰִ�У�������֤
	 * 
	 * ����д��validate����ʱ������Զ������е����ж�������������֤
	 * �����֤���ж������������⣺
	 * 1.ʹ��@SkipValidation��ע��
	 * 2.������֤���������ƣ�validate+��������
	 */
	/**
	��һ�ַ���
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if (StringUtils.isBlank(user.getUsername())) {
			addFieldError("username", "�������û���");
		}
		
	}
	@SkipValidation
	*/
	/**
	//�ڶ�����֤��ʽ
	public void validateRegister(){
		if (StringUtils.isBlank(user.getUsername())) {
			addFieldError("username", "�������û���");
		}
	}
	*/
	@SkipValidation
	public String findAll(){
		return "findall";
	}
}