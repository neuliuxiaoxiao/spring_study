package test.neu;

import com.neu.cap7.config.Cap7MainConfigOfLiveCycle;
import com.neu.cap8.bean.Bird;
import com.neu.cap8.config.Cap8MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Cap8Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Cap8MainConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        Bird bird = (Bird) context.getBean("bird");
        System.out.println(bird);
        System.out.println("IOC容器创建完成----");

        ConfigurableEnvironment environment = context.getEnvironment();
        System.out.println("enviroment=="+environment.getProperty("bird.color"));


        context.close();
    }

}
