package com.hdu.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfigUtils {
	private static SessionFactory sessionFactory;
	static{
		//1���������ļ�
		Configuration configuration = new Configuration().configure();
		//2.��ȡsessionFactory����
		sessionFactory = configuration.buildSessionFactory();
		//3.�ر������ʱ���ͷ�sessionFactory����
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
