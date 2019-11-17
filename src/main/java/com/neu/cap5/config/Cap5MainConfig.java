package com.neu.cap5.config;

import com.neu.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class Cap5MainConfig {

    @Bean("person")
    public Person person() {
        System.out.println("给容器中添加person...");
        return new Person("james", 20);
    }

    @Conditional(WinCondition.class)
    @Bean("lison")
    public Person lison() {
        System.out.println("给容器中添加lison...");
        return new Person("lison", 58);
    }

    @Conditional(LinCondition.class)
    //bean在容器中的ID为james
    @Bean("james")
    public Person james() {
        System.out.println("给容器中添加james...");
        return new Person("james", 20);
    }
}
