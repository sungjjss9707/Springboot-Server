package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import com.example.controller;

@SpringBootApplication
//@ComponentScan(basePackages = "com.example.demo")
public class HelloRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloRestApplication.class, args);
	}

}
