package com.hdu.dao;

import com.hdu.domain.User;

/**
 * 用户相关操作的数据访问层接口（持久层接口）
 * @author Administrator
 *
 */
public interface IUserDao{
	/**
	 * 根据用户名称查询用户
	 * @param username
	 * @return
	 */
	User selectUserByUsername(String username);
	/**
	 * 保存用户信息
	 * @param user
	 * @return
	 */
	int addUser(User user);

}
