package com.xiongcz.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xiongcz.entity.User;



@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addUser(User user,ModelMap model){
		System.out.println(user);
		model.addAttribute(user);
		return "hello";
	}
	
	@RequestMapping("index")
	public String firstPage(){
		return "index";
	}

}
