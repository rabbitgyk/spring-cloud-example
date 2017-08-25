package com.rabbit.cloud.clientribbon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class WebController {
	
	private Logger log = LoggerFactory.getLogger(WebController.class);

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/dc")
	public String dc(){
		log.info("接收到 consumer 请求");
		return restTemplate.getForEntity("http://rabbit-provider/provider/dc", String.class).getBody();
	}
	
//	@RequestMapping("/plus")
//	public int plus(int a, int b){
//		log.info("consumer request parameters a: {}, b: {}", a, b);
//		return restTemplate.getForEntity("http://SPRING-CLOUD-SERVICE-APP/compute/plus?a={a}&b={b}", Integer.class, a, b).getBody();
//	}
//	
//	@RequestMapping("/name")
//	public String name(String name){
//		return restTemplate.getForEntity("http://SPRING-CLOUD-SERVICE-APP/compute/name?name={name}", String.class, name).getBody();
//	}
	
}
