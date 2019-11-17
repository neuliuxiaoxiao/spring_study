package com.neu.cap1.config;

import com.neu.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {
    //默认是方法名 person
    @Bean("abcperson")
    public Person person(){
        return new Person("james",20);
    }
}
