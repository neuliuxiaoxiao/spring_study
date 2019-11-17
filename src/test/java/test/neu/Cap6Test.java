package test.neu;

import com.neu.cap5.config.Cap5MainConfig;
import com.neu.cap6.config.Cap6MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap6Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Cap6MainConfig.class);
        System.out.println("IOC容器创建完成----");
        //此处取的是生产james的factoryBean
        Object bean1 = context.getBean("&jamesFactoryBean");
//        Object bean1 = context.getBean("jamesFactoryBean");
        System.out.println("Bean的类型"+bean1.getClass());
        //context.getBean("person");
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}
