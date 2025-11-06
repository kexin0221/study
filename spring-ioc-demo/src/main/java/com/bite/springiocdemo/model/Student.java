package com.bite.springiocdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    private String name;
    private Integer age;
}
