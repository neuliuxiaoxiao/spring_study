package com.neu.cap9.service;

import com.neu.cap9.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

@Service
public class TestService {

    //优先级 优先使用
    @Qualifier("testDao")
    @Autowired(required = false)
    //效果是一样的 与Autowired 一样可以装配
    //1 不支持Primary
    //2 不支持Autowired false
//    @Resource(name = "testDao2")
    //支持Primary  不支持require false
//    @Inject
    private TestDao testDao;

    public void println(){
        System.out.println(testDao);
    }
}
