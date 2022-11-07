package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.BodyInserters.fromValue;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration
@SpringBootApplication
public class Boot3demoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Boot3demoApplication.class, args);
	}

	@Bean
	RouterFunction<ServerResponse> home() {
			return route(GET("/"), request -> ok().body(fromValue("Home")));
	}
}
