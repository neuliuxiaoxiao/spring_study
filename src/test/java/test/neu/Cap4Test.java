package test.neu;

import com.neu.cap1.Person;
import com.neu.cap4.config.Cap4MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap4Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap4MainConfig.class);
        System.out.println("IOC容器创建完成");
        //context.getBean("person");
    }

}
