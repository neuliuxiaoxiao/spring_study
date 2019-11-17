package com.neu.cap6.config;

import com.neu.cap6.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;

public class JamesFactoryBean implements FactoryBean<Monkey> {

    public Monkey getObject() throws Exception {
        return new Monkey();
    }

    public Class<?> getObjectType() {
        return Monkey.class;
    }
    public boolean isSingleton() {
        return true;
    }
}
