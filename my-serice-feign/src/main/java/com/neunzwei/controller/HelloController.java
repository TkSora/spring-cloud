package com.neunzwei.controller;

import com.neunzwei.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;

	@RequestMapping("/hi")
	public String hi(String name){
		System.out.println(name);
		return helloService.hiService(name);
	}
}
