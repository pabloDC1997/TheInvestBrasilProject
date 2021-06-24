package com.theinverstbrasil.theinvestbrasilserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class TheinvestbrasilserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheinvestbrasilserverApplication.class, args);
	}
	
	@GetMapping("/")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Hello %s!", name);
	}

}
