package com.example.springeureka;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@MapperScan("com.example.springeureka.dao")
@EnableMongoRepositories(basePackages = {"com.example.springeureka.mongdb"})
@EnableEurekaServer
@SpringBootApplication(scanBasePackages =  {"com.example.springeureka"} )
public class SpringEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaApplication.class, args);
    }

}
