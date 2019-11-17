package com.neu.cap5.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinCondition implements Condition {
    /**
     *
     * @param context 判断条件可以使用的上下文(环境)
     * @param metadata 注解的信息
     * @return
     */
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //是否为Windows系统
        //能获取到IOC容器正在使用的beanfactory
        ConfigurableBeanFactory beanFactory = context.getBeanFactory();
        //获取当前环境变量
        Environment environment = context.getEnvironment();
        if (environment.getProperty("os.name").contains("linux")){
            return true;
        }
        return false;
    }
}
