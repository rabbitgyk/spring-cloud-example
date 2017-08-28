package com.rabbit.cloud.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringCloudApplication
public class RabbitHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitHystrixDashboardApplication.class, args);
	}
}
