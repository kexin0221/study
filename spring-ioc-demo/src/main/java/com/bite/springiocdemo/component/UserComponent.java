package com.bite.springiocdemo.component;

import org.springframework.stereotype.Component;

@Component
public class UserComponent {
    public void print() {
        System.out.println("Hello component");
    }
}
