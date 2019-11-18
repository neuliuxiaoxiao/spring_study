package com.neu.cap12.config;

import com.neu.cap9.bean.Moon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Cap12MainConfig {
    @Bean
    public Moon getMoon(){
        return new Moon();
    }
}
