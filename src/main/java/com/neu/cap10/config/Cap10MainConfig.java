package com.neu.cap10.config;

import com.neu.cap10.aop.Calculator;
import com.neu.cap10.aop.LogAspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 日志切面类的方法需要动态感知div方法运行
 * 通知方法:
 *      前置通知:logStart 在我们执行div之前运行@Before
 *      后置通知:logEnd  结束之后  @After
 *      返回通知:LogReturn  正常返回之后@AfterReturing
 *      异常通知:logException 出现异常后运行@AfterThrowing
 *      环绕通知:动态代理 手动执行joinPoint.procced()  @Around
 */
@Configuration
@EnableAspectJAutoProxy
public class Cap10MainConfig {
    @Bean
    public Calculator calculator(){
        return new Calculator();
    }
    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }
}
