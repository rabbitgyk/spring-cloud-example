package com.rabbit.cloud.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbit.cloud.common.model.ResultBean;

@RestController
@RequestMapping("/provider")
public class DataController {

	@Autowired
    DiscoveryClient discoveryClient;
    
	@GetMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
	
	@GetMapping("/result")
	public ResultBean result(){
		System.out.println("收到 result 请求。");
		ResultBean result = new ResultBean();
		result.setAge(10);
		result.setCode("WZF000");
		result.setMsg("成功");
		return result;
	}
	
}
