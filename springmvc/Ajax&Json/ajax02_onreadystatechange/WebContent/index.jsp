<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用ajax发送get和post请求</title>
<script type="text/javascript">
	function getUserName(){
		var xmlHttp;
		if(window.XMLHttpRequest){
			xmlHttp=new XMLHttpRequest();
		}else{
			//IE6浏览器 
			xmlHttp=new ActiveObject("Microsoft.XMLHTTP");
		}
		//alert("readstate="+xmlHttp.readyState+"   "+"status="+xmlHttp.status);
		xmlHttp.open("get","xmlHttpRequestServlet",false);
		xmlHttp.send();
		xmlHttp.onreadystatechange= function(){
			//alert("readstate="+xmlHttp.readyState+" "+"status="+xmlHttp.status);
			if(xmlHttp.readyState==4&&xmlHttp.status==200){
				//responseText属性包含了从服务器返回的文字信息
				document.getElementById("text").value=xmlHttp.responseText;
			}
		};
	}
</script>
</head>
<body>
	<div style="text-align: center;">
		<div>
			<input type="text" name="username" id="text">&nbsp;&nbsp;
			<input type="button" value="提交" onclick="getUserName()">
		</div>
		<pre>
			XMLHttpRequest对象可以在不向服务器提交整个页面的情况下，实现局部更新网页。
			当页面全部加载完毕后，客户端通过该对象向服务器请求数据，服务器端接受数据并处理后，
			向客户端反馈数据。 XMLHttpRequest 对象提供了对 HTTP 协议的完全的访问，
			包括做出 POST 和 HEAD 请求以及普通的 GET 请求的能力。XMLHttpRequest 
			可以同步或异步返回 Web 服务器的响应，并且能以文本或者一个 DOM 文档形式返回内容。
			尽管名为 XMLHttpRequest，它并不限于和 XML 文档一起使用：它可以接收任何形式的文
			本文档。XMLHttpRequest 对象是名为 AJAX 的 Web 应用程序架构的一项关键功能。
		</pre>
	</div>
</body>
</html>