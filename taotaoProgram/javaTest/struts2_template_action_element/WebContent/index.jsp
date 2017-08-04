<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>你好</p>
<a href="${pageContext.request.contextPath }/action3.action">第三种创建动作类的方法</a><hr>
<a href="${pageContext.request.contextPath }/defaultAction.action">第三种创建动作类的方法</a><br>

<a href="${pageContext.request.contextPath }/add_User.action">添加新用户</a><hr>
<a href="${pageContext.request.contextPath }/delete_User.action">删除用户</a><hr>
<a href="${pageContext.request.contextPath }/update_User.action">修改用户</a><hr>
<a href="${pageContext.request.contextPath }/find_User.action">查询用户</a><hr>

<a href="${pageContext.request.contextPath }/user!addUser.action">添加用户</a><hr>
<a href="${pageContext.request.contextPath }/user!deleteUser.action">删除用户</a><hr>
<a href="${pageContext.request.contextPath }/user!updateUser.action">修改用户</a><hr>
<a href="${pageContext.request.contextPath }/user!findUser.action">查询用户</a><hr>


</body>
</html>