package com.springmvc.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.model.User;
import com.springmvc.service.UserService;

@Controller
public class UserAction {

	@Resource
	private UserService userService;
	
	/**
	 * 用户查询
	 * @return
	 */
	@RequestMapping("/list")
	public String list(Map<String,Object> map){
		List<User> userList=userService.findAll() ;
		map.put("userList", userList);
		return "list";
	}
	/**
	 * 用户删除
	 * @return
	 */
	@RequestMapping("/delete")
	public String delete( int id){
		userService.delete(id);
		return "redirect:/list";
	}
	/**
	 * 用户添加页面
	 * @return
	 */
	@RequestMapping("/addUI")
	public String addUI(Map<String,Object> map){
		map.put("user", new User());
		return "saveUI";
	}
	/**
	 * 用户添加
	 * @return
	 */
	@RequestMapping("/add")
	public String add( User user,BindingResult result){
		//System.out.println(result);
		userService.save(user);
		return "redirect:/list";
	}
	/**
	 * 用户修改页面
	 * @return
	 */
	@RequestMapping("/editUI")
	public String editUI(int id,Map<String,Object> map){
		User user=userService.getById(id);
		map.put("user", user);
		return "saveUI";
	}
	/**
	 * 用户修改
	 * @return
	 */
	@RequestMapping("/edit")
	public String edit( User user){
		userService.update(user);
		return "redirect:/list";
	}
}
