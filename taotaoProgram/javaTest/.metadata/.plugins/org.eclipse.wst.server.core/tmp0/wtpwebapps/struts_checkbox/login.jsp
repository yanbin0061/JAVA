<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>重复提交表单</title>
</head>
<body>
<!--  
     <s:form action="login">
           <s:textfield name="username" label="用户名"></s:textfield>
           <s:submit value="提交"></s:submit>
     </s:form>
     -->
     <s:token></s:token>
     <s:form action="login">
        <s:textfield name="username" label="用户名"/>
        <s:submit value="提交"/>
    </s:form>
</body>
</html>