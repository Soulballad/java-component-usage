package com.soulballad.usage.splitdb.sharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.soulballad.usage.splitdb.sharding.mapper")
public class GpShardApp {
	public static void main(String[] args) {
		SpringApplication.run(GpShardApp.class, args);
	}

}
