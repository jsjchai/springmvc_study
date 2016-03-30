<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户添加</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.2.js"></script>
<script type="text/javascript">
	var val=window.location.search;
	if(val==null||val.length==0){
		$(document).ready(function(){
			  $("form").attr("action","add")
			});
	}
</script>
</head> 
<body>
<center>
	<form:form action="edit" method="post" modelAttribute="user" >
		<form:hidden path="id"/>
		姓名：<form:input path="name"/><br><br>
		地址：<form:input path="address"/><br><br>
		 <input type="submit" value="添加" />
	</form:form>
</center>
</body>
</html>