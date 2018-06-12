package com.neunzwei.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${zuul.routes.api-a.path}")
	String path;

	@RequestMapping("/hi")
	public String hi() {
		return path;
	}
}
