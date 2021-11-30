package com.estore.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Controller and APp
 * @author Onkar Prakash Devale
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class APIGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(APIGatewayServiceApplication.class, args);
	}

}
