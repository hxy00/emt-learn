package com.emt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EmtServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmtServerConfigApplication.class, args);
	}
}
