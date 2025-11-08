package com.bite.springiocdemo.component;

import com.bite.springiocdemo.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class StudentComponent {
    @Bean("s")
    public Student student() {
        return new Student("zhangsan", 18);
    }
//    @Bean("s3")
//    public Student s1 () {
//        return new Student("ZhangSan", 11);
//    }
//    @Bean
//    private String name() {
//        return "lisi";
//    }
    @Bean
    public Student student2 () {
        return new Student("lisi", 20);
    }
}
