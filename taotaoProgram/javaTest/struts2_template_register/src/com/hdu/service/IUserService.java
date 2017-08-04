package com.hdu.service;

import com.hdu.domain.User;

/**
 * 用户相关操作的业务层接口
 * @author Administrator
 *
 */
public interface IUserService {
	/**
	 * 根据用户名判断用户是否
	 * @param username
	 * @return
	 */
	User findUserByUsername(String username);
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	int register(User user);
}
