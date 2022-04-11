package com.sz;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class Consumer80 {

    public static void main(String[] args) {
        SpringApplication.run(Consumer80.class, args);
    }
}