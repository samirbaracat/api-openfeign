package com.samdevweb.apiopenfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ApiopenfeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiopenfeignApplication.class, args);
	}

}
