package com.rabbit.cloud.registrycentereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistryCenterEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryCenterEurekaApplication.class, args);
	}
}
