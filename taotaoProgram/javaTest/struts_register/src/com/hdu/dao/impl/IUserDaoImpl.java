package com.hdu.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.hdu.dao.IUserDao;
import com.hdu.domain.User;
import com.hdu.utils.DBCPUtil;

public class IUserDaoImpl implements IUserDao {
	private QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());
	@Override
	public User selectUserByUsername(String username) {
		try {
			return qr.query("select * from user where username = ?", new BeanHandler<User>(User.class),username);
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException();
		}
	}

	@Override
	public int addUser(User user) {
		try {
			return qr.update("insert into user(username,password,birthday,hobby,married)values(?,?,?,?,?)",
					user.getUsername(),user.getPassword(),user.getBirthday(),user.getHobby(),user.isMarried());
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException();
		}
	}

}
