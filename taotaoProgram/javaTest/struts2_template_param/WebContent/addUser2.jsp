<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>动态数据参数封装的第一种形式</title>
</head>
<body>
      表单中的名字必须和数据模型中的名字一致 
     <form action="${pageContext.request.contextPath}/action2.action" method="post">
                              用户名:<input type="text" name="userName"><hr>
                              年龄:<input type="text" name="age"><br>
              <input type="submit" value="提交">
     </form>
</body>
</html>