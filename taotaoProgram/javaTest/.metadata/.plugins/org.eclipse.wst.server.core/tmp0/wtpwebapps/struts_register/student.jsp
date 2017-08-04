<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%--导入struts2的标签库 --%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>用户注册,使用的是struts2的标签</title>
    <s:head></s:head>
  </head>
  <body>
  <s:actionerror/> <!-- 动作错误 -->
  <!--<s:fielderror/>   -- 字段错误 -->
  <%--
        struts2的form标签，它提供了和原始html表单标签几乎一致的属性
        action：请求地址，直接写动作名称
        method：请求方式，默认的是post
        enctype：表单编码的MIME类型
   --%>
 
  <s:form action="addStudent.action">
      <s:textfield name="username" label="用户名" requiredLabel="true" requiredPosition="left"/>
      <s:textfield name="age" label="年龄"/>
      <s:textfield name="email" label="邮箱"/>
      <s:password name="password" label="密码 " showPassword="true"/>
      <s:password name="repassword" label="确认密码 " showPassword="true"/>
      <s:textfield name="score" label="分数"/>
      <s:textfield name="url" label="个人主页"/>
      <s:radio name="gender" list="{'男','女'}" label="性别"/>
      <s:reset value="重置"/>
      <s:submit value="注册"/>
  </s:form>
  <%-- 
   	<form action="${pageContext.request.contextPath}/register.action" method="post">
   		用户名：<input type="text" name="username" /><br/>
   		密码：<input type="password" name="password" /><br/>
   		生日：<input type="text" name="birthday" /><br/>
   		爱好：<input type="checkbox" name="hobby" value="吃饭"/>吃饭
   		    <input type="checkbox" name="hobby" value="睡觉"/>睡觉
   		    <input type="checkbox" name="hobby" value="打游戏"/>打游戏
   			<br/>
   		已婚：<input type="checkbox" name="married" value="true"/><br/>
   		<input type="submit" value="注册" />
   	</form>
   	--%>
  </body>
</html>
