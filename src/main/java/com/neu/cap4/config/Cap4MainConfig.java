package com.neu.cap4.config;

import com.neu.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class Cap4MainConfig {

    /**
     * 懒加载 主要针对单实例bean 默认在容器启动时创建对象
     * 懒加载 容器启动时候不创建对象，仅当第一次使用bean的时候才创建初始化
     * @return
     */
    @Lazy
    @Bean
    public Person person() {
        System.out.println("给容器中添加bean...");
        return new Person("james", 20);
    }
}
