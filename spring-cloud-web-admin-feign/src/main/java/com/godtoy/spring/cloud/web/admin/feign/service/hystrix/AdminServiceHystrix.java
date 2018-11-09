package com.godtoy.spring.cloud.web.admin.feign.service.hystrix;

import com.godtoy.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return String.format("Not request %s", message);
    }
}
