package com.hdu.test1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class Test01 {
	@Test
	public void fun1(){
		//1 读取配置文件
		Configuration configuration = new Configuration().configure();
		//2.根据配置，创建factory
		SessionFactory sFactory = configuration.buildSessionFactory();
		//3.通过factory获得操作数据库的session对象
		Session session = sFactory.openSession();
		//4.操作数据
		User user = new User();
		user.setName("王五");
		user.setPassword("123456789");
		session.save(user);
		//5.关闭资源
		session.close();
		sFactory.close();
	}
}
