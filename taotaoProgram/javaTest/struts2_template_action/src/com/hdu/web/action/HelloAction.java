package com.hdu.web.action;
/**
 * Struts的入门案例
 * @author Administrator
 *
 */
public class HelloAction {//动作类
	/**
	 * 在动作类中的指定动作方法
	 * 动作方法是有书写要求
	 *    1.都是public的
	 *    2.返回值必须是一个string
	 *    3.都没有参数
	 * @return
	 */
	public String sayHello(){
		System.out.println("HelloAction的sayHello方法执行");
		return "success";//与配置文件中result的name取值相对应
	}
}
