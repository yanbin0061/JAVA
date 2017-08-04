package com.hdu.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfigUtils {
	private static SessionFactory sessionFactory;
	static{
		//1加载配置文件
		Configuration configuration = new Configuration().configure();
		//2.获取sessionFactory对象
		sessionFactory = configuration.buildSessionFactory();
		//3.关闭虚拟机时，释放sessionFactory对象
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				sessionFactory.close();
			}
		}));
	}
	public static Session getSession(){
		Session session = sessionFactory.openSession();
		return session;
	}
	public static Session getCurrentSession(){
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
}
