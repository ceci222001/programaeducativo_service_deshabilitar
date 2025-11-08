package com.idgs12.programaeducativo.programaeducativo_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class ProgramaeducativoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgramaeducativoServiceApplication.class, args);
	}

}
