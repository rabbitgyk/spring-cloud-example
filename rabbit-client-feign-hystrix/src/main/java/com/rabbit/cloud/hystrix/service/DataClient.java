package com.rabbit.cloud.hystrix.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rabbit.cloud.common.model.ResultBean;

@FeignClient("rabbit-provider")
@RequestMapping("/provider")
public interface DataClient {

	@GetMapping("/dc")
	String dcConsumer();
	
	@GetMapping("/result")
	ResultBean resultConsumer();
}
