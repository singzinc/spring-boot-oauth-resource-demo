package com.singplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@EnableResourceServer
public class SpringBootOauthResourceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOauthResourceDemoApplication.class, args);
	}
	
	@RequestMapping("/")
	public String securedCall() {
		return "success (id: " + UUID.randomUUID().toString().toUpperCase() + ")";
	}
	
}
