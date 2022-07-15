package com.soulballad.usage.schdeule.quartz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.soulballad.usage.schdeule.quartz.mapper")

public class QuartzApp {

	public static void main(String[] args) {
		SpringApplication.run(com.soulballad.usage.schdeule.quartz.QuartzApp.class, args);
	}
}
