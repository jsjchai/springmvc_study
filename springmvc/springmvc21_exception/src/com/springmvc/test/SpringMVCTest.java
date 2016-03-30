package com.springmvc.test;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.springmvc.exception.NotMatchName;


@Controller
public class SpringMVCTest {

//	@ExceptionHandler({ArithmeticException.class})
//	public ModelAndView HanleException(Exception ex){
//		System.out.println("Exception:"+ex);
//		ModelAndView modelAndView=new ModelAndView("error");
//		modelAndView.addObject("exception", ex);
//		return modelAndView;    
//	}

	
//	@ExceptionHandler({RuntimeException.class})    
//	public ModelAndView HanleException1(Exception ex){
//		System.out.println("HanleException1");  
//		System.out.println("[Exception]:"+ex);   
//		ModelAndView modelAndView=new ModelAndView("error");
//		modelAndView.addObject("exception", ex);
//		return modelAndView;     
//	}

	@RequestMapping("/testException")
	public String testException(@RequestParam("n")int n){
		int result=1/n;
		System.out.println(result);
		return "success";
	}
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="没有发现")
	@RequestMapping("/testResponseStatusExceptionResolver")
	public String testResponseStatusExceptionResolver(@RequestParam("name") String name){
		if(name.equals("c")){
			throw new NotMatchName();
		}
		else{
			System.out.println("testResponseStatusExceptionResolver");
		}
		return "success";
		
	}
}
