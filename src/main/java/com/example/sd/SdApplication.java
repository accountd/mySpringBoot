package com.example.sd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@MapperScan("com.example.sd.mapper")
@SpringBootApplication
public class SdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdApplication.class, args);
	}
}
