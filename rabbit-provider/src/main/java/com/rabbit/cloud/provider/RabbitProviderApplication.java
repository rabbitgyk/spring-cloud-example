package com.rabbit.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RabbitProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitProviderApplication.class, args);
	}
}
