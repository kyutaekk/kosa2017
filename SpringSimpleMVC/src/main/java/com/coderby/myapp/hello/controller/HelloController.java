package com.coderby.myapp.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coderby.myapp.hello.service.IHelloService;


@Controller
public class HelloController{
	
	@Autowired
	IHelloService helloService;
	
	@RequestMapping("/hello")
		public String hello(String name, Model model){
			String result = helloService.sayHello(name);
			model.addAttribute("result", result);
			return "Hello";
		}
}
