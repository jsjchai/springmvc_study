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
			$.post("jqueryServlet?action=post",{"name":"张三","age":25},function(data,textStatus){
				alert(data);
				//alert(textStatus);
				$("#name").val(data.name);
				$("#age").val(data.age);
			},"json");
		});
	});
</script>
<title></title>
</head>
<body>
	<input type="button" id="b1" value="jquery ajax获得数据"><br><br>
	姓名：<input type="text" id="name"><br><br>
	年龄：<input type="text" id="age">
</body>
</html>