package com.kb.star;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.kb.shop.repository")
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }
}