package com.hdu.dao;

import com.hdu.domain.User;

/**
 * �û���ز��������ݷ��ʲ�ӿڣ��־ò�ӿڣ�
 * @author Administrator
 *
 */
public interface IUserDao{
	/**
	 * �����û����Ʋ�ѯ�û�
	 * @param username
	 * @return
	 */
	User selectUserByUsername(String username);
	/**
	 * �����û���Ϣ
	 * @param user
	 * @return
	 */
	int addUser(User user);

}
