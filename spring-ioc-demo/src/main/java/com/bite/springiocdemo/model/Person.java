package com.bite.springiocdemo.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "person")
@Component
@Data
public class Person {
    public Integer id;
    public String name;
    public Integer age;
}
