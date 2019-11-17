package test.neu;

import com.neu.cap10.aop.Calculator;
import com.neu.cap10.config.Cap10MainConfig;
import com.neu.cap9.config.Cap9MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap10Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Cap10MainConfig.class);

        Calculator c = context.getBean(Calculator.class);
        int result = c.div(4,3);
        System.out.println(result);

        context.close();
    }

}
