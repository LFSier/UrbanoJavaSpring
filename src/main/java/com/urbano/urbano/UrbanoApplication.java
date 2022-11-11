package com.urbano.urbano;

import javax.activation.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class UrbanoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UrbanoApplication.class, args);
	}

}
