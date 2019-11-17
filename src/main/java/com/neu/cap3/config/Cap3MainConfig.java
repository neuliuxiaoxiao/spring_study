package com.neu.cap3.config;

import com.neu.cap1.Person;
import org.springframework.context.annotation.*;

@Configuration
public class Cap3MainConfig {

    /**
     * prototype 多实例 IOC容器启动，并不会去调用方法创建对象，而是每次获取的时候才会调用方法创建
     * singleton 单实例 IOC容器启动时会调用方法创建对象并放到IOC容器中，以后每次获取从容器中拿同一个
     * request 主要针对web应用，递交一次请求创建一个实例
     * session 同一个session创建一个实例
     * @return
     */
    @Bean
    @Scope("prototype")
    public Person person() {
        return new Person("james", 20);
    }
}
