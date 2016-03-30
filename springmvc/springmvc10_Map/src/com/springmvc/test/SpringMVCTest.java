package com.springmvc.test;

import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springmvc")
public class SpringMVCTest {

	@RequestMapping("/testMap")
	public String testMap(Map<String,Object> map)  {
		System.out.println(map.getClass().getName());
		map.put("list", Arrays.asList("Tom","Joe","May"));
		return "success";
	}

}
