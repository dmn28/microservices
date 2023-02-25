package com.dmn.fraud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FraudApplication {
    public static void main(String[] args){
        SpringApplication.run(FraudApplication.class, args);
    }
}
