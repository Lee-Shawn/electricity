package com.laughing.electricity.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.laughing.electricity.product.dao")
@SpringBootApplication
public class ElectricityProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectricityProductApplication.class, args);
	}

}
