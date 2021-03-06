package com.laughing.electricity.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ElectricityGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectricityGatewayApplication.class, args);
	}

}
