package org.openea;

import org.openea.common.lb.annotation.EnableFeignInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@EnableFeignInterceptor
@EnableDiscoveryClient
//@EnableRedisHttpSession
@SpringBootApplication
public class UaaServerApp {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(UaaServerApp.class);
		application.setEnvironmentPrefix("ea-uaa");
		application.run(args);
	}
}
