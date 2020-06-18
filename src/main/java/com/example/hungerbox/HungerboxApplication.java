package com.example.hungerbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD

@SpringBootApplication
=======
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
>>>>>>> 8322256d1ba0f76580d58dc3dceaba3367847b17
public class HungerboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(HungerboxApplication.class, args);
	}

}
