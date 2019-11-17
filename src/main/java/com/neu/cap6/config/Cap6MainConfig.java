package com.neu.cap6.config;

import com.neu.cap1.Person;
import com.neu.cap5.config.LinCondition;
import com.neu.cap5.config.WinCondition;
import com.neu.cap6.bean.Cat;
import com.neu.cap6.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {Dog.class, Cat.class,JamesImportSelector.class,JamesImportBeanDefinitionRegistrar.class})
public class Cap6MainConfig {

    /**
     * 给容器中注册组件的方式
     * 1@Bean 导入第三方的类或包的组件，比如Person为第三方的类，需要在我们的IOC容器中使用
     * 2包扫描+组件的标注注解 @ComponentScan @Controller @Service @Reponsitory @Component
     * 3@Import 快速给容器导入一个组件
     *      a 容器会自动注册这个组件，bean的id为全类名
     *      b ImportSelector 是一个接口 返回需要导入到容器的组件的全类名数组
     *      c ImportBeanDefinitionRegistrar 可以手动添加组件到IOC容器，所有bean的注册可以使用BeanDefinitionRegistry
     * 4使用spring提供的FactoryBean进行注册
     * @return
     */
    @Bean("person")
    public Person person() {
        return new Person("james", 20);
    }

    @Bean
    public JamesFactoryBean jamesFactoryBean(){
        return new JamesFactoryBean();
    }

}
