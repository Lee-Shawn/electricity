package com.laughing.electricity.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 开启nacos服务注册与发现功能
public class ElectricityCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectricityCouponApplication.class, args);
	}

}
