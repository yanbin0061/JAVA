package com.hdu.dao;

import com.hdu.domain.User;

/**
 * �û���ز����ĳ־ò�ӿ�
 * @author Administrator
 *
 */
public interface IUserDao {
	/**
	 * �����û����Ʋ�ѯ�û�
	 * @param username
	 * @return
	 */
	User selectUserByUsername(String username);
	/**
	 * ����user�����û���Ϣ
	 * @param user
	 * @return
	 */
	int addUser(User user);
	

}
