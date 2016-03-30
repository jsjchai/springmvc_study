package com.springmvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@RequestMapping("/springmvc")
@SessionAttributes(value={"user"})
public class SpringMVCTest {

	@RequestMapping("/testView")
	public String testView() {
		System.out.println("testView");
		return "helloView";
	}
}
