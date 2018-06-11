package com.neunzwei.service;

import com.neunzwei.service.impl.HelloServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "my-eureka-client", fallback = HelloServiceImpl.class)
public interface HelloService {

	@RequestMapping("/hi")
	String hiService(@RequestParam("name") String name);

}
