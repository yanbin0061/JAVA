package com.hdu.test1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class Test01 {
	@Test
	public void fun1(){
		//1 ��ȡ�����ļ�
		Configuration configuration = new Configuration().configure();
		//2.�������ã�����factory
		SessionFactory sFactory = configuration.buildSessionFactory();
		//3.ͨ��factory��ò������ݿ��session����
		Session session = sFactory.openSession();
		//4.��������
		User user = new User();
		user.setName("����");
		user.setPassword("123456789");
		session.save(user);
		//5.�ر���Դ
		session.close();
		sFactory.close();
	}
}
