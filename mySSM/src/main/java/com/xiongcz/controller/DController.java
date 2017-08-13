package com.xiongcz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DController {
	@RequestMapping("/")
	public String indexPage(){
		return "index";
	}
}
