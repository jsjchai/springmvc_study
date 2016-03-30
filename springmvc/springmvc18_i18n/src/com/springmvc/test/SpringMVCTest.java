package com.springmvc.test;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@RequestMapping("/springmvc")
@SessionAttributes(value={"user"})
public class SpringMVCTest {

	@Resource
	private ResourceBundleMessageSource messageSource;
	
	@RequestMapping("/testI18n")
	public String testI18n(Locale locale){
		System.out.println(locale);
		String val=messageSource.getMessage("i18n.country", null, locale);
		System.out.println(val);
		return "i18n";
	}
}
