package com.springmvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR,reason="姓名不匹配")  
public class NotMatchName extends RuntimeException{
  
	/**
	 *   
	 */
	private static final long serialVersionUID = 7353427243844216022L;
	public NotMatchName() {
		super("NotMatchName");
	}
}
