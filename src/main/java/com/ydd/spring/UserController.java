package com.ydd.spring;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ydd.domain.User;
import com.ydd.domain.UserCustom;

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
	
	@RequestMapping("receiveString")
	public String receiveInt(String name){
		System.out.println(name);
		return "success";
	}
	
	@RequestMapping("receiveUser")
	public String receiveUser(User user){
		System.out.println(user);
		return "success";
		
	}
	
	@RequestMapping("receiveCustom")
	public String receiveUser(UserCustom user){
		System.out.println(user);
		return "success";
	}
	
	@RequestMapping("receiveArray")
	public String receiveUser(Integer[] ids){
		System.out.println(ids);
		return "success";
	}
	
	@RequestMapping("receiveUserList")
	public String receiveUserList(UserCustom uc){
		System.out.println(uc);
		return "success";
	}
	
	@RequestMapping("receiveMap")
	public String receiveMap(UserCustom uc){
		System.out.println(uc);
		return "success";
	}
		
}
