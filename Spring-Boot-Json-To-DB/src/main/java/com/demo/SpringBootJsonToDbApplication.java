package com.demo;

import java.io.IOException;

import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import com.demo.model.*;
import com.demo.service.UserService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.bind.v2.model.core.TypeRef;

@EntityScan("com.demo.model")
@SpringBootApplication
public class SpringBootJsonToDbApplication {

	public static void main(String[] args) {
		System.out.println("Start ");
		SpringApplication.run(SpringBootJsonToDbApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(UserService userService){
		System.out.println("userService: "+userService);
	    return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<TenderBasicDetails>> typeReference = new TypeReference<List<TenderBasicDetails>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/userActivity.json");
			System.out.println("inputStream:"+inputStream);
			try {
				List<TenderBasicDetails> users = mapper.readValue(inputStream,typeReference);
				System.out.println("users:"+users);
				userService.save(users);
				System.out.println("Users Saved!");
			} catch (IOException e){
				System.out.println("Unable to save users: "+e.getMessage());
			}
	    };
	}

}
