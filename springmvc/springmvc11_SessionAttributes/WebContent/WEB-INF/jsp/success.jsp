<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>success</title>
</head>
<body>
   success page!<br>
  user:${requestScope.user}<br>
  user:${sessionScope.user}<br>
  e-mail:${requestScope.email}<br>
  e-mail:${sessionScope.email}<br>
</body>
</html>