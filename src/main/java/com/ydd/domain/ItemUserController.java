package com.ydd.domain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("items")
public class ItemUserController {
	
	@RequestMapping("forward")
	public String forward(){
		
		return "success";
	}

}
