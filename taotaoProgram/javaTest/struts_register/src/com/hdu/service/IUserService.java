package com.hdu.service;

import com.hdu.domain.User;

/**
 * 用户相关操作的业务层接口
 * @author Administrator
 *
 */
public interface IUserService {
	/**
	 * 判断用户是否存在，根据用户名
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
