package com.zs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class CloudSimpleClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudSimpleClientApplication.class, args);
	}
}
