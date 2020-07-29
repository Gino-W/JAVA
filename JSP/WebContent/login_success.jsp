<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<!--
		@User: Gino   
		@Time: 2020年6月8日下午3:38:47   
		@Encoding: UTF-8
	-->
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		欢迎<h3><%=session.getAttribute("loginUsername") %></h3>，登录成功！！！！
	</div>
</body>
</html>