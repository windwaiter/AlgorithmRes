<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>我是一个登录页面！</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
<!--   <form action="login/loginindex" method="post"> -->
<!--   用户名:<input type="text" name="username"/> -->
<!--   密码：<input type="password" name="password"/> -->
<!--   <input type="submit"/> -->
<!--   </form> -->
<sf:form method="POST" commandName="user" action="login/loginindex">
用户名：<sf:input path="username"/><br/>
密码：<sf:password path="password"/><br/>
<input type="submit" value="登录"/><br/>
<a href="http://www.singlewindow.cn/singlewindow/table.jspx?area_id=230000"><b>中国国际单一窗口</b></a>
</sf:form>
  </body>
</html>
