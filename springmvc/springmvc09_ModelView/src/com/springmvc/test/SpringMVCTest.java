package com.springmvc.test;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/springmvc")
public class SpringMVCTest {

	@RequestMapping("/testModelAndView")
	public ModelAndView testModelAndView()  {
		String viewName="success";
		ModelAndView modelAndView=new ModelAndView(viewName);
		modelAndView.addObject("time", new Date());
		return modelAndView;
	}

}
