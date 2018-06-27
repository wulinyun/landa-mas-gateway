package com.landasoft.mas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class LandaMasGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LandaMasGatewayApplication.class, args);
	}
}
