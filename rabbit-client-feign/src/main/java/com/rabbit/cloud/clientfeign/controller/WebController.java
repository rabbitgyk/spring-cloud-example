package com.rabbit.cloud.clientfeign.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbit.cloud.clientfeign.service.DataClient;

@RestController
@RequestMapping("/consumer")
public class WebController {
	
	private Logger log = LoggerFactory.getLogger(WebController.class);

	@Autowired
	private DataClient dataClient;
	
	@GetMapping("/dc")
	public String dc(){
		log.info("接收到 consumer 请求");
		return dataClient.dcConsumer();
	}
	
	
}
