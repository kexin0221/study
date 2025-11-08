package com.bite.springiocdemo.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    public void print() {
        System.out.println("Hello configuration");
    }
}
