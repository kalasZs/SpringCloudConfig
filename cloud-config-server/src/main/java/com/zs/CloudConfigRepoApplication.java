package com.zs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigRepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigRepoApplication.class, args);
	}
}
