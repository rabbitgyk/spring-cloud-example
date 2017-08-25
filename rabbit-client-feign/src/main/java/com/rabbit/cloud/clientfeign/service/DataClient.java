package com.rabbit.cloud.clientfeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("rabbit-provider")
@RequestMapping("/provider")
public interface DataClient {

	@GetMapping("/dc")
	String dcConsumer();
}
