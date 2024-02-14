package com.example.SpringAppscicddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAppsCicdDemoApplication {

	@GetMapping("/message")
	public String message () {
		return "Successfully deployed the application to Azure Spring apps with Github Actions";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAppsCicdDemoApplication.class, args);
	}

}
