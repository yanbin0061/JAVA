package com.hdu.service;

import com.hdu.domain.User;

/**
 * �û���ز�����ҵ���ӿ�
 * @author Administrator
 *
 */
public interface IUserService {
	/**
	 * �����û����ж��û��Ƿ�
	 * @param username
	 * @return
	 */
	User findUserByUsername(String username);
	/**
	 * �û�ע��
	 * @param user
	 * @return
	 */
	int register(User user);
}
