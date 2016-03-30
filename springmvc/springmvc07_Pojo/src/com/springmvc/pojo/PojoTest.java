package com.springmvc.pojo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.model.User;

@Controller
@RequestMapping("/springmvc")
public class PojoTest {  
	
	@RequestMapping("/testPojo")
	public String testPojo(User user){
		System.out.println("testPojo:"+user);
		return "success";
	}

}
