<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我是跳转后的页面！</title>
</head>
<body>
欢迎您来到这个网页！
<sf:form commandName="user">
用户名：<sf:input  path="username"/><br/>
密码：<sf:input path="password"/><br/>
</sf:form>
</body>
</html>