package com.ydd.spring;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping("list")
	public String list(Model model){
		List<User> list = new ArrayList<User>();
		
		User user1 = new User();
		user1.setId(1);
		user1.setUsername("张三");
		user1.setBirthday(new Date());
		user1.setAddress("pek");
		user1.setSex("男");
		
		User user2 = new User();
		user2.setId(2);
		user2.setUsername("张三2");
		user2.setBirthday(new Date());
		user2.setAddress("pek");
		user2.setSex("男");
		
		User user3 = new User();
		user3.setId(3);
		user3.setUsername("张三3");
		user3.setBirthday(new Date());
		user3.setAddress("pek");
		user3.setSex("男");
		
		list.add(user1);
		list.add(user2);
		list.add(user3);
		
		model.addAttribute("list", list);		
		
		return "list";
	}

	//@RequestMapping("update")
	@RequestMapping("update/{id}")
	public String update(@PathVariable Integer id){
		System.out.println(id);
		
		return "redirect:/user/list.do";
		
	}
	
	@RequestMapping("forward")
	public String forward(){
		//return "forward:list.do";
		//return "forward:/user/list.do";
		return "forward:/items/forward.do";
		
		
	}
	
	@RequestMapping("redirect")
	public String redirect(){
		
		return "redirect:/items/forward.do";
		
		
	}
}
