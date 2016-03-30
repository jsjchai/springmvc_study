<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>Insert title here</title>
</head>
<body>

	<form action="/springmvc/testPojo" method="post">
		<input type="hidden" name="id" value="1"><br><br>
		姓名：<input type="text" name="name"><br><br>
		年龄：<input type="text" name="age"><br><br>
		地址：<input type="text" name="address.province">省
		<input type="text" name="address.city">市
		<input type="text" name="address.county">县<br><br>
		<input type="submit" value="提交">
	</form>
</body>
</html>