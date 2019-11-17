package com.neu.cap10.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

//日志切面类
@Aspect
public class LogAspects {

    @Pointcut("execution(public int com.neu.cap10.aop.Calculator.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        System.out.println("除法开始...参数列表是{}"+joinPoint.getSignature().getName()+joinPoint.getArgs());
    }
    @After("pointCut()")
    public void logEnd(){
        System.out.println("除法结束...");
    }
    @AfterReturning(value = "pointCut()",returning = "result")
    public void logReturn(Object result){
        System.out.println("除法正常返回...运行结果是{}"+result);
    }
    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void logException(Exception exception){
        System.out.println("除法异常...异常信息是{}"+exception);
    }
//    @Around("pointCut()")
//    public Object Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("@Around执行目标方法之前...");
//        Object obj = proceedingJoinPoint.proceed();
//        System.out.println("@Around执行目标方法之后...");
//        return obj;
//    }
}
