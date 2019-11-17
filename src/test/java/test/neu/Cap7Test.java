package test.neu;

import com.neu.cap6.config.Cap6MainConfig;
import com.neu.cap7.config.Cap7MainConfigOfLiveCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap7Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Cap7MainConfigOfLiveCycle.class);
        System.out.println("IOC容器创建完成----");
//        context.getBean("bike");
        context.close();
    }

}
