package com.example.publicationsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PublicationsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PublicationsServiceApplication.class, args);
    }

}
