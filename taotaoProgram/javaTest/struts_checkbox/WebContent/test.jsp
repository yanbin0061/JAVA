<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>测试例子</title>
</head>
<body>
    <s:token></s:token>
    <s:form action="login1">
        <s:textfield name="username" label="用户名"/>
        <s:submit value="提交"/>
    </s:form>


</body>
</html>