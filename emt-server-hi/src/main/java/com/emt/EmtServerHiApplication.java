package com.emt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmtServerHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmtServerHiApplication.class, args);
	}
}
