package com.springmvc.crud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/springmvc")
public class RestTest {

	/**
	 * ²éÑ¯
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/get/{id}",method=RequestMethod.GET)
	public String get(@PathVariable("id") int id){
		System.out.println("get:"+id);
		return "success";
	}
	/**
	 * É¾³ý
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public String delete(@PathVariable int id){
		System.out.println("delete:"+id);
		return "success";
	}
	/**
	 * Ìí¼Ó
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/post",method=RequestMethod.POST)
	public String post(){
		System.out.println("post");
		return "success";
	}
	/**
	 * ÐÞ¸Ä
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/put/{id}",method=RequestMethod.PUT)
	public String put(@PathVariable int id ){
		System.out.println("put:"+id);
		return "success";
	}
}
	

