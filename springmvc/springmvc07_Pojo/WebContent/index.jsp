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
		������<input type="text" name="name"><br><br>
		���䣺<input type="text" name="age"><br><br>
		��ַ��<input type="text" name="address.province">ʡ
		<input type="text" name="address.city">��
		<input type="text" name="address.county">��<br><br>
		<input type="submit" value="�ύ">
	</form>
</body>
</html>