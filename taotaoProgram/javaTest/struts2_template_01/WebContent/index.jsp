<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Struts2的配置文件</title>
</head>
<body>
<p>你好</p><br>
<a href="${pageContext.request.contextPath}/action1.action">以.action结尾的</a><br>
<a href="${pageContext.request.contextPath}/action1 }">没有以action结尾</a><br>
<a href="${pageContext.request.contextPath }/action1.do">do</a><br>
<a href="${pageContext.request.contextPath }/action1.abc">abc</a>
</body>
</html>