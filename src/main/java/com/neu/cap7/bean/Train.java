package com.neu.cap7.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Train implements InitializingBean, DisposableBean {
    public Train() {
        System.out.println("Train constructor ...");
    }

    //当bean销毁时调用
    public void destroy() throws Exception {
        System.out.println("Train destory...");
    }

//    当bean属性赋值和初始化完成时调用
    public void afterPropertiesSet() throws Exception {
        System.out.println("Train afterPropertiesSet...");
    }
}
