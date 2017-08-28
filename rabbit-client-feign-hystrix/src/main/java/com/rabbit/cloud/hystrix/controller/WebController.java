package com.rabbit.cloud.hystrix.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rabbit.cloud.common.model.ResultBean;
import com.rabbit.cloud.hystrix.model.ResponseBean;
import com.rabbit.cloud.hystrix.service.DataClient;

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
	
	@HystrixCommand(fallbackMethod = "resultFallback")
	@GetMapping("/result")
	public ResultBean result(){
		log.info("接收到 result consumer 请求");
		return dataClient.resultConsumer();
	}
	
	public ResultBean resultFallback(){
		log.info("result fallback...");
		ResultBean result = new ResultBean();
		result.setAge(10);
		result.setCode("WZF999");
		result.setMsg("失败");
		return result;
	}
	
	@HystrixCommand
	@GetMapping("/result/one")
	public String resultOne(){
		log.info("接收到 result consumer one 请求");
		return dataClient.resultConsumerOne();
	}
	
	@GetMapping("/result/two")
	public ResponseBean resultTwo(){
		log.info("接收到 result consumer two 请求");
		return dataClient.resultConsumerTwo();
	}
	
	
}
