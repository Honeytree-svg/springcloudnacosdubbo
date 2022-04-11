package com.sz.service.impl;

import com.sz.service.HelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "HelloServiceImpl,nacos dubbo";
    }
}
