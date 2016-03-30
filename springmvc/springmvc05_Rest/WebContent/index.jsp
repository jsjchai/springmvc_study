<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
 查询：<a href="/springmvc/get/1">get</a>
 <br>
 <form action="/springmvc/delete/1" method="post">
	 <input type="hidden" name="_method" value="delete">
	 <input type="submit" value="删除">
 </form>
 <br>
<form action="/springmvc/post" method="post">
	 <input type="submit" value="添加">
 </form>
 <br>
 <form action="/springmvc/put/1" method="post">
	<input type="hidden" name="_method" value="put" >
	 <input type="submit" value="更新">
 </form>
 <br>
</body>
</html>