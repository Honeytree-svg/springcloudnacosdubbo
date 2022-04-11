package com.sz.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;


@Service
public class RpcCallServiceImpl{

    @Reference
    private HelloService helloService;

    public String sayHello() {
        return helloService.sayHello();
    }
}
