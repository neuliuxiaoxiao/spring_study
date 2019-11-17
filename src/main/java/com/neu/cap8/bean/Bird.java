package com.neu.cap8.bean;

import org.springframework.beans.factory.annotation.Value;

public class Bird {
    //使用@Value进行赋值  1基本字符 2SpringEL表达式 3读取配置文件
    @Value("James")
    private String name;
    @Value("#{20-2}")
    private Integer age;
    @Value("${bird.color}")
    private String color;

    public Bird() {
        super();
    }

    public Bird(String name, Integer age,String color) {
        this.name = name;
        this.age = age;
        this.color=color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
