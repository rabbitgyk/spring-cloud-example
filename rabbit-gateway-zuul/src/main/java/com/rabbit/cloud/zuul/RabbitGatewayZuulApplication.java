package com.rabbit.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class RabbitGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitGatewayZuulApplication.class, args);
	}
}
