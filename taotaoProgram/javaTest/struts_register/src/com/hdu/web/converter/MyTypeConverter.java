package com.hdu.web.converter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 需求：
 *    将表单中的MM/dd/yyyy格式的数据转换成日期类型
 *    把数据库中的本地日期格式转化成MM/dd/yyyy形式输出
 * 
 * 自定义子类转换器
 *    编写一个类，继承自StrutsTypeConverter,实现convertFromString,convertToString方法
 */
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import javafx.scene.chart.PieChart.Data;

public class MyTypeConverter extends StrutsTypeConverter {
	/**
	 * 将字符串数组中的数据转换成日期类型
	 * 
	 * 方法参数详解：
	 *  map context：是OGNL的上下文对象
	 *  String[] values:要转换的数据
	 *  Class toClass : 目标类型
	 */
	//定义一个日期转化器
	private DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		// TODO Auto-generated method stub
		//检查有没有数据
		if (values==null||values.length==0) {
			return null;
		}
		//取出数组中的第一个元素
		String date = values[0];
		//判断目标类型的字节码是不是日期类型
		if (toClass == java.util.Date.class) {
			try {
				//使用DateFormat进行转化，并返回转换后的结果
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
