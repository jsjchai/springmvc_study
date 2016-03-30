<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <a href="springmvc/test">springmvc</a>
 <br>
 <a href="springmvc/testMethod">springmvc---->method</a>
 <br>
 <br>
 <form action="springmvc/testMethod" method="post">
 	<input type="submit">
 </form>
 <br>
 <!-- age!=10 -->
  <a href="springmvc/testParamsAndHeaders?username=chai&age=10"> testParamsAndHeaders</a>
<br>
  <a href="springmvc/testParamsAndHeaders?username=chai&age=20"> testParamsAndHeaders</a>
 <br>
<a href="springmvc/test/testAntPath">testAntPath</a>
</body>
</html>