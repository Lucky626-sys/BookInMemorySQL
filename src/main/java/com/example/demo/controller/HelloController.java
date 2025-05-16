package com.example.demo.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	//GetMapping=getter
	@GetMapping("/hello")
	//回應給前端的內容=return=responseBody
	@ResponseBody
	public String hello() {
		return "hello" + new Date();
	}
	
	@GetMapping("/hi")
	@ResponseBody
	public String hi() {
		return "hi" + new Date();
	}
	
	@GetMapping("/welcome")
	public String welcome(Model model) {
		model.addAttribute("name", "阿山哥");
		model.addAttribute("now", new Date());
		return "welcome";
	}
}
