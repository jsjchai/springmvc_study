package com.springmvc.test;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springmvc")
public class SpringMVCTest {

	@RequestMapping("/testServletAPI")
	public void testServletAPI(HttpServletRequest request,
			HttpServletResponse response,Writer out) throws IOException {
		System.out.println("testServletAPI:request"+request+" response"+response);
		out.write("hello springmvc");
	}

}
