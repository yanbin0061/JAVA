package com.hdu.web.action;
/**
 * Struts�����Ű���
 * @author Administrator
 *
 */
public class HelloAction {//������
	/**
	 * �ڶ������е�ָ����������
	 * ��������������дҪ��
	 *    1.����public��
	 *    2.����ֵ������һ��string
	 *    3.��û�в���
	 * @return
	 */
	public String sayHello(){
		System.out.println("HelloAction��sayHello����ִ��");
		return "success";//�������ļ���result��nameȡֵ���Ӧ
	}
}
