package com.cujo.modelinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ModelinfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelinfoApplication.class, args);
	}
	
	@RequestMapping(value="/hello")
	public String hello() {
		return "Hello";
	}
}
