package com.springmvc.test;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springmvc.model.User;

@Controller
@RequestMapping("/springmvc")
@SessionAttributes(value={"user"},types={String.class})
public class SpringMVCTest {

	/**
	 * session request都有值
	 * 值匹配，类型匹配  
	 * @param map
	 * @return
	 */
	@RequestMapping("/testSessionAttribtes")
	public String testSessionAttribtes(Map<String,Object> map)  {
		User user=new User();
		user.setId(111);
		user.setName("zz");
		map.put("user", user);
		map.put("email", "123@123.com");
		return "success";
	}

}
