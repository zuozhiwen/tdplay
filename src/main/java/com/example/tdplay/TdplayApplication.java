package com.example.tdplay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.tdplay.repository")
public class TdplayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TdplayApplication.class, args);
	}

}
