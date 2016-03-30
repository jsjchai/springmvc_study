package com.springmvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springmvc")
public class PathVariableTest {

	/**
	 * @PathVariable-->{} 
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id){    
		System.out.println("PathVariable:"+id);
		return "success";
	}
}
	

