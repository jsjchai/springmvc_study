<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajax和Json</title>
<script type="text/javascript">
		function getNameAndAge() {
			
			var xmlHttp=new XMLHttpRequest();
			xmlHttp.open("get", "jsonServlet", true);
			xmlHttp.send();
			xmlHttp.onreadystatechange= function(){
				if(xmlHttp.readyState==4&&xmlHttp.status==200){
					//alert(xmlHttp.responseText);
					//转化Object类型 
					/*
					*1.var json = (new Function('return '+param +';'))();
					*2.eval('var json = '+param);
					*/
					var dataObj=eval('(' + xmlHttp.responseText + ')');
					//alert(dataObj);
					//alert(dataObj.age);
					document.getElementById("name").value=dataObj.name;
					document.getElementById("age").value=dataObj.age;
				}
			};
		}
</script>
</head>
<body>
	<div style="text-align: center;">
		<div>
			<input type="button" id="button" value="ajax获取值" onclick="getNameAndAge()">
		</div>
	</div>
</body>
</html>