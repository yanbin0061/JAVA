<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>静态参数封装</title>
</head>
<body>
     <form action="${pageContext.request.contextPath}/action3.action" method="post">
                              用户名:<input type="text" name="user.userName"><hr>
                              年龄:<input type="text" name="user.age"><br>
              <input type="submit" value="提交">
     </form>
</body>
</html>