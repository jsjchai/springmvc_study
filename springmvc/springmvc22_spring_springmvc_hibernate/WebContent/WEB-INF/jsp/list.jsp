<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工信息</title>
</head>
<body>
<center>
	<a href="/addUI">添加</a>
	<table border="1">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>地址</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${userList}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.address}</td>
				<td>
					<a href="/delete?id=${user.id}">删除</a>
					<a href="/editUI?id=${user.id}">修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</center>
</body>
</html>