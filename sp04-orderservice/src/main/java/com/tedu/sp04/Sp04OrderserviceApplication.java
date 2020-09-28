package com.tedu.sp04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Sp04OrderserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp04OrderserviceApplication.class, args);
	}

}
