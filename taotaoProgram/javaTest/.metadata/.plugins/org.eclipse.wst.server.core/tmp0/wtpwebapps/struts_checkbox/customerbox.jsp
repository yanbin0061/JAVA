<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>一个表单的例子</title>
</head>
<body>
    <s:form action="saveCustomer">
    <%-- 
        <s:textfield name="name" label="用户名"/>
        <s:password name="password" label="密码"/>
        <s:checkbox name="married" label="已婚" value="true"></s:checkbox>
        <s:checkboxlist name="hobby" list="{'旅游','看电影','看书'}" label="爱好"></s:checkboxlist>
        <s:select name="city" list="#{'BJ':'北京','SH':'上海','XA':'西安' }" label="故乡" headerKey="" headerValue="-----请选择------"></s:select>
        <s:textarea name="description" lable="个人介绍" rows="5" clos="25"/>
        <s:radio list="gender" list="#{'male':'男','female':'女'}" value="'male'"></s:radio>
        <s:checkboxlist name="hobby" list=""/>
        <s:submit value="提交"/>
    --%>
    <s:textfield name="name" label="用户名"/>
    <s:password name="password" label="密码"/>
    <s:checkbox name="married" label="已婚" value="true"></s:checkbox>
    <s:checkboxlist name="hobby" list="{'旅游','看电影','看书'}" label="爱好"></s:checkboxlist>
    <s:select name="city" list="#{'BJ':'北京','SH':'上海','XA':'西安' }" label="故乡" headerKey="" headerValue="-----请选择------"></s:select>
    <s:textarea name="description" lable="个人介绍" rows="5" clos="25"/> 
    <s:radio name="gender" list="#{'male':'男','female':'女'}" value="'male'"></s:radio>
    <s:reset value="重置"></s:reset>
    <s:submit value="提交"/>    
    </s:form>
<s:debug/>
</body>
</html>