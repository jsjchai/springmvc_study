package com.springmvc.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/springmvc")
public class RequestMappingTest {

	@RequestMapping("/test")
	public String test(){
		System.out.println("test");
		return "success";
	}
	
	@RequestMapping(value="/testMethod",method=RequestMethod.POST)
	public String testMethod(){
		return "success";
	}
	/**
	 * headers params
	 * @return
	 */
	@RequestMapping(value="/testParamsAndHeaders",params={"username=chai","age!=10"},
	headers="Accept-Language=zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3")       
	public String testParamsAndHeaders(){
		System.out.println("testParamsAndHeaders");
		return "success";  
	}
	
	/**
	 * Ant∆•≈‰:
	 * 1.* 
	 * 2.** 
	 * 3.?
	 * @return
	 */
	@RequestMapping("/*/testAntPath")  
	public String testAntPath(){
		System.out.println("testAntPath");
		return "success";
	}
}
