package com.sz.controller;

import com.sz.service.RpcCallServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private RpcCallServiceImpl rpcCallService;

    @GetMapping("/hello")
    public String sayHelloFunc() {
        return rpcCallService.sayHello();
    }
}
