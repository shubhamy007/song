package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
public class MsProductApplication {

	public static void main(String[] args) {
		System.out.println("Welcome");
		SpringApplication.run(MsProductApplication.class, args);
		System.out.println("Welcome Again");

	}
	/////////////////////////////////
	
	
	
	@Bean
	public RestTemplate restTemplate()
	{
		RestTemplate rt=new RestTemplate();
		return rt;
		
	}

}
