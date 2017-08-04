package com.hdu.web.converter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * ����
 *    �����е�MM/dd/yyyy��ʽ������ת������������
 *    �����ݿ��еı������ڸ�ʽת����MM/dd/yyyy��ʽ���
 * 
 * �Զ�������ת����
 *    ��дһ���࣬�̳���StrutsTypeConverter,ʵ��convertFromString,convertToString����
 */
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import javafx.scene.chart.PieChart.Data;

public class MyTypeConverter extends StrutsTypeConverter {
	/**
	 * ���ַ��������е�����ת������������
	 * 
	 * ����������⣺
	 *  map context����OGNL�������Ķ���
	 *  String[] values:Ҫת��������
	 *  Class toClass : Ŀ������
	 */
	//����һ������ת����
	private DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		// TODO Auto-generated method stub
		//�����û������
		if (values==null||values.length==0) {
			return null;
		}
		//ȡ�������еĵ�һ��Ԫ��
		String date = values[0];
		//�ж�Ŀ�����͵��ֽ����ǲ�����������
		if (toClass == java.util.Date.class) {
			try {
				//ʹ��DateFormat����ת����������ת����Ľ��
				return format.parse(date);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return null;
			}
		}
		
		return null;
	}

	@Override
	public String convertToString(Map context, Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Date) {
			Data data = (Data)o;
			return format.format(data);
		}
		return null;
	}

}
