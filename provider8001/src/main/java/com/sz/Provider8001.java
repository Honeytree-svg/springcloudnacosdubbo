package com.sz;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class Provider8001 {

    public static void main(String[] args) {
        SpringApplication.run(Provider8001.class, args);
    }
}
