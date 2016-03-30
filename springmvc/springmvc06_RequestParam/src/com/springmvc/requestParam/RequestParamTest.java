package com.springmvc.requestParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/springmvc")
public class RequestParamTest {  
	
	/**
	 * �õ�ҳ�洫�����Ĳ���
	 * required �Ƿ���봫��
	 * defaultValue Ĭ��ֵ
	 * @param name
	 * @param id
	 * @return
	 */
	@RequestMapping("/testRequestParam")
	public String testRequestParam(@RequestParam("name") String name,
	@RequestParam(value="age",required=false,defaultValue="0") int id){  
		System.out.println("testRequestParam:name="+name+" id="+id);
		return "success";
	}
	
	/**
	 * �õ�����ͷ
	 * @param name
	 * @param id
	 * @return
	 */
	@RequestMapping("/testRequestHeader")
	public String testRequestHeader(@RequestHeader("Accept-Language") String language){
		System.out.println("testRequestHeader:language="+language);
		return "success";
	}
	
	/**
	 * �õ�cookie
	 * @param sessionId
	 * @return
	 */
	@RequestMapping("/testCookieValue")
	public String testCookieValue(@CookieValue("JSESSIONID")String sessionId){
		System.out.println("testRequestHeader:sessionId="+sessionId);
		return "success";
	}

}
