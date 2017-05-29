package com.test.tl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("main")
public class MainController {

	@RequestMapping("/home")
	public String Home() {
		String str = "main/home";

		return str;
	}
	


}
