package com.neu.cap1;

import com.neu.cap1.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MainConfig.class);
//        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("abcperson"));

        //从容器中
        String[] namesForBean = context.getBeanNamesForType(Person.class);
        for (String s : namesForBean) {
            System.out.println(s);
        }
    }
}
