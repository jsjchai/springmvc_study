<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.2.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		$("#b1").click(function(){
			alert("111");
			$("#d1").load("jqueryServlet?action=load");
		});
	});
</script>
<title></title>
</head>
<body>
	<input type="button" id="b1" value="jquery ajax获得数据">
	<div id="d1"></div>
</body>
</html>