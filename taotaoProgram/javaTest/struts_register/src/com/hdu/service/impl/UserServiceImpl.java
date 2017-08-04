package com.hdu.service.impl;

import com.hdu.dao.IUserDao;
import com.hdu.dao.impl.IUserDaoImpl;
import com.hdu.domain.User;
import com.hdu.service.IUserService;

public class UserServiceImpl implements IUserService {
/**
 * 定义dao的对象
 * 
 */
	private IUserDao dao = new IUserDaoImpl();
	@Override
	public User findUserByUsername(String username) {
		return dao.selectUserByUsername(username);
	}

	@Override
	public int register(User user) {
		return dao.addUser(user);
	}

}
