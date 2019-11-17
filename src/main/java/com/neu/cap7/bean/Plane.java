package com.neu.cap7.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Plane implements ApplicationContextAware {
    private ApplicationContext context;
    public Plane() {
        System.out.println("Plane construtor ...");
    }

    @PostConstruct
    public void init() {
        System.out.println("Plane PostConstruct ...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Plane PreDestroy ...");
    }
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //将application传进来
        this.context=applicationContext;
    }
}
