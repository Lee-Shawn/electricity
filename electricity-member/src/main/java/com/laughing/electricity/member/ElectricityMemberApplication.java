package com.laughing.electricity.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.laughing.electricity.member.feign") // 开启远程调用服务
public class ElectricityMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectricityMemberApplication.class, args);
	}

}
