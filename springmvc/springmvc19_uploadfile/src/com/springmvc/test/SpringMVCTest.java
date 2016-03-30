package com.springmvc.test;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;


@Controller
@RequestMapping("/springmvc")
@SessionAttributes(value={"user"})
public class SpringMVCTest {

	
	@RequestMapping("/testMultipartResolver")
	public String testMultipartResolver(@RequestParam("desc") String desc,
			@RequestParam("file") MultipartFile file) throws IOException{
		System.out.println("testMultipartResolver"+file.getName());
		System.out.println("desc:"+desc);
		System.out.println("size:"+file.getSize());
		//文件名
		System.out.println("InputStream:"+file.getInputStream());
		System.out.println("fileName:"+file.getOriginalFilename());
		return "success";
	}
}
