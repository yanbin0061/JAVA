package com.hdu.web.action.result;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.StrutsResultSupport;

import com.opensymphony.xwork2.ActionInvocation;

import cn.dsna.util.images.ValidateCode;

/**
 * �Զ���������
 *   ��һ����
 *   ��дһ����ͨ��java�࣬�̳�StrutsResultSupport�࣬����дdoExecute����
 * @author Administrator
 *
 */
public class CAPTCHAResult extends StrutsResultSupport {
    private int width;
    private int height;
	@Override
	protected void doExecute(String arg0, ActionInvocation arg1) throws Exception {
		
		
		// TODO Auto-generated method stub
		/**
		 * ʹ�õ�����������֤���jar��
		 *    1.����ValidateCode.jar��
		 *    2.����ValidateCode����
		 *    3.��ȡ��Ӧ���������
		 *    4.����������
		 */
		//������1.ͼ���ȣ�2.ͼ��߶ȣ�3.���ָ�ʽ��4.����������
		ValidateCode code = new ValidateCode(width,height, 4, 10);
		//��ȡ��Ӧ����
		HttpServletResponse response = ServletActionContext.getResponse();
		//����������
		code.write(response.getOutputStream());
			
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}






