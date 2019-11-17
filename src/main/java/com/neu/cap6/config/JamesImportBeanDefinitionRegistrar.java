package com.neu.cap6.config;

import com.neu.cap6.bean.Pig;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class JamesImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     *
     * @param importingClassMetadata 当前类的注解信息
     * @param registry BeanDefinition注册类
     *        把所有需要添加到容器中的bean加入
     */
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        boolean bean1 = registry.containsBeanDefinition("com.neu.cap6.bean.Dog");
        boolean bean2 = registry.containsBeanDefinition("com.neu.cap6.bean.Cat");
        if (bean1&&bean2){
            //对于我们要注册的bean 进行封装
            RootBeanDefinition bd = new RootBeanDefinition(Pig.class);
            registry.registerBeanDefinition("pig",bd);
        }
    }
}
