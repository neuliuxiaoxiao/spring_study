package test.neu;

import com.neu.cap4.config.Cap4MainConfig;
import com.neu.cap5.config.Cap5MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap5Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Cap5MainConfig.class);
        System.out.println("IOC容器创建完成----");
        //context.getBean("person");
    }

}
