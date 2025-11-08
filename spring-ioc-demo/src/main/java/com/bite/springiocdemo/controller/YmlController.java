package com.bite.springiocdemo.controller;

import com.bite.springiocdemo.model.DbTypes;
import com.bite.springiocdemo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;


@Controller
public class YmlController {
    @Value("${my.key3}")
    private String myKey3;
    @Value("${my.key4}")
    private Integer myKey4;

    @Autowired
    public Person person;
    @Autowired
    public DbTypes dbTypes;

    @Value("${dbtypes.ball.k1}")
    public String v1;

    @javax.annotation.PostConstruct
    public void init() {
        System.out.println("myKey3: " + myKey3);
        System.out.println("myKey4: " + myKey4);
        System.out.println("person: " + person);
        System.out.println("dbtypes: " + dbTypes);
//        System.out.println("v1: " + v1);
    }
}
