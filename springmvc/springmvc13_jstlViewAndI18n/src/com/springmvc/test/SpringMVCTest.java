package com.springmvc.test;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springmvc.model.User;


@Controller
@RequestMapping("/springmvc")
@SessionAttributes(value={"user"})
public class SpringMVCTest {

	@ModelAttribute  
	public void getUser(@RequestParam("id") int id,Map<String,Object> map){
		
			User user=new User(1, "chai", 22, "1234");
			System.out.println("µÃµ½user"+user);
			map.put("user", user);
		
	}
	@RequestMapping("testModelAttribute")
	public String testModelAttribute(@ModelAttribute("user")  User user){
		System.out.println("testModelAttribute"+user);
		return "success";
	}

}
