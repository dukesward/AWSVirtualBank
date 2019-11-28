package com.virtualBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.virtualBank")
public class VirtualBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualBankApplication.class, args);
	}

}
