package com.neu.cap7.config;

import com.neu.cap1.Person;
import com.neu.cap7.bean.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(value = "com.neu.cap7")
public class Cap7MainConfigOfLiveCycle {

    @Bean("person")
    public Person person() {
        return new Person("james", 20);
    }

//    针对多实例的bean 容器只负责初始化，不会管理bean 关闭时不会调用销毁方法
//    @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destory")
    public Bike bike(){
        return new Bike();
    }
}
