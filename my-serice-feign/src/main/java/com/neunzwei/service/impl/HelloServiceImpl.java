package com.neunzwei.service.impl;

import com.neunzwei.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String hiService(String name) {
		return "sorry " + name;
	}
}
