package com.neu.cap2.config;

import com.neu.cap1.Person;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(value = "com.neu.cap2",
//需要禁用默认加载  源码中设置useDefaultFilters为true是 默认include Component.class
//        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})}, useDefaultFilters = false)
//        includeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {OrderController.class})}, useDefaultFilters = false)
        includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, classes = {JamesTypeFilter.class})}, useDefaultFilters = false)
//需要使用默认加载
//        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})}, useDefaultFilters = true)

//@ComponentScans(@ComponentScan(value = "com.neu.cap2"))
public class Cap2MainConfig {

    //此处仅仅是让IOC容器中多一个对象
    @Bean
    public Person person() {
        return new Person("james", 20);
    }
}
