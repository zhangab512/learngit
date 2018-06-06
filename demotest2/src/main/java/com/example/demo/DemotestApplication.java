package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableAutoConfiguration
@ImportResource({"classpath*:applicationContext.xml"})
@MapperScan("com.example.demo.mapper")
public class DemotestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemotestApplication.class, args);
	}
}
