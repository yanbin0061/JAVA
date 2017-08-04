package com.hdu.service.impl;

import com.hdu.dao.IUserDao;
import com.hdu.dao.impl.UserDaoImpl;
import com.hdu.domain.User;
import com.hdu.service.IUserService;


public class UserServiceImpl implements IUserService{
	//1.定义dao的对象
	private IUserDao dao = new UserDaoImpl();
	@Override
	public User findUserByUsername(String username) {
		// TODO Auto-generated method stub
		return dao.selectUserByUsername(username);
	}

	@Override
	public int register(User user) {
		// TODO Auto-generated method stub
		return dao.addUser(user);
	}

}
