<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/springmvc/testModelAttribute" method="post">
		<input type="hidden" name="id" value="1"><br>
		<br> 用户名:<input type="text" name="name" value="chai"><br>
		<br> 年龄：<input type="text" name="age" value="22"><br>
		<br> <input type="submit" value="提交">
		<!-- 不能国际化 -->
		<fmt:message key="i18n.username"></fmt:message>
	</form>
</body>
</html>