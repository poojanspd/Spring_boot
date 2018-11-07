package com.imcs.trng.customermvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan
public class CustomermvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomermvcApplication.class, args);
	}
}
