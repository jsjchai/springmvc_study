package com.springmvc.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@RequestMapping("/springmvc")
@SessionAttributes(value={"user"})
public class SpringMVCTest {

	/**
	 * 文件上传  
	 * @param body
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/upload")
	public  String upload(@RequestBody String body){
		System.out.println(body);
		return "upload"+new Date();
	}
	
	/**
	 * 下载
	 * @param session
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/download")
	public ResponseEntity<byte[]> download(HttpSession session) throws IOException{
		byte[] body=null;
		ServletContext servletContext=session.getServletContext();
		//getResourceAsStream 以 InputStream 对象的形式返回位于指定路径上的资源。
		InputStream in=servletContext.getResourceAsStream("/file/1.txt");
		//in.available() 返回此输入流下一个方法调用可以不受阻塞地从此输入流读取（或跳过）的估计字节数。
		body=new byte[in.available()];
		in.read(body);
		
		//代表HTTP请求和响应头,字符串头名称映射到的字符串值列表。
		HttpHeaders headers=new HttpHeaders();
		
/*		Content-disposition 是 MIME 协议的扩展，MIME 协议指示 MIME 用户代理如何显示附加的文件。
 * 当 Internet Explorer 接收到头时，它会激活文件下载对话框，它的文件名框自动填充了头中指定的文件名。
 * （请注意，这是设计导致的；无法使用此功能将文档保存到用户的计算机上，而不向用户询问保存位置。）
*/		
		headers.add("Content-Disposition", "attachment;filename=1.txt");
		
		//HTTP状态码   HttpStatus.OK 请求已成功，请求所希望的响应头或数据体将随此响应返回
		HttpStatus status=HttpStatus.OK;
		
		/**
		 * 可以通过检索HTTP状态码系列系列
		 */
		ResponseEntity<byte[]> response=new ResponseEntity<byte[]>(body, headers,status);
		return response;
	}
}
