<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fmt:message key="i18n.language"></fmt:message>
	<a href="i18n">country</a><br><br>
	<a href="i18n?Locale=zh_CH">中文</a><br><br>
	<a href="i18n?Locale=en-US">英文</a><br><br>
</body>
</html>