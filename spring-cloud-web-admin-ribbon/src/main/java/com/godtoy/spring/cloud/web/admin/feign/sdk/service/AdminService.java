package com.godtoy.spring.cloud.web.admin.feign.sdk.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String message) {
        return restTemplate.getForObject("http://spring-cloud-service-config/hi?message=" + message, String.class);
    }


    //熔断器返回结果
    public String hiError(String message) {
        return String.format("Hi your message is %s, but request bad", message);
    }
}
