package com.fst.commandeapiv6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.fst.commandeapiv6.domain.rest")
public class CommandeApiV6Application {

	public static void main(String[] args) {
		SpringApplication.run(CommandeApiV6Application.class, args);
	}

}
