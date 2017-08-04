package com.hdu.dao.impl;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.hdu.dao.IUserDao;
import com.hdu.domain.User;
import com.hdu.utils.DBCPUtil;

public class UserDaoImpl implements IUserDao {
	private QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());
	@Override
	public User selectUserByUsername(String username) {
		// TODO Auto-generated method stub
		try {
			return qr.query("select * from user where username=?", new BeanHandler<User>(User.class), username);
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		try {
			return qr.update("insert into user(username,password,birthday,hobby,married)values(?,?,?,?,?)",
					user.getUsername(),user.getPassWord(),user.getBirthday(),user.getHoddy(),user.isMerried());
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}

}
