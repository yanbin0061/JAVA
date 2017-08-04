<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>静态参数封装</title>
</head>
<body>
     <form action="${pageContext.request.contextPath}/action4.action" method="post">
     <%--需要注意name属性的取值，已经不是一个普通的字符串 --%>
                              用户名:<input type="text" name="userName"><hr>
                              年龄:<input type="text" name="age"><br>
              <input type="submit" value="提交">
     </form>
</body>
</html>