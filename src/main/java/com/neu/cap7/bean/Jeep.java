package com.neu.cap7.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Jeep {
    public Jeep() {
        System.out.println("jeep construtor ...");
    }

    @PostConstruct
    public void init() {
        System.out.println("jeep PostConstruct ...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("jeep PreDestroy ...");
    }
}
