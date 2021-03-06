<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajax和Json</title>
<script type="text/javascript">
		function getArray() {
			
			var xmlHttp=new XMLHttpRequest();
			xmlHttp.open("get", "jsonServlet", true);
			xmlHttp.send();
			xmlHttp.onreadystatechange= function(){
				if(xmlHttp.readyState==4&&xmlHttp.status==200){
					alert(xmlHttp.responseText);
					//转化Object类型 
					/*
					*1.var json = (new Function('return '+param +';'))();
					*2.eval('var json = '+param);
					*/
					var dataObj=eval('(' + xmlHttp.responseText + ')');
					var tableObj=document.getElementById("tab");
					var row; //行
					var col1; //第一列
					var col2; //第二列
					for(var i=0;i<dataObj.students.length;i++){
						var student=dataObj.students[i];
						row=tableObj.insertRow(); //将新行添加到表的最后
						col1=row.insertCell();//第一列
						col2=row.insertCell();//第二列
						col1.innerHTML=student.name;
						col2.innerHTML=student.age;
					}
				}
			};
		}
</script>
</head>
<body>
	<div style="text-align: center;">
		<div>
			<input type="button" id="button" value="ajax获取值" onclick="getArray()"><br><br>
			<table id="tab" border="1" align="center">
				<tr>
					<th>姓名</th>
					<th>年龄</th>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>