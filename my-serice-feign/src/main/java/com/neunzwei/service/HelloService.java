package com.neunzwei.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("my-eureka-client")
public interface HelloService {

	@RequestMapping("/hi")
	String hiService(@RequestParam("name") String name);

}
