package com.hdu.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

/**
 * ʹ�ÿ�Դ����Դ��
 * 	DBCP��DataBase Connection Pool ��apache��˾ʵ�ֵ�һ����Դ������Դ��
 * ʹ�ò��裺
 * 	1.����jar��
 *  2.д�����ļ�
 *  3.ʹ��
 * @author zhy
 *
 */
public class DBCPUtil {
  
	//1.����һ������Դ
	private static DataSource ds;
	
	//2.ʹ�þ�̬����飬������Դ��ֵ
	static{
		try {
			Properties prop = new Properties();
			InputStream in = DBCPUtil.class.getClassLoader().getResourceAsStream("dbcpconfig.properties");
			prop.load(in);
			ds = BasicDataSourceFactory.createDataSource(prop);
		} catch (Exception e) {
			throw new ExceptionInInitializerError("��ʼ�����ӳ�ʧ�ܣ�");
		}
	}
	
	
	
	//3.�ṩһ����ȡ����Դ�ķ���
	public static DataSource getDataSource(){
		return ds;
	}
	
	//4.�ṩһ����ȡ���ӵķ�����ע�⣬�Ժ��ȡ���ӣ�����ʹ�ø÷���
	public static Connection getConnection(){
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
