package com.spring.contents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ContentsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentsServiceApplication.class, args);
	}

}
