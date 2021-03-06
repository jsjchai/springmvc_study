package com.springmvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@RequestMapping("/springmvc")
@SessionAttributes(value={"user"})
public class SpringMVCTest {

	@RequestMapping("/testRedirect")
	public String testRedirect() {
		System.out.println("testView");
		return "redirect:/index.jsp";  
	}
}
