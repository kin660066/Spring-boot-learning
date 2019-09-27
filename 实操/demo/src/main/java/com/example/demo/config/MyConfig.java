package com.example.demo.config;

import com.example.demo.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public Person person2(){
        System.out.println("bean has created");
        return new Person();
    }
}
