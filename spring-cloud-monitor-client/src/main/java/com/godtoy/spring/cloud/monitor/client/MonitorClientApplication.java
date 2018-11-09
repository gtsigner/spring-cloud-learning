package com.godtoy.spring.cloud.monitor.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MonitorClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(MonitorClientApplication.class, args);
    }
}
