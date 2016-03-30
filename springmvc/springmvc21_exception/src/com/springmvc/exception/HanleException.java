//package com.springmvc.exception;
//
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.ModelAndView;
//
//@ControllerAdvice
//public class HanleException {
//
//	@ExceptionHandler({RuntimeException.class})    
//	public ModelAndView HanleException1(Exception ex){
//		System.out.println("[Exception]:"+ex);   
//		ModelAndView modelAndView=new ModelAndView("error");
//		modelAndView.addObject("exception", ex);
//		return modelAndView;     
//	}
//	
//}
