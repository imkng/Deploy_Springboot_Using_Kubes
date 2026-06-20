package com.docker_eample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerEampleApplication {

	@GetMapping("/message")
	public String getMessage(){
		return "Congratulation successfully deployed application on kubes!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerEampleApplication.class, args);
	}

}
