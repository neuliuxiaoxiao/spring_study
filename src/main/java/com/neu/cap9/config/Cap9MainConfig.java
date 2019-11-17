package com.neu.cap9.config;

import com.neu.cap8.bean.Bird;
import com.neu.cap9.dao.TestDao;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"com.neu.cap9.controller","com.neu.cap9.service",
        "com.neu.cap9.dao","com.neu.cap9.bean"})
public class Cap9MainConfig {

    @Primary
    @Bean("testDao2")
//    @Bean("testDao2")
    public TestDao testDao(){
        TestDao testDao = new TestDao();
        testDao.setFlag("2");
        return testDao;
    }
}
