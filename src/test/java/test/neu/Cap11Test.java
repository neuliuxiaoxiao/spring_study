package test.neu;

import com.neu.cap10.aop.Calculator;
import com.neu.cap10.config.Cap10MainConfig;
import com.neu.cap11.config.Cap11MainConfig;
import com.neu.cap11.service.OrderService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap11Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Cap11MainConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.addOrder();
    }

}
