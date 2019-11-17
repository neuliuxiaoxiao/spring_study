package test.neu;

import com.neu.cap8.bean.Bird;
import com.neu.cap8.config.Cap8MainConfig;
import com.neu.cap9.bean.Moon;
import com.neu.cap9.bean.Sun;
import com.neu.cap9.config.Cap9MainConfig;
import com.neu.cap9.dao.TestDao;
import com.neu.cap9.service.TestService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Cap9Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Cap9MainConfig.class);
//        TestService testService = (TestService) context.getBean(TestService.class);
//        testService.println();
//        直接从容器中获取bean和使用autowired注解 拿到的是同一个
        //测试报错 是因为容器中没有注册进去
//        TestDao testDao = context.getBean(TestDao.class);
//        System.out.println(testDao);


//        Moon moon = context.getBean(Moon.class);
//        System.out.println(moon);
//        Sun sun = context.getBean(Sun.class);
//        System.out.println(sun.getMoon());

        context.close();
    }

}
