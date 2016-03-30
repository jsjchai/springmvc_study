<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>用户名校验</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/userVerify.css" />
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.11.2.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/userVerify.js"></script>
	</head>
	<body>
		请输入用户名:<input type="text" id="userName" class="userText"/> 
		<input type="button" value="校验" id="verifyButton" />
		<div id="result"></div>
	</body>
</html>