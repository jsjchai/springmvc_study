<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<!--
	 	enctype 属性规定在发送到服务器之前应该如何对表单数据进行编码
	 	multipart/form-data 不对字符编码。在使用包含文件上传控件的表单时，必须使用该值。
    -->
    <h4>上传</h4>
	<form action="/springmvc/upload" method="post" enctype="multipart/form-data">
		<input type="file" name="file">
		<input type="text" name="description">
		<input type="submit" value="submit">
	</form>
	 <h4>下载</h4>
	 <a href="/springmvc/download">download</a>
</body>
</html>