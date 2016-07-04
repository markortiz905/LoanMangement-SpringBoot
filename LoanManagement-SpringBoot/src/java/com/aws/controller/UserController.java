package com.aws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@RequestMapping
	@ResponseBody
	public String home() {
		return "Im home";
	}
	
	@RequestMapping(value="/showParam")
	@ResponseBody
	public String showParam(@PathVariable String param1) {
		return param1;
	}
}
