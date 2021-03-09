package com.id;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	
	
	/*
	 * @Bean RouteLocator routeLocator(RouteLocatorBuilder builder) { return
	 * builder.routes()
	 * .route((r)->r.path("/clients/**").uri("lb://COUSTOMER-SERVICE"))
	 * .route((r)->r.path("/products/**").uri("lb://PRODUCT-SERVICE/")) .build(); }
	 */
	@Bean
	DiscoveryClientRouteDefinitionLocator defintionLocator(ReactiveDiscoveryClient rdc,DiscoveryLocatorProperties properties) {
		 return new DiscoveryClientRouteDefinitionLocator(rdc,properties);
	}
}