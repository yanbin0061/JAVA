<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>用户注册界面</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/register.action" method="post">
    用户名：<input type ="text",name="username"><br>
    密码：<input type ="password",name="password"><br>
    生日：<input type ="text",name="birthday"><br>
    爱好：<input type ="checkbox",name="hobby",value="吃饭">吃饭
    <input type ="checkbox",name="hobby",value="睡觉">睡觉
    <input type ="checkbox",name="hobby",value="唱歌">唱歌
    <br>
    已婚：<input type ="checkbox",name="married"><br>
    <input type="submit" value="注册">
    </form>
</body>
</html>