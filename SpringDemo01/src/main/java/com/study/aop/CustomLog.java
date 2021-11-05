package com.study.aop;

/**
 * 2.自定义类实现 AOP，不需要实现 Spring的API
 */
public class CustomLog {
    public void before() {
        System.out.println("【INFO---BEFORE】方法执行之前");
    }

    public void after() {
        System.out.println("【INFO---AFTER】方法执行之后");
    }
}
