package com.ydd.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
	
	@RequestMapping("hello")
	public String myHello(){
		return "index";
	}
	
	@RequestMapping("add")
	public String myAdd(){
		return "add";
	}
	
	@RequestMapping("receiveInt")
	public String receiveInt(Integer id){
		System.out.println(id);
		return "success";
	}
	

}
